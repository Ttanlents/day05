# day10【权限修饰符、内部类、Lambda表达式】

# 【今日内容】

- **掌握final关键字的使用**
- **掌握Java中的权限修饰符**
- **掌握匿名内部类**
- **掌握Jdk1.8新特性：Lambad表达式**

------

# 第一章 final关键字

## 1.1 概述

学习了继承后，我们知道，子类可以在父类的基础上改写父类内容，比如，方法重写。那么我们能不能随意的继承
API中提供的类，改写其内容呢？显然这是不合适的。为了避免这种随意改写的情况，Java提供了 final 关键字，
用于修饰不可**改变**内容。

- **final**： 不可改变。可以用于修饰类、方法和变量。
  - **类**：被修饰的类，不能被继承。
  - **方法**：被修饰的方法，不能被重写。
  - **变量**：被修饰的变量，不能被重新赋值。

## 1.2 使用方式

### 修饰类

final修饰的类，不能被继承。

格式如下：

```java
final class Fu{
    
}
class Zi extends Fu{}		//被final修饰的类不能被继承
```

查询API发现像 `public final class String` 、 `public final class Math` 、 `public final class Scanner`
等，很多我们学习过的类，都是被final修饰的，目的就是供我们使用，而不让我们所以改变其内容。

### 修饰方法

final修饰的方法，不能被重写。 格式如下：

格式：

```java
修饰符 final 返回值类型 方法名(参数列表){
    //方法体
}
```

代码：

```java
class Fu{
    public void show1(){

    }
    public final void show2(){          //加了final修饰的方法不能被子类重写

    }
}
class Zi extends Fu{
    @Override
    public void show1(){

    }
/*    
    public void show2(){        //不能重写final修饰的方法
        
    }
    */
}
```

### 修饰变量

1. **局部变量——基本类型**

   基本类型的局部变量，被final修饰后，只能赋值一次，不能再更改。代码如下：

```java
public static void main(String[] args) {

    //声明成员变量,使用final修饰
    final int a;
    //第一次赋值
    a=10;

    //第二次赋值
    //        a=20;           //报错,不能重新赋值

    //声明变量，直接赋值
    final int b=10;

    //第二次赋值
    //b=20;       //报错,被final修饰的变量不能直接赋值

}
```

思考，如下两种写法，哪种可以通过编译？

写法1：

```java
final int c=0;
for(int i=0;i<10;i++){
    c=i;
    System.out.println(c);
}
```

写法2：

```java
for(int i=0;i<10;i++){
    final int c=i;
    System.out.println(c);
}
```

根据 `final` 的定义，写法1报错！写法2，为什么通过编译呢？因为每次循环，都是一次新的变量c。这也是大家
需要注意的地方。

2. **局部变量——引用类型**

   引用类型的局部变量，被`final`修饰后，只能指向一个对象，地址不能再更改。但是不影响对象内部的成员变
   量值的修改，代码如下：

```java
public static void main(String[] args) {
    //创建Person对象
    final Person p=new Person();
    //        p=new Person();       //被final修饰的对象不可指向其他地址值
    p.setName("张三");        //可以修改此对象的属性值
}
```

3. **成员变量**

   成员变量涉及到初始化的问题，初始化方式有两种，只能二选一：

- 显示初始化(在定义成员变量的时候立马赋值)；

```java
public class Student{
    final int num=10;
}
```

- 构造方法初始化(在构造方法中赋值一次)。

```java
class Student{
    final int num=10;
    final int num2;
    public Student (){
        this.num2=20;
        //赋值一次后，不可再次赋值
//        this.num2=30;
    }
    public Student(int i){      //如果有多个构造方法,那么所有的构造方法中必须都得给num2赋值
        this.num2=30;
    }
}
```

> 被final修饰的常量名称，一般都有书写规范，所有字母都**大写**。

# 第二章 权限修饰符

## 2.1 概述

在Java中提供了四种访问权限，使用不同的访问权限修饰符修饰时，被修饰的内容会有不同的访问权限，

- public：公共的。

- protected：受保护的

- default：默认的

- private：私有的

  `public > protected > 默认 > private`

## 2.2 不同权限的访问能力

|              | public | protected | default | private |
| ------------ | ------ | --------- | ------- | ------- |
| 同一类中         | √      | √         | √       | √       |
| 同一包中(子类或任意类) | √      | √         | √       |         |
| 不同包的子类       | √      | √         |         |         |
| 不同包的任意类      | √      |           |         |         |

可见，`public`具有最大权限。`private`则是最小权限。

编写代码时，如果没有特殊的考虑，建议这样使用权限：

- 成员变量使用 `private` ，隐藏细节。
- 构造方法使用 `public` ，方便创建对象。
- 成员方法使用 `public` ，方便调用方法。

> 小贴士：不加权限修饰符，就是default权限

# 第三章 内部类

以前2个类是独立分开定义的

![](img/1.png)



## 1.1 概述

### 什么是内部类

将一个类A定义在另一个类B里面，里面的那个类A就称为**内部类**，B则称为**外部类**。

### 什么时候使用内部类

一个事物内部还有一个独立的事物，内部的事物脱离外部的事物无法独立使用

1. 人里面有一颗心脏
2. 汽车内部有一个发动机

### 内部类的分类

按定义的位置来分

1. **成员内部类**，类定义在了成员位置 (类中方法外称为成员位置)
2. **局部内部类**，类定义在方法内

### 成员内部类

- **成员内部类** ：定义在**类中方法外**的类。


定义格式：

```java
class 外部类{
    // 成员变量
    // 成员方法
    class 内部类{
        // 成员变量
        // 成员方法
    }
}
```

在描述事物时，若一个事物内部还包含其他事物，就可以使用内部类这种结构。比如，汽车类 `Car` 中包含发动机
类 `Engine` ，这时， `Engine` 就可以使用内部类来描述，定义在成员位置。

代码举例：

```java
class Car{			//外部类
    class Engine{		//内部类
        
    }
}
```

### 访问特点

内部类可以直接访问外部类的成员，包括私有成员。

创建内部类对象格式：

```java
外部类名.内部类名 对象名 = new 外部类型().new 内部类型();
```

访问演示，代码如下：

定义类：

```java
class Body{
    public Boolean live=true;

    public void walk(){
        System.out.println("散步");
    }
    class Heart{
        public void jump(){
            if(live){
                System.out.println("心脏在跳动");
            }else{
                System.out.println("心脏不跳了");
            }
        }
    }
}
```

测试类：

```java
public class Demo1 {
    public static void main(String[] args) {
        //创建内部类，第一种方式：
        Body.Heart h=new Body().new Heart();
        h.jump();

        //第二种方式：
        //先创建外部类
        Body b=new Body();
        
        //通过外部类对象再创建内部类对象
        Body.Heart h2=b.new Heart();
        b.live=false;
        h2.jump();

    }
}
输出结果：
心脏在跳动
心脏不跳了
```

> 内部类仍然是一个独立的类，在编译之后会内部类会被编译成独立的.class文件，但是前面冠以外部类的类名
> 和$符号 。
>
> 比如，Body$Heart.class

### 成员内部类面试题

请在?地方向上相应代码,以达到输出的内容

```java
public class Demo1 {
    public static void main(String[] args) {
        Body.Heart h=new Body().new Heart();
        h.jump();
    }
}

class Body {
    private int num = 10;

    class Heart {
        private int num = 20;

        public void jump() {
            int num = 30;
            System.out.println("心脏在跳动 " + Body.this.num);       //10
            System.out.println("心脏在跳动 " + this.num);       //20
            System.out.println("心脏在跳动 " + num);       //30
        }
    }
}
```

### 局部内部类

- **局部内部类** ：定义在方法中的类。

定义格式：

```java
class 外部类名 {
    数据类型 变量名;
    
    修饰符 返回值类型 方法名(参数列表) {
        // …
        class 内部类 {
            // 成员变量
            // 成员方法
        }
    }
}
```

使用方式: 在定义好局部内部类后,直接就创建对象

### 访问特点

- 内部类可以直接访问外部类的成员，包括私有成员。


代码示例： 

```java
public class Demo1 {
    public static void main(String[] args) {
        Person p=new Person();
        p.eat();
    }
}

class Person {
    private String name="凤姐";

    public void eat(){
        //筷子
        class Chopsticks{

            private int length;

            public void use(){
                //使用外部类变量
                System.out.println(name+"在使用长为"+length+"的筷子吃饭");
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }
        }
        Chopsticks c=new Chopsticks();
        c.setLength(50);
        c.use();
    }

}
```

> 局部内部类编译后仍然是一个独立的类，编译后有$还有一个数字。
>
> 编译后类名为：Chinese$1Chopsticks.class

## 1.2 匿名内部类【重点】

- **匿名内部类** ：是内部类的简化写法。它的本质是一个 带具体实现的 父类或者父接口的 匿名的 子类对象。
  开发中，最常用到的内部类就是匿名内部类了。

之前我們使用接口时，似乎得做如下几步操作：

1. 定义子类
2. 重写接口中的方法
3. 创建子类对象
4. 调用重写后的方法

```java
public class Demo1 {
    public static void main(String[] args) {

        Person p=new Person();
        p.swiming();

    }
}

//定义游泳接口
interface Swim{
    void swiming();
}

//定义实现类,实现该接口
class Person implements Swim{

    @Override
    public void swiming() {
        System.out.println("狗刨式游泳.....");
    }
}
```

我们的目的，最终只是为了调用方法，那么能不能简化一下，把以上四步合成一步呢？匿名内部类就是做这样的快
捷方式。

### 匿名内部类前提

匿名内部类必须**继承一个父类**或者**实现一个父接口**。

### 匿名内部类格式

```java
new 父类名或者接口名(){
    // 方法重写
    @Override
    public void method() {
        // 执行语句
    }
};
```

### 使用方式

以接口为例，匿名内部类的使用，代码如下：

创建匿名内部类，并调用：

```java
public class Demo1 {
    public static void main(String[] args) {

        new Swim(){

            @Override
            public void swiming() {
                System.out.println("狗刨式游泳....");
            }
        }.swiming();        //狗刨式游泳....


        //返回一个实现了swim接口的子类对象,只不过该对象是匿名的
        Swim swim = new Swim() {
            @Override
            public void swiming() {
                System.out.println("鹅划式...");
            }
        };
        
        swim.swiming();     //鹅划式...

    }
}

//定义游泳接口
interface Swim{
    void swiming();
}

//定义实现类,实现该接口
class Person implements Swim{

    @Override
    public void swiming() {
        System.out.println("狗刨式游泳.....");
    }
}
```

### 匿名内部类的本质

1. 定义一个没有名字的内部类
2. 这个类实现了Swim接口
3. 创建了这个没有名字的类的对象

### 匿名内部类的作用

简化代码

### 匿名内部类的使用场景

通常在方法的形式参数是接口或者抽象类时，也可以将匿名内部类作为参数传递。代码如下：

```java
public class Demo1 {
    public static void main(String[] args) {

        //普通方法
        Student s1=new Student();
        swim(s1);

        //使用匿名内部类方式,创建了一个匿名的类,该类实现了Swim接口
        swim(new Swim() {
            @Override
            public void swiming() {
                System.out.println("狗刨式游泳....");
            }
        });

        swim(new Swim() {
            @Override
            public void swiming() {
                System.out.println("蛙泳....");
            }
        });
    }

    //模拟，请一些人去游泳
    public static void swim(Swim s){
        s.swiming();
    }

}
interface Swim{
    void swiming();
}

class Student implements Swim{
    @Override
    public void swiming() {
        System.out.println("自由泳.....");
    }
}
```

# 第四章 引用类型用法总结

实际的开发中，引用类型的使用非常重要，也是非常普遍的。我们可以在理解基本类型的使用方式基础上，进一步
去掌握引用类型的使用方式。基本类型可以作为成员变量、作为方法的参数、作为方法的返回值，那么当然引用类
型也是可以的。

## 4.1 class作为成员变量

在定义一个类Role（游戏角色）时，代码如下：

```java
class Role{
    int id;         //角色id
    int blood;      //生命值
    String name;    //生命角色

}
```

使用 `int` 类型表示 角色id和生命值，使用 `String` 类型表示姓名。此时， `String` 本身就是引用类型，由于使用
的方式类似常量，所以往往忽略了它是引用类型的存在。如果我们继续丰富这个类的定义，给 `Role` 增加武器，穿戴装备等属性，我们将如何编写呢？

定义武器类，将增加攻击能力：

```java
class Weapon{
    String name;    //武器名称
    int hurt;       //伤害值
}
```

定义穿戴盔甲类，将增加防御能力，也就是提升生命值：

```java
class Armour{
    String name;    //装备名称
    int protect;    //防御值
}
```

定义角色类：

```java
public class Demo1 {
    public static void main(String[] args) {

        //创建攻击武器
        Weapon weapon=new Weapon("屠龙刀",999999);

        //创建防御武器
        Armour armour=new Armour("麒麟甲",10000);

        //创建角色
        Role r=new Role();
        r.setName("张无忌");
        r.setId(1);
        r.setBlood(100);
        //为角色绑定攻击武器
        r.setWeapon(weapon);

        //为角色绑定防御武器
        r.setArmour(armour);

        //攻击方法
        r.attack();

        //防御方法
        r.wear();
    }

}
class Role{
    private int id;         //角色id
    private int blood;      //生命值
    private String name;    //生命角色

    private Weapon weapon;
    private Armour armour;

    //攻击方法
    public void attack(){
        System.out.println(name+"使用"+weapon.getName()+"武器,造成"+weapon.getHurt()+"点伤害");
    }

    //穿上盔甲
    public void wear(){
        System.out.println(name+"穿山了"+armour.getName()+",生命值增加"+armour.getProtect()+"点");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }
}

class Weapon{
    private String name;    //武器名称
    private int hurt;       //伤害值

    public Weapon(String name, int hurt) {
        this.name = name;
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}

class Armour{
    private String name;    //装备名称
    private int protect;    //防御值

    public Armour(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
```

> 类作为成员变量时，对它进行赋值的操作，实际上，是赋给它该类的一个对象。

## 4.2 interface作为方法参数和返回值类型

当接口作为方法的参数时,需要传递什么呢？当接口作为方法的返回值类型时，需要返回什么呢？对，其实都是它的子类对象。

```java
public class Demo1 {
    public static void main(String[] args) {

        Swimable sw = getSwimableObj();
        sw.swiming();

    }
    
    //随便获取一个可以游泳的对象即可
    public static Swimable getSwimableObj(){
        
        SwimStudent ss=new SwimStudent();
        
        SwimTeacher st=new SwimTeacher();
        
//        return ss;
        return st;
    }
}
//游泳接口
interface Swimable{

    void swiming();
}
class SwimTeacher implements Swimable{
    @Override
    public void swiming() {
        System.out.println("会游泳的老师...");
    }
}
class SwimStudent implements Swimable{
    @Override
    public void swiming() {
        System.out.println("会游泳的学生...");
    }
}

```

# 第五章 综合案例——发红包

### 案例需求

分析并使用已给出的类，编写程序，设置红包类型。

> 小贴士 红包类型：
> 1. 普通红包：金额均分。不能整除的，余额添加到最后一份红包中。
> 2. 手气红包：金额随机。各个红包金额累和与总金额相等。
>   红包场景： 此案例是模拟群主给群成员发红包，群主自己打开最后一个红包的场景。

### 案例分析

-  **普通红包**：

  将所有金额平均分布，剩余的钱如果不为0作为最后一个红包

- **手气红包【重点】**

  本质上，手气红包就是把总金额 totalMoney 随机分成指定的 count 份，所以必须规定每一份金额的取值范
  围。如果范围太小，可能导致后分配红包金额特别大。反之范围太大，可能导致后分配红包金额为0，不够
  分。可见，取值范围的定义规则，是手气红包的关键所在。
  我们规定：每一份随机金额范围（除最后一份），最小值为1，**最大值为当前剩余平均金额的2倍** ，单位为"分"。



计算公式：

```java
当前随机红包金额范围=当前剩余金额/当前剩余红包个数*2
```

举例：总额为50元，发5个红包。

![](img/2.png)



红包模式接口：

```java
//发红包接口
interface OpenMode{
    ArrayList<Integer> faHongBao(Integer money,Integer count);
}
```

普通红包：

```java
//普通红包类
class Common implements OpenMode{

    @Override
    public ArrayList<Integer> faHongBao(Integer money, Integer count) {

        /**
         * 普通红包规则： 所用红包平均分布，最后面留下的作为最后一个红包
         *
         */
        //用于存储红包
        ArrayList<Integer> redPack=new ArrayList<>();
        int tempMoney = money / count;

        for(int i=0;i<count-1;i++){

            redPack.add(tempMoney);

            //发完一次红包后，总金额应该减少，
            money-=tempMoney;

        }

        //剩余的金额为最后一个红包
        redPack.add(money);
        return redPack;
    }
}
```

手气红包：

```java
//随机红包
class Lucky implements OpenMode{

    @Override
    public ArrayList<Integer> faHongBao(Integer money, Integer count) {
        /**
         * 随机红包规则：
         *
         * 随机红包范围：(当前剩余余额/当前剩余红包个数)*2
         *
         */
        //用于存储红包
       	Random r= new Random()
        ArrayList<Integer> redPack=new ArrayList<>();
        for(int i=0;i<count;i++){
            int tempMoney = r.nextInt(money / count * 2) + 1;
            redPack.add(tempMoney);

            //在总余额上减去这次发掉的红包金额
            money-=tempMoney;

            //红包剩余个数减1
            count--;
        }
        //剩下的钱留给最后一个红包
        redPack.add(money);
        return redPack;
    }
}
```

红包类：

```java
class RedPackage{
    //群主名称
    private String name;

    //发红包模式
    private OpenMode openMode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OpenMode getOpenMode() {
        return openMode;
    }

    public void setOpenMode(OpenMode openMode) {
        this.openMode = openMode;
    }
}
```



测试类：

```java
public class Demo1 {
    public static void main(String[] args) {
        RedPackage redPackage=new RedPackage();
        redPackage.setName("群主大大");
        //设置发红包模式,随机模式
        redPackage.setOpenMode(new Lucky());

        OpenMode openMode = redPackage.getOpenMode();

        //发红包
        ArrayList<Integer> luckyRedPack = openMode.faHongBao(50, 9);
        System.out.println(redPackage.getName()+"发了一个随机红包： "+luckyRedPack);

        //设置发红包模式,普通模式
        redPackage.setOpenMode(new Common());
        ArrayList<Integer> commonRedPack = redPackage.getOpenMode().faHongBao(10, 5);
        System.out.println(redPackage.getName()+"发了一个普通红包： "+commonRedPack);
    }
}
```

# 第六章 Lambda表达式

## 6.1 函数式编程思想概述

![](img/100.png)

在数学中，**函数**就是有输入量、输出量的一套计算方案，也就是“拿什么东西做什么事情”。相对而言，面向对象过分强调“必须通过对象的形式来做事情”，而函数式思想则尽量忽略面向对象的复杂语法——**强调做什么，而不是以什么形式做**。

面向对象的思想:

​	做一件事情,找一个能解决这个事情的对象,调用对象的方法,完成事情.

函数式编程思想:

​	只要能获取到结果,谁去做的,怎么做的都不重要,重视的是结果,不重视过程

## 6.2 简化匿名内部类

### 任务案例：

定义一个Task接口，提供task任务方法

```java
package com.dfbz.task;

public interface Task {
    public void task();
}

```

定义一个Start启动类，内部包含一个任务Task

```java
package com.dfbz.task;

public class Start {
    private Task task;

    public Start(Task task) {
        this.task = task;
    }

    public void run(){
        //执行task任务
        task.task();
    }

}
```

测试类：

```java
package com.dfbz.demo;

import com.dfbz.task.Start;
import com.dfbz.task.Task;

public class Demo1 {
    public static void main(String[] args) {

        //匿名内部类写法
        new Start(new Task() {
            @Override
            public void task() {
                System.out.println("开启任务啦！");
            }
        }).run();
    }
}
```



## 6.3 编程思想转换

### 做什么，而不是怎么做

我们真的希望创建一个匿名内部类对象吗？不。我们只是为了做这件事情而**不得不**创建一个对象。我们真正希望做的事情是：将`run`方法体内的代码传递给`Thread`类知晓。

**传递一段代码**——这才是我们真正的目的。而创建对象只是受限于面向对象语法而不得不采取的一种手段方式。那，有没有更加简单的办法？如果我们将关注点从“怎么做”回归到“做什么”的本质上，就会发现只要能够更好地达到目的，过程与形式其实并不重要。

### 生活举例

![](img/101.png)

当我们需要从北京到上海时，可以选择高铁、汽车、骑行或是徒步。我们的真正目的是到达上海，而如何才能到达上海的形式并不重要，所以我们一直在探索有没有比高铁更好的方式——搭乘飞机。

![](img/102.png)

而现在这种飞机（甚至是飞船）已经诞生：2014年3月Oracle所发布的Java 8（JDK 1.8）中，加入了**Lambda表达式**的重量级新特性，为我们打开了新世界的大门。

## 6.4 体验Lambda的更优写法

借助Java 8的全新语法，上述`Runnable`接口的匿名内部类写法可以通过更简单的Lambda表达式达到等效：

```java
public class Demo1 {
    public static void main(String[] args) {
        new Start(() -> System.out.println("使用lambda表达式开启任务！")).run();
    }
}
```

这段代码和刚才的执行效果是完全一样的，可以在1.8或更高的编译级别下通过。从代码的语义中可以看出：我们启动了一个线程，而线程任务的内容以一种更加简洁的形式被指定。

不再有“不得不创建接口对象”的束缚，不再有“抽象方法覆盖重写”的负担，就是这么简单！

## 6.5 回顾匿名内部类

Lambda是怎样击败面向对象的？在上例中，核心代码其实只是如下所示的内容：

```java
() -> System.out.println("使用lambda表达式开启任务！")
```

为了理解Lambda的语义，我们需要从传统的代码起步。

### 使用实现类

要使用一个Start类，需要创建一个Start类的对象并调用run方法，而为了指定线程执行的内容，需要调用Start类的构造方法

- `public Start(Task task)`

为了获取Task接口的实现对象，可以为该接口提供一个实现类`TaskImpl`

```java
package com.dfbz.task;

public class TaskImpl implements Task {
    @Override
    public void task() {
        System.out.println("我是使用自定义实现类方式的哦！");
    }
}
```

然后创建该实现类的对象作为`Start`类的构造参数：

```java
package com.dfbz.demo;

import com.dfbz.task.Start;
import com.dfbz.task.TaskImpl;

public class Demo1 {
    public static void main(String[] args) {
        TaskImpl task=new TaskImpl();
        
        Start start=new Start(task);
        
        start.run();
    }
}

```

### 使用匿名内部类

这个`TaskImpl`类只是为了实现`Task`接口而存在的，而且仅被使用了唯一一次，所以使用匿名内部类的语法即可省去该类的单独定义，即匿名内部类：

```java
package com.dfbz.demo;

import com.dfbz.task.Start;
import com.dfbz.task.Task;

public class Demo1 {
    public static void main(String[] args) {
        
        new Start(new Task() {
            @Override
            public void task() {
                System.out.println("我是使用匿名内部类方式的哦！");
            }
        }).run();
    }
}
```

### 匿名内部类的好处与弊端

一方面，匿名内部类可以帮我们**省去实现类的定义**；另一方面，匿名内部类的语法——**确实太复杂了！**

### 语义分析

仔细分析该代码中的语义，`Task`接口只有一个`task`方法的定义：

- `public abstract void task();`

即制定了一种做事情的方案（其实就是一个函数）：

- **无参数**：不需要任何条件即可执行该方案。
- **无返回值**：该方案不产生任何结果。
- **代码块**（方法体）：该方案的具体执行步骤。

同样的语义体现在`Lambda`语法中，要更加简单：

```java
() -> System.out.println("Lambda表达式方式！")
```

- 前面的一对小括号即`run`方法的参数（无），代表不需要任何条件；
- 中间的一个箭头代表将前面的参数传递给后面的代码；
- 后面的输出语句即业务逻辑代码。

## 6.6 Lambda标准格式

Lambda省去面向对象的条条框框，格式由**3个部分**组成：

- 一些参数
- 一个箭头
- 一段代码

Lambda表达式的**标准格式**为：

```
(参数类型 参数名称) -> { 代码语句 }
```

格式说明：

- 小括号内的语法与传统方法参数列表一致：无参数则留空；多个参数则用逗号分隔。
- `->`是新引入的语法格式，代表指向动作。
- 大括号内的语法与传统方法体要求基本一致。

## 6.7 练习：使用Lambda标准格式（无参无返回）

### 题目

给定一个厨子`Cook`接口，内含唯一的抽象方法`makeFood`，且无参数、无返回值。如下：

```java
public interface Cook {
    void makeFood();
}
```

在下面的代码中，请使用Lambda的**标准格式**调用`invokeCook`方法，打印输出“吃饭啦！”字样：

```java
public class Demo05InvokeCook {
    public static void main(String[] args) {
        // TODO 请在此使用Lambda【标准格式】调用invokeCook方法
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
```

### 解答

```java
public static void main(String[] args) {
    invokeCook(() -> {
      	System.out.println("吃饭啦！");
    });
}
```

> 备注：小括号代表`Cook`接口`makeFood`抽象方法的参数为空，大括号代表`makeFood`的方法体。

## 6.8 Lambda的参数和返回值

```
需求:
    使用数组存储多个Person对象
    对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
```

下面举例演示`java.util.Comparator<T>`接口的使用场景代码，其中的抽象方法定义为：

- `public abstract int compare(T o1, T o2);`

当需要对一个对象数组进行排序时，`Arrays.sort`方法需要一个`Comparator`接口实例来指定排序的规则。假设有一个`Person`类，含有`String name`和`int age`两个成员变量：

```java
public class Person { 
    private String name;
    private int age;
    
    // 省略构造器、toString方法与Getter Setter 
}
```

### 传统写法

如果使用传统的代码对`Person[]`数组进行排序，写法如下：

```java
import java.util.Arrays;
import java.util.Comparator;

public class Demo06Comparator {
    public static void main(String[] args) {
      	// 本来年龄乱序的对象数组
        Person[] array = {
        	new Person("古力娜扎", 19),
        	new Person("迪丽热巴", 18),
       		new Person("马尔扎哈", 20) };

      	// 匿名内部类
        Comparator<Person> comp = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(array, comp); // 第二个参数为排序规则，即Comparator接口实例

        for (Person person : array) {
            System.out.println(person);
        }
    }
}
```

这种做法在面向对象的思想中，似乎也是“理所当然”的。其中`Comparator`接口的实例（使用了匿名内部类）代表了“按照年龄从小到大”的排序规则。

### 代码分析

下面我们来搞清楚上述代码真正要做什么事情。

- 为了排序，`Arrays.sort`方法需要排序规则，即`Comparator`接口的实例，抽象方法`compare`是关键；
- 为了指定`compare`的方法体，**不得不**需要`Comparator`接口的实现类；
- 为了省去定义一个`ComparatorImpl`实现类的麻烦，**不得不**使用匿名内部类；
- 必须覆盖重写抽象`compare`方法，所以方法名称、方法参数、方法返回值**不得不**再写一遍，且不能写错；
- 实际上，**只有参数和方法体才是关键**。

### Lambda写法

```java
import java.util.Arrays;

public class Demo07ComparatorLambda {
    public static void main(String[] args) {
        Person[] array = {
          	new Person("古力娜扎", 19),
          	new Person("迪丽热巴", 18),
          	new Person("马尔扎哈", 20) };

        Arrays.sort(array, (Person a, Person b) -> {
          	return a.getAge() - b.getAge();
        });

        for (Person person : array) {
            System.out.println(person);
        }
    }
}
```

## 6.9 练习：使用Lambda标准格式（有参有返回）

### 题目

给定一个计算器`Calculator`接口，内含抽象方法`calc`可以将两个int数字相加得到和值：

```java
public interface Calculator {
    int calc(int a, int b);
}
```

在下面的代码中，请使用Lambda的**标准格式**调用`invokeCalc`方法，完成120和130的相加计算：

```java
public class Demo08InvokeCalc {
    public static void main(String[] args) {
        // TODO 请在此使用Lambda【标准格式】调用invokeCalc方法来计算120+130的结果ß
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
```

### 解答

```java
public static void main(String[] args) {
    invokeCalc(120, 130, (int a, int b) -> {
      	return a + b;
    });
}
```

> 备注：小括号代表`Calculator`接口`calc`抽象方法的参数，大括号代表`calc`的方法体。

## 6.10 Lambda省略格式

### 可推导即可省略

Lambda强调的是“做什么”而不是“怎么做”，所以凡是可以根据上下文推导得知的信息，都可以省略。例如上例还可以使用Lambda的省略写法：

```java
public static void main(String[] args) {
  	invokeCalc(120, 130, (a, b) -> a + b);
}
```

### 省略规则

在Lambda标准格式的基础上，使用省略写法的规则为：

1. 小括号内参数的类型可以省略；
2. 如果小括号内**有且仅有一个参**，则小括号可以省略；
3. 如果大括号内**有且仅有一个语句**，则无论是否有返回值，都可以省略大括号、return关键字及语句分号。

> 备注：掌握这些省略规则后，请对应地回顾本章开头的多线程案例。

## 6.11 练习：使用Lambda省略格式

### 题目

仍然使用前文含有唯一`makeFood`抽象方法的厨子`Cook`接口，在下面的代码中，请使用Lambda的**省略格式**调用`invokeCook`方法，打印输出“吃饭啦！”字样：

```java
public class Demo09InvokeCook {
    public static void main(String[] args) {
        // TODO 请在此使用Lambda【省略格式】调用invokeCook方法
    }

    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
```

### 解答

```java
public static void main(String[] args) {
  	invokeCook(() -> System.out.println("吃饭啦！"));
}
```

## 6.12 Lambda的使用前提



Lambda的语法非常简洁，完全没有面向对象复杂的束缚。但是使用时有几个问题需要特别注意：

1. 使用Lambda必须具有接口，且要求**接口中有且仅有一个抽象方法**。
   无论是JDK内置的`Runnable`、`Comparator`接口还是自定义的接口，只有当接口中的抽象方法存在且唯一时，才可以使用Lambda。
2. 使用Lambda必须具有**上下文推断**。
   也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例。

> 备注：有且仅有一个抽象方法的接口，称为“**函数式接口**”。



# 第七章 Stream流

## 1.1Stream常用方法

#### 1.1.1过滤：filter

现有如下需求：

- 筛选所有姓张的人。
- 然后筛选名字有三个字的人。
- 最后进行对结果进行打印输出。

```java
List<String> list = new ArrayList<>(); 
list.add("张无忌");
list.add("周芷若");
list.add("赵敏"); 
list.add("张强"); 
list.add("张三丰");

```

方法一：jdk1.8以前的方案

```java
public class StreamDemo01 {
    public static void main(String[] args){
        // 使用传统方法实现
        test01();
    }

    // 使用传统方法实现
    public static void test01(){
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        // 使用传统方式实现
        List<String> oneList = new ArrayList<>();
        // 首先筛选所有姓张的人。
        for(String name:list){
            if(name.startsWith("张")){
                oneList.add(name);
            }
        }
        // 然后筛选名字有三个字的人。
        List<String> twoList = new ArrayList<>();
        for (String name: oneList) {
            if (name.length() == 3){
                twoList.add(name);
            }
        }
        // 最后进行对结果进行打印输出。
        for (String name:twoList) {
            System.out.println(name);
        }
    }
}
```

方法二：jdk1.8以后的方案

```java
public class StreamDemo01 {
    public static void main(String[] args){
        // 使用stream流实现
        test02();
    }

    // 使用传统方法实现
    public static void test02(){
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //list转换成stream
        Stream<String> stream = list.stream()
                .filter(s -> {
                    System.out.println("过滤姓张的");
                    return s.startsWith("张");
                })
                .filter(s -> {
                    System.out.println("过滤三个字的");
                    return s.length() == 3;
                });
        //stream转换成list
        List<String> list2 = stream.collect(Collectors.toList());
        list2.stream().forEach(System.out::println);
        
        //简写的方式
        list.stream().filter(n -> {
            return n.startsWith("张") && n.length() == 3;
        }).forEach(System.out::println);

    }
}
```

直接阅读代码的字面意思即可完美展示无关逻辑方式的语义：**获取流、过滤姓张、过滤长度为3、逐一打印。

#### 1.1.2 获取前几个：limit

```java
        //获取stream中前2个元素
        list.stream().limit(2).forEach(n -> {
            System.out.println(n);
        });
```

#### 1.1.3跳过前几个：skip

```java
       //跳过stream中前2个元素
        list.stream().skip(2).forEach(n -> {
            System.out.println(n);
        });
```

#### 1.1.4组合：concat

```java
        // 将流a和流b拼接成一个新的流
        Stream<String> cStream = Stream.concat(aStream, bStream);
```

#### 1.1.5 小结：非终结方法与终结方法

在上述介绍的各种方法中，凡是返回值仍然为`Stream`接口的为**非终结方法(函数拼接方法)**，它们支持链式调用；而返回值不再为`Stream`接口的为**终结方法**，不再支持链式调用。如下表所示：

| 方法名  | 方法作用   | 方法种类 | 是否支持链式调用 |
| ------- | ---------- | -------- | ---------------- |
| count   | 统计个数   | 终结     | 否               |
| forEach | 逐一处理   | 终结     | 否               |
| filter  | 过滤       | 函数拼接 | 是               |
| limit   | 取用前几个 | 函数拼接 | 是               |
| skip    | 跳过前几个 | 函数拼接 | 是               |
| map     | 映射       | 函数拼接 | 是               |
| concat  | 组合       | 函数拼接 | 是               |









