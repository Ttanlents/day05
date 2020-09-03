# 	day15【线程、锁机制、lock锁、监视器】

# 第一章 多线程

我们在之前，学习的程序在没有跳转语句的前提下，都是由上至下依次执行，那现在想要设计一个程序，边打游戏边听歌，怎么设计？

要解决上述问题,咱们得使用多进程或者多线程来解决.

## 1.1 并发与并行

- **并发**：指两个或多个事件在**同一个时间段内**发生。
- **并行**：指两个或多个事件在**同一时刻**发生（同时发生）。

![](img/1.png)

在操作系统中，安装了多个程序，并发指的是在一段时间内宏观上有多个程序同时运行，这在单 CPU 系统中，每一时刻只能有一道程序执行，即微观上这些程序是分时的交替运行，只不过是给人的感觉是同时运行，那是因为分时交替运行的时间是非常短的。

而在多个 CPU 系统中，则这些可以并发执行的程序便可以分配到多个处理器上（CPU），实现多任务并行执行，即利用每个处理器来处理一个可以并发执行的程序，这样多个程序便可以同时执行。目前电脑市场上说的多核 CPU，便是多核处理器，核 越多，并行处理的程序越多，能大大的提高电脑运行的效率。

> 注意：单核处理器的计算机肯定是不能并行的处理多个任务的，只能是多个任务在单个CPU上并发运行。同理,线程也是一样的，从宏观角度上理解线程是并行运行的，但是从微观角度上分析却是串行运行的，即一个线程一个线程的去运行，当系统只有一个CPU时，线程会以某种顺序执行多个线程，我们把这种情况称之为线程调度。

## 1.2 线程与进程

- **进程**：是指一个内存中运行的应用程序，每个进程都有一个独立的内存空间，一个应用程序可以同时运行多个进程；进程也是程序的一次执行过程，是系统运行程序的基本单位；系统运行一个程序即是一个进程从创建、运行到消亡的过程。

- **线程**：线程是进程中的一个执行单元，负责当前进程中程序的执行，一个进程中至少有一个线程。一个进程中是可以有多个线程的，这个应用程序也可以称之为多线程程序。 

  简而言之：一个程序运行后至少有一个进程，一个进程中可以包含多个线程 

我们可以再电脑底部任务栏，右键----->打开任务管理器,可以查看当前任务的进程：

**进程**

![](img/2.png)

**线程**

![](img/3.png)

**线程调度:**

- 分时调度

  所有线程轮流使用 CPU 的使用权，平均分配每个线程占用 CPU 的时间。

- 抢占式调度

  优先让优先级高的线程使用 CPU，如果线程的优先级相同，那么会随机选择一个(线程随机性)，Java使用的为

  抢占式调度。

  - 设置线程的优先级

  ![设置线程优先级](img/4.png)

  - 抢占式调度详解

    大部分操作系统都支持多进程并发运行，现在的操作系统几乎都支持同时运行多个程序。比如：现在我们上课一边使用编辑器，一边使用录屏软件，同时还开着画图板，dos窗口等软件。此时，这些程序是在同时运行，”感觉这些软件好像在同一时刻运行着“。

  实际上，CPU(中央处理器)使用抢占式调度模式在多个线程间进行着高速的切换。对于CPU的一个核而言，某个时刻，只能执行一个线程，而 CPU的在多个线程间切换速度相对我们的感觉要快，看上去就是在同一时刻运行。
    其实，多线程程序并不能提高程序的运行速度，但能够提高程序运行效率，让CPU的使用率更高。

    ![抢占式调度](img/6.png)

# 第二章 线程

## 2.1 Thread类常用方法

**构造方法：**

- `public Thread()`:分配一个新的线程对象。
- `public Thread(String name)`:分配一个指定名字的新的线程对象。
- `public Thread(Runnable target)`:分配一个带有指定目标新的线程对象。
- `public Thread(Runnable target,String name)`:分配一个带有指定目标新的线程对象并指定名字。

**常用方法：**

- `public String getName()`:获取当前线程名称。
- `public void start()`:导致此线程开始执行; Java虚拟机调用此线程的run方法。
- `public void run()`:此线程要执行的任务在此处定义代码。
- `public static void sleep(long millis)`:使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
- `public static Thread currentThread()  `:返回对当前正在执行的线程对象的引用。

## 2.2 创建线程方式一

继承Thread类

Java使用`java.lang.Thread`类代表**线程**，所有的线程对象都必须是Thread类或其子类的实例。每个线程的作用是完成一定的任务，实际上就是执行一段程序流即一段顺序执行的代码。Java使用线程执行体来代表这段程序流。Java中通过继承Thread类来**创建**并**启动多线程**的步骤如下：

1. 定义Thread类的子类，并重写该类的run()方法，该run()方法的方法体就代表了线程需要完成的任务,因此把run()方法称为线程执行体。
2. 创建Thread子类的实例，即创建了线程对象
3. 调用线程对象的start()方法来启动该线程，不是调用run()方法，切记！！！

代码如下：

测试类：

```java
public class Demo01 {
	public static void main(String[] args) {
		//创建自定义线程对象
		MyThread mt = new MyThread("新的线程");
		//开启新线程
		mt.start();
		//在主方法中执行for循环
		for (int i = 0; i < 10; i++) {
			System.out.println("main线程！"+i);
		}
	}
}
```

自定义线程类：

```java
public class MyThread extends Thread {
	//定义指定线程名称的构造方法
	public MyThread(String name) {
		//调用父类的String参数的构造方法，指定线程的名称
		super(name);
	}
	/**
	 * 重写run方法，完成该线程执行的逻辑
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+"：正在执行"+i);
		}
	}
}
```

## 2.3 创建线程方式二

实现Runnable接口

采用`java.lang.Runnable`也是非常常见的一种，我们只需要重写run方法即可。

步骤如下：

1. 定义Runnable接口的实现类，并重写该接口的run()方法，该run()方法的方法体同样是该线程的线程执行体。
2. 创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正的线程对象。
3. 调用线程对象的start()方法来启动线程。

代码如下：

```java
public class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
```

```java
public class Demo {
    public static void main(String[] args) {
        //创建自定义类对象  线程任务对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t = new Thread(mr, "小强");
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("旺财 " + i);
        }
    }
}
```

通过实现Runnable接口，使得该类有了多线程类的特征。run()方法是多线程程序的一个执行目标。所有的多线程代码都在run方法里面。Thread类实际上也是实现了Runnable接口的类。

在启动的多线程的时候，需要先通过Thread类的构造方法Thread(Runnable target) 构造出对象，然后调用Thread对象的start()方法来运行多线程代码。

实际上所有的多线程代码都是通过运行Thread的start()方法来运行的。因此，不管是继承Thread类还是实现Runnable接口来实现多线程，最终还是通过Thread的对象的API来控制线程的，熟悉Thread类的API是进行多线程编程的基础。

> tips:Runnable对象仅仅作为Thread对象的target，Runnable实现类里包含的run()方法仅作为线程执行体。而实际的线程对象依然是Thread实例，只是该Thread线程负责执行其target的run()方法。

## 2.4 多线程原理

我们先画个多线程执行时序图来体现一下多线程程序的执行流程。

代码如下：

自定义线程类：

~~~javascript
public class MyThread extends Thread{
	/*
	 * 利用继承中的特点 
	 *   将线程名称传递  进行设置
	 */
	public MyThread(String name){
		super(name);
	}
	/*
	 * 重写run方法
	 *  定义线程要执行的代码
	 */
	public void run(){		
		for (int i = 0; i < 20; i++) {
			//getName()方法 来自父亲
			System.out.println(getName()+i);
		}
	}
}
~~~

测试类：

~~~java
public class Demo {
    public static void main(String[] args) {
      	System.out.println("这里是main线程");
    	MyThread mt = new MyThread("小强");    	
    	mt.start();//开启了一个新的线程
    	for (int i = 0; i < 20; i++) {
			System.out.println("旺财:"+i);
		}
	}
}	
~~~

流程图：

![](img\线程流程图.png)

程序启动运行main时候，java虚拟机启动一个进程，主线程main在main()调用时候被创建。随着调用mt的对象的start方法，另外一个新的线程也启动了，这样，整个应用就在多线程下运行。

通过这张图我们可以很清晰的看到多线程的执行流程，那么为什么可以完成并发执行呢？我们再来讲一讲原理。

多线程执行时，到底在内存中是如何运行的呢？以上个程序为例，进行图解说明：

多线程执行时，在栈内存中，其实**每一个执行线程都有一片自己所属的栈内存空间**。进行方法的压栈和弹栈。

![](img/10.png)

当执行线程的任务结束了，线程自动在栈内存中释放了。但是当所有的执行线程都结束了，那么进程就结束了。

## 2.5 Thread和Runnable的区别

如果一个类继承Thread，则不适合资源共享。但是如果实现了Runable接口的话，则很容易的实现资源共享。

**总结：**

**实现Runnable接口比继承Thread类所具有的优势：**

1. 适合多个相同的程序代码的线程去共享同一个资源。
2. 可以避免java中的单继承的局限性。
3. 增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立。
4. 线程池只能放入实现Runable或Callable类线程，不能直接放入继承Thread的类。

> 扩充：在java中，每次程序运行至少启动2个线程。一个是main线程，一个是垃圾收集线程。因为每当使用java命令执行一个类的时候，实际上都会启动一个JVM，每一个JVM其实在就是在操作系统中启动了一个进程。

## 2.6 匿名内部类方式实现线程的创建

使用线程的内匿名内部类方式，可以方便的实现每个线程执行不同的线程任务操作。

使用匿名内部类的方式实现Runnable接口，重新Runnable接口中的run方法：

~~~java
public class NoNameInnerClassThread {
   	public static void main(String[] args) {
        //方式一
        Thread thread = new Thread("小强") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName() + "：正在执行" + i);
                }
            }
        };
        thread.start();
        //方式二
		Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        Thread thread=new Thread(runnable,"小强");
        thread.start();

        for (int i = 0; i < 20; i++) {
          	System.out.println("旺财:"+i);
        }
   	}
}
~~~

## 2.7 线程的操作

### 线程的睡眠

- `public static void sleep(long millis)`：让当前线程睡眠指定的毫秒数

```java
package com.dfbz.demo;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    //当i等于50的时候让当前线程睡眠1秒钟(1000毫秒)
                    if (i == 50) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }.run();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        }.run();
    }
}
```

### 线程加入

多条线程时，当指定线程调用join方法时，线程执行权交给该线程，并且当前线程必须等该线程执行完毕之后才会执行但有可能被其他线程抢去CPU执行权.

`public final void join()`：让线程在当前线程优先执行,直至t线程执行完毕时,再执行当前线程.

`public final void join(long millis)`：让线程执行millis毫秒,再执行其他线程

```java
package com.dfbz.demo;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

        //创建线程1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {

                    System.out.println("线程1:" + i);
                }
            }
        });

        //创建线程2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("线程2:" + i);
                    if (i == 500) {
                        try {
                            //当i等于500的时候,让t1线程加入执行,直至执行完毕
//                            t1.join();
                            //当i等于500的时候,让t1线程加入执行,执行10毫秒之后交出执行权
                            t1.join(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        });

        t1.start();
        t2.start();

    }
}
```

### 守护线程

当用户线程(非守护线程)执行完毕时，守护线程也会停止执行但由于CPU运行速度太快，当用户线程执行完毕时，将信息传递给守护线程，会有点时间差，而这些时间差会导致还会执行一点守护线程

不管开启多少个线程(用户线程),守护线程总是随着第一个用户线程的停止而停止

`public final void setDaemon(boolean on)`：设置线程是否为守护线程

```java
package com.dfbz.demo;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<2000;i++){
                    System.out.println("守护线程1: "+i);
                }
            }
        });

        //将t1设置为守护线程
        t1.setDaemon(true);

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){

                    System.out.println("用户线程2: "+i);
                }
            }
        });

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){

                    System.out.println("用户线程3: "+i);
                }
            }
        });

        //开启三条线程,如果t2执行完毕,那么守护线程也会停止
        t1.start();
        t2.start();
        t3.start();
    }
}
```

### 线程优先级

- `public final void setPriority(int newPriority)`：设置线程的优先级，线程优先级默认为5  最高为10  最低为1，如果不在这个范围之内则会抛出.不合法参数异常(IllegalArgumentException)线程优先级高的,更容易让线程在就绪状态中抢到线程执行权,变成执行状态.但是 线程优先级高 也不一定执行的就多.也有可能优先级低的优先执行完毕

```java
package com.dfbz.demo;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("线程1: "+i);
                }
            }
        });


        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("线程2: "+i);
                }
            }
        });
        
        //设置优先级
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
```

### 线程礼让

- `public static void yield()`：线程礼让，告知当前线程可以将执行权礼让给其他线程，礼让给优先级相对高一点的线程，但仅仅是一种告知,并不是强制将执行权转让给其他线程.也有可能下次的执行权还在原线程这里。如果想让原线程强制让出执行权  可以使用join()方法

```java
package com.dfbz.demo;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("线程1: " + i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if(i==10){
                        //当i等于10的时候该线程礼让,但是不一定会交出线程执行权
                        Thread.yield();
                    }
                    System.out.println("线程2: " + i);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
```



# 第三章 线程安全

## 3.1 线程安全

如果有多个线程在同时运行，而这些线程可能会同时运行这段代码。程序每次运行结果和单线程运行的结果是一样的，而且其他的变量的值也和预期的是一样的，就是线程安全的。

我们通过一个案例，演示线程的安全问题：

电影院要卖票，我们模拟电影院的卖票过程。假设要播放的电影是 “走进东方标准”，本次电影的座位共100个(本场电影只能卖100张票)。

我们来模拟电影院的售票窗口，实现多个窗口同时卖 “葫芦娃大战奥特曼”这场电影票(多个窗口一起卖这100张票)

需要窗口，采用线程对象来模拟；需要票，Runnable接口子类来模拟

模拟票：

~~~java
package com.dfbz.demo;

public class Ticket implements Runnable {

    //票数
    Integer num = 100;

    @Override
    public void run() {
        while (true) {
            if (num <= 0) {
                System.out.println("票卖完了");
                break;
            }
            System.out.println(Thread.currentThread().getName() + "：正在卖第：" + num + "张票");
            num--;
        }
    }
}

~~~

测试类：

~~~java
package com.dfbz.demo;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
		
        Ticket ticket=new Ticket();
        //开启三个窗口,买票
        Thread t = new Thread(ticket, "广州南");
        Thread t2 = new Thread(ticket, "深圳北");
        Thread t3 = new Thread(ticket, "武汉");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
~~~

结果中有一部分这样现象：

![](img\11.png)

发现程序出现了两个问题：

1. 有的票卖了多次
2. 卖票顺序不一致

这种问题，几个窗口(线程)票数不同步了，这种问题称为线程不安全。

> 线程安全问题都是由全局变量及静态变量引起的。若每个线程中对全局变量、静态变量只有读操作，而无写操作，一般来说，这个全局变量是线程安全的；若有多个线程同时执行写操作，一般都需要考虑线程同步，否则的话就可能影响线程安全。

## 3.2 线程同步

当我们使用多个线程访问同一资源的时候，且多个线程中对资源有写的操作，就容易出现线程安全问题。

要解决上述多线程并发访问一个资源的安全性问题:也就是解决重复票与不存在票问题，Java中提供了同步机制(**synchronized**)来解决。

根据案例简述：

~~~
窗口1线程进入操作的时候，窗口2和窗口3线程只能在外等着，窗口1操作结束，窗口1和窗口2和窗口3才有机会进入代码去执行。也就是说在某个线程修改共享资源的时候，其他线程不能修改该资源，等待修改完毕同步之后，才能去抢夺CPU资源，完成对应的操作，保证了数据的同步性，解决了线程不安全的现象。
~~~

为了保证每个线程都能正常执行原子操作,Java引入了线程同步机制。

那么怎么去使用呢？有三种方式完成同步操作：

1. 同步代码块。
2. 同步方法。
3. 锁机制。

### 3.1.1同步代码块

* **同步代码块**：`synchronized`关键字可以用于方法中的某个区块中，表示只对这个区块的资源实行互斥访问。

格式: 

~~~java
synchronized(同步锁){
     需要同步操作的代码
}
~~~

**同步锁**:

对象的同步锁只是一个概念,可以想象为在对象上标记了一个锁.

1.  锁对象 可以是任意类型。

2.  多个线程对象  要使用同一把锁。


> 注意:在任何时候,最多允许一个线程拥有同步锁,谁拿到锁就进入代码块,其他的线程只能在外等着(BLOCKED)。

使用同步代码块解决代码：

~~~java
package com.dfbz.demo;

public class Ticket implements Runnable {

    //票数
    Integer num = 100;

    //锁对象
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //可以锁this吗？
            //synchronized (this) {
            //加上同步代码块,把需要同步的代码放入代码块中,同步代码块中的锁对象必须保证一致！
            synchronized (obj) {
                if (num <= 0) {
                    System.out.println("票卖完了");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "：正在卖第：" + num + "张票");
                num--;
            }
        }
    }
}

~~~

当使用了同步代码块后，上述的线程的安全问题，解决了。

案例：输出"犯我中华者，虽远必诛"

要么输出"犯我中华者"，要么输出"虽远必诛"

```java
package com.dfbz.demo3;

public class Demo1 {
    public static void main(String[] args) {
        //锁对象
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 100; i++) {
                    //加上同步代码块锁住
                    synchronized (obj) {
                        System.out.print("犯");
                        System.out.print("我");
                        System.out.print("中");
                        System.out.print("华");
                        System.out.print("者");
                        System.out.println();
                    }
                }

            }
        }.start();

        new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 100; i++) {
                    //加上同步代码块锁住
                    synchronized (obj) {
                        System.out.print("虽");
                        System.out.print("远");
                        System.out.print("必");
                        System.out.print("诛");
                        System.out.println();
                    }
                }
            }
        }.start();
    }
}
```

### 3.1.2 同步方法

* **同步方法**:使用synchronized修饰的方法,就叫做同步方法,保证A线程执行该方法的时候,其他线程只能在方法外等着。

格式：

~~~java
public synchronized void method(){
   	可能会产生线程安全问题的代码
}
~~~

> 同步锁是谁?
>
> ​      对于非static方法,同步锁就是this。  
>
> ​      对于static方法,我们使用当前方法所在类的字节码对象(类名.class)。

使用同步方法代码如下：

```java
public class Ticket implements Runnable {

    //票数
    Integer num = 100;

    @Override
    public synchronized void run() {
        while (true) {
            if (num <= 0) {
                System.out.println("票卖完了");
                break;
            }
            System.out.println(Thread.currentThread().getName() + "：正在卖第：" + num + "张票");
            num--;
        }
    }
}
```

案例：

~~~java
package com.dfbz.demo3;

public class Demo2 {
    public static void main(String[] args) {
        Shower s = new Shower();
		
        //开启线程1调用show方法
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    s.show();
                }
            }
        }.start();

        //开启线程2调用show2方法
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    s.show2();
                }
            }
        }.start();

    }
}

class Shower {
    Object obj = new Object();

    //非静态同步方法的锁对象默认是this
    public synchronized void show() {

        System.out.print("犯");
        System.out.print("我");
        System.out.print("中");
        System.out.print("华");
        System.out.print("者");
        System.out.println();
    }

    public void show2() {
        //使用this锁也能够保证代码同步
        synchronized (this){
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
        }
    }

}

~~~

### 3.1.3 Lock锁

`java.util.concurrent.locks.Lock`机制提供了比**synchronized**代码块和**synchronized**方法更广泛的锁定操作,同步代码块/同步方法具有的功能Lock都有,除此之外更强大,更体现面向对象。

Lock锁也称同步锁，加锁与释放锁方法化了，如下：

* `public void lock() `:加同步锁。
* `public void unlock()`:释放同步锁。

使用如下：

```java
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {

    //票数
    Integer num = 100;

    //创建锁对象
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //开启锁
            lock.lock();
            if (num <= 0) {
                System.out.println("票卖完了");
                //释放锁
                lock.unlock();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "：正在卖第：" + num + "张票");
            num--;
            //释放锁
            lock.unlock();
        }
    }
}
```

案例：

~~~java
package com.dfbz.demo;

import java.util.concurrent.locks.ReentrantLock;

public class Demo1 {
    public static void main(String[] args) {
        //创建锁对象
        ReentrantLock lock = new ReentrantLock();

        new Thread() {
            @Override
            public void run() {


                while (true) {
                    //开启锁
                    lock.lock();
                    System.out.print("虽");
                    System.out.print("远");
                    System.out.print("必");
                    System.out.print("诛");
                    System.out.println();
                    //释放锁
                    lock.unlock();
                }
            }
        }.start();


        new Thread() {
            @Override
            public void run() {

                while (true) {
                    //开启锁
                    lock.lock();
                    System.out.print("犯");
                    System.out.print("我");
                    System.out.print("中");
                    System.out.print("华");
                    System.out.print("者");
                    System.out.println();
                    
                    //释放锁
                    lock.unlock();
                }

            }
        }.start();
    }
}
~~~

### 3.1.4综合案例

```java
//票的实体类
public class TicketBean {

    //票面信息
    private String name;
    //数量
    private int num;
    
    //get() set() 构造器省略
}
```

```java
public class Ticket implements Runnable {

    //票实体类
    private TicketBean ticketBean = new TicketBean();

    public Ticket(TicketBean ticketBean) {
        this.ticketBean = ticketBean;
    }

    @Override
    public void run() {
        while (true) {
            //锁票
            synchronized (ticketBean) {
                int num = ticketBean.getNum();
                if (num <= 0) {
                    System.out.println("票卖完了");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "：正在卖" + ticketBean.getName() + ",票号：" + num);
                ticketBean.setNum(num - 1);
            }
        }
    }
}
```

```java
//测试
public static void main(String[] args) throws Exception {
		
        TicketBean ticketBean=new TicketBean("G9527",100);
        Ticket ticket = new Ticket(ticketBean);
        Thread t = new Thread(ticket, "广州南");
        Thread t2 = new Thread(ticket, "深圳北");
        Thread t3 = new Thread(ticket, "武汉");
        t.start();
        t2.start();
        t3.start();

    }
```

## 3.6 线程死锁问题

多线程同步的时候, 如果同步代码嵌套, 使用相同锁, 就有可能出现死锁

案例代码：

```java
package com.dfbz.demo;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";
        new Thread() {
            public void run() {
                while (true) {
                    synchronized (s1) {
                        System.out.println(this.getName() + "s1");
                        synchronized (s2) {
                            System.out.println(this.getName() + "s2");
                        }
                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                while (true) {
                    /*
					当线程0拿到s1执行s1中的打印语句时,如果线程切换到线程1  
					那么线程1拿到了s2锁对象,此时就造成了线程死锁
					线程1想执行s1锁里面的代码执行不了,因为s1在线程0中还没有释放
					那么此时线程1就会切换到线程0
                    线程0也不会执行s2锁里面的代码,因为此时s2已经被线程0中的锁拿去了
                    还没有释放,因此造成了线程的死锁  
                    两个都没有释放  都卡住了  线程就卡住了
                     */
                    synchronized (s2) {
                        System.out.println(this.getName() + "s2");
                        synchronized (s1) {
                            System.out.println(this.getName() + "s1");
                        }
                    }
                }
            }
        }.start();
    }
}
```

# 第四章线程状态

## 3.1 线程状态概述

当线程被创建并启动以后，它既不是一启动就进入了执行状态，也不是一直处于执行状态。在线程的生命周期中，有几种状态呢？在API中`java.lang.Thread.State`这个枚举中给出了六种线程状态：

这里先列出各个线程状态发生的条件，下面将会对每种状态进行详细解析

| 线程状态                | 导致状态发生条件                                             |
| ----------------------- | ------------------------------------------------------------ |
| NEW(新建)               | 线程刚被创建，但是并未启动。还没调用start方法。              |
| Runnable(可运行)        | 线程可以在java虚拟机中运行的状态，可能正在运行自己代码，也可能没有，这取决于操作系统处理器。 |
| Blocked(锁阻塞)         | 当一个线程试图获取一个对象锁，而该对象锁被其他的线程持有，则该线程进入Blocked状态；当该线程持有锁时，该线程将变成Runnable状态。 |
| Waiting(无限等待)       | 一个线程在等待另一个线程执行一个（唤醒）动作时，该线程进入Waiting状态。进入这个状态后是不能自动唤醒的，必须等待另一个线程调用notify或者notifyAll方法才能够唤醒。 |
| Timed Waiting(计时等待) | 同waiting状态，有几个方法有超时参数，调用他们将进入Timed Waiting状态。这一状态将一直保持到超时期满或者接收到唤醒通知。带有超时参数的常用方法有Thread.sleep 、Object.wait。 |
| Teminated(被终止)       | 因为run方法正常退出而死亡，或者因为没有捕获的异常终止了run方法而死亡。 |

我们不需要去研究这几种状态的实现原理，我们只需知道在做线程操作中存在这样的状态。那我们怎么去理解这几个状态呢，新建与被终止还是很容易理解的，我们就研究一下线程从Runnable（可运行）状态与非运行状态之间的转换问题。

## 3.2 Timed Waiting（计时等待）

Timed Waiting在API中的描述为：一个正在限时等待另一个线程执行一个（唤醒）动作的线程处于这一状态。单独的去理解这句话，真是玄之又玄，其实我们在之前的操作中已经接触过这个状态了，在哪里呢？

在我们写卖票的案例中，为了减少线程执行太快，现象不明显等问题，我们在run方法中添加了sleep语句，这样就强制当前正在执行的线程休眠（**暂停执行**），以“减慢线程”。

其实当我们调用了sleep方法之后，当前执行的线程就进入到“休眠状态”，其实就是所谓的Timed Waiting(计时等待)，那么我们通过一个案例加深对该状态的一个理解。

**实现一个计数器，计数到100，在每个数字之间暂停1秒，每隔10个数字输出一个字符串**

代码：

```java
public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            if ((i) % 10 == 0) {
                System.out.println("-------" + i);
            }
            System.out.print(i);
            try {
                Thread.sleep(1000);
              	System.out.print("    线程睡眠1秒！\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new MyThread().start();
    }
}
```

通过案例可以发现，sleep方法的使用还是很简单的。我们需要记住下面几点：

1. 进入 TIMED_WAITING 状态的一种常见情形是调用的 sleep 方法，单独的线程也可以调用，不一定非要有协作关系。
2. 为了让其他线程有机会执行，可以将Thread.sleep()的调用**放线程run()之内**。这样才能保证该线程执行过程中会睡眠
3. sleep与锁无关，线程睡眠到期自动苏醒，并返回到Runnable（可运行）状态。

> 小提示：sleep()中指定的时间是线程不会运行的最短时间。因此，sleep()方法不能保证该线程睡眠到期后就开始立刻执行。

Timed Waiting 线程状态图：![](E:/%E8%AF%BE%E4%BB%B6/01_JavaSE%E3%80%901-25%E3%80%91/day17%E3%80%90%E7%BA%BF%E7%A8%8B%E3%80%81%E5%90%8C%E6%AD%A5%E3%80%91/%E8%AE%B2%E4%B9%89/img/%E8%AE%A1%E6%97%B6%E7%AD%89%E5%BE%85.png)

## 3.3 BLOCKED（锁阻塞）

Blocked状态在API中的介绍为：一个正在阻塞等待一个监视器锁（锁对象）的线程处于这一状态。

我们已经学完同步机制，那么这个状态是非常好理解的了。比如，线程A与线程B代码中使用同一锁，如果线程A获取到锁，线程A进入到Runnable状态，那么线程B就进入到Blocked锁阻塞状态。

这是由Runnable状态进入Blocked状态。除此Waiting以及Time Waiting状态也会在某种情况下进入阻塞状态，而这部分内容作为扩充知识点带领大家了解一下。

Blocked 线程状态图![](E:/%E8%AF%BE%E4%BB%B6/01_JavaSE%E3%80%901-25%E3%80%91/day17%E3%80%90%E7%BA%BF%E7%A8%8B%E3%80%81%E5%90%8C%E6%AD%A5%E3%80%91/%E8%AE%B2%E4%B9%89/img/%E9%94%81%E9%98%BB%E5%A1%9E.png)



## 3.4 Waiting（无限等待）

Wating状态在API中介绍为：一个正在无限期等待另一个线程执行一个特别的（唤醒）动作的线程处于这一状态。

那么我们之前遇到过这种状态吗？答案是并没有，但并不妨碍我们进行一个简单深入的了解。我们通过一段代码来学习一下：

案例一：

```java
public class MyRun1 implements Runnable {

    private Entity entity;

    public MyRun1(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (entity) {
                System.out.println("线程1进入等待状态");
                try {
                     //无限等待
                    entity.wait();
                    //1000毫秒后会自动醒来
                    //entity.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1被唤醒了");
            }
        }
    }
}
```

```java
public class MyRun2 implements Runnable {

    private Entity entity;

    public MyRun2(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (entity) {
                System.out.println("线程2开始唤醒");
                entity.notifyAll();
            }
        }
    }
}
```

```java
public class Entity {

    private String name;

}
```

```java
public static void main(String[] args) {
        Entity entity = new Entity();

        MyRun1 run1 = new MyRun1(entity);
        Thread thread = new Thread(run1);
        thread.start();

        MyRun2 run2 = new MyRun2(entity);
        Thread thread2 = new Thread(run2);
        thread2.start();

    }
```

案例二(匿名内部类)：

```java
public class WaitingTest {
    public static Object obj = new Object();

    public static void main(String[] args) {
        // 演示waiting
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        try {
                            System.out.println( Thread.currentThread().getName() +"=== 获取到锁对象，调用wait方法，进入waiting状态，释放锁对象");
                            obj.wait();  //无限等待
                            //obj.wait(5000); //计时等待, 5秒 时间到，自动醒来

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println( Thread.currentThread().getName() + "=== 从waiting状态醒来，获取到锁对象，继续执行了");
                    }
                }
            }
        },"等待线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
//                while (true){   //每隔3秒 唤醒一次

                    try {
                        System.out.println( Thread.currentThread().getName() +"----- 等待3秒钟");
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (obj){
                        System.out.println( Thread.currentThread().getName() +"----- 获取到锁对象,调用notify方法，释放锁对象");
                        obj.notify();
                    }
                }
//            }
        },"唤醒线程").start();
    }
}
```

通过上述案例我们会发现，一个调用了某个对象的 Object.wait 方法的线程会等待另一个线程调用此对象的 Object.notify()方法 或 Object.notifyAll()方法。

其实waiting状态并不是一个线程的操作，它体现的是多个线程间的通信，可以理解为多个线程之间的协作关系，多个线程会争取锁，同时相互之间又存在协作关系。就好比在公司里你和你的同事们，你们可能存在晋升时的竞争，但更多时候你们更多是一起合作以完成某些任务。

当多个线程协作时，比如A，B线程，如果A线程在Runnable（可运行）状态中调用了wait()方法那么A线程就进入了Waiting（无限等待）状态，同时失去了同步锁。假如这个时候B线程获取到了同步锁，在运行状态中调用了notify()方法，那么就会将无限等待的A线程唤醒。注意是唤醒，如果获取到锁对象，那么A线程唤醒后就进入Runnable（可运行）状态；如果没有获取锁对象，那么就进入到Blocked（锁阻塞状态）。

Waiting 线程状态图![](E:/%E8%AF%BE%E4%BB%B6/01_JavaSE%E3%80%901-25%E3%80%91/day17%E3%80%90%E7%BA%BF%E7%A8%8B%E3%80%81%E5%90%8C%E6%AD%A5%E3%80%91/%E8%AE%B2%E4%B9%89/img/%E6%97%A0%E9%99%90%E7%AD%89%E5%BE%85.png)

wait()和notify()的总结：

public final void wait()`：让当前线程进入等待状态(并不是当前线程对象来调用,而是当前锁对象来调用)
调用wait()之后释放当前锁,并且让当前锁对象中对应的线程阻塞.

`public final void notify()`：随机唤醒一条此锁对象对应线程中的一条.notify()也是锁对象来调用,并不是当前线程对象调用

因为wait需要释放锁，所以必须在synchronized中使用，没有锁时使用会抛出IllegalMonitorStateException（正在等待的对象没有锁）

wait():方法必须配合同步锁使用,同步锁中的对象是谁  那么就用谁来调用wait方法
必须要是多个线程执行多个任务的时候才能体现出等待线程和唤醒线程的作用

**调用wait和notify方法需要注意的细节**

1. wait方法与notify方法必须要由同一个锁对象调用。因为：对应的锁对象可以通过notify唤醒使用同一个锁对象调用的wait方法后的线程。
2. wait方法与notify方法是属于Object类的方法的。因为：锁对象可以是任意对象，而任意对象的所属类都是继承了Object类的。
3. wait方法与notify方法必须要在同步代码块或者是同步函数中使用。因为：必须要通过锁对象调用这2个方法。

## 3.5 补充知识点

到此为止我们已经对线程状态有了基本的认识，想要有更多的了解，详情可以见下图：

![](E:/%E8%AF%BE%E4%BB%B6/01_JavaSE%E3%80%901-25%E3%80%91/day17%E3%80%90%E7%BA%BF%E7%A8%8B%E3%80%81%E5%90%8C%E6%AD%A5%E3%80%91/%E8%AE%B2%E4%B9%89/img/%E7%BA%BF%E7%A8%8B%E7%8A%B6%E6%80%81%E5%9B%BE.png)

> 一条有意思的tips:
>
> 我们在翻阅API的时候会发现Timed Waiting（计时等待） 与 Waiting（无限等待） 状态联系还是很紧密的，比如Waiting（无限等待） 状态中wait方法是空参的，而timed waiting（计时等待） 中wait方法是带参的。这种带参的方法，其实是一种倒计时操作，相当于我们生活中的小闹钟，我们设定好时间，到时通知，可是如果提前得到（唤醒）通知，那么设定好时间在通知也就显得多此一举了，那么这种设计方案其实是一举两得。如果没有得到（唤醒）通知，那么线程就处于Timed Waiting状态,直到倒计时完毕自动醒来；如果在倒计时期间得到（唤醒）通知，那么线程从Timed Waiting状态立刻唤醒。



