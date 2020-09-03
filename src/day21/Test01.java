package day21;

import org.junit.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 余俊锋
 * @date 2020/9/2 10:02
 *
 * 反射：在程序运行过程中对类的属性行为进行剖析。
 *       获得类class对象三种方式：
 *                              User.class
 *                              class.forName("user")
 *                              user.getClass()
 *      常用方法：getSimpleName()简单类名
 *                 getName() 获得完整的类名
 *                 newInstance() 创建实例
 *       获取构造器的方法：
 *                  getConstructor( ...para)只能获取
 *                  getDeclaredConstructor(...para)获取所有的构造方法，包括private
 *                  + s  返回的是方法的Method数组
 *                 构造器常用方法：
 *                  constructor.newInstance实例化要，关闭安全检查（setAccessible）
 *        获取方法的方式：
 *                  getMethod("方法名"，参数)； public修饰的 方法
 *                  getDeclare|Method("方法名"，参数)； 包括private修饰的方法
 *                  +s  返回的是方法的Method数组
 *                  方法常用方法：
 *                  invoke()
 *                 注意：静态方法可以不用对象来调用
 *        获取属性的方式：
 *              getDeclaredField(String name) 全部修饰 的属性包括private
 *              getField(String name) public的成员属性
 *              +s 返回一个数组
 * 注解：@interface
 *  格式： 1.数据类型+属性名（）；
 *          2.不能是包装类型
 *          3.数据类型+属性名（） default value(没有默认值要赋值)、
 *
 *       特殊情况：当且仅当只有一个value属性名字的，可以赋值不用写名字，
 *                 如果其他属性有多个，其他的都有默认值，value也可以不写
 *    元注解：Target  Retention
 *        注解作用范围：@target ElementType.type  类接口
 *                      @target ElementType.Field 成员变量
 *                      @target ElementType.Method
 *         注解生命周期：@Retention 资源文件，class文件，运行时
 *
 *  
 *
 */
@SuppressWarnings("")
public class Test01 {
    @Test
    public void method() {
        System.out.println("hellow world2");
    }

    @Before
    public void method1() {
        System.out.println("hellow world1");
    }

    @After
    public void method2() {
        System.out.println("hellow world3");
    }

    @BeforeClass
    public static void getsome() {
        System.out.println("getsome");
    }

    @AfterClass
    public static void getsome2() {
        System.out.println("getsome2");

    }

    @Test
    public void consruct() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<User> userClass = User.class;
        //只能获取public
       // Constructor<User> constructor = userClass.getConstructor(String.class, Integer.class, String.class);
        //根据参数列表不同，互相的构造器也不同（方法重载）
        //获取所有权限修饰的private,public ,protect,default
        Constructor<User> constructor = userClass.getDeclaredConstructor(String.class, Integer.class, String.class);
        System.out.println(constructor);
        //构造器是私有的需要关闭安全检查
        constructor.setAccessible(true);
        User user = constructor.newInstance("马赛克", 15, "男");
        System.out.println(user);
        // System.out.println(constructor);


        /**
         * 方法
         */
        Method method = userClass.getDeclaredMethod("eat", String.class);
        method.setAccessible(true);
        method.invoke(user,"西瓜");

        Method method2 = userClass.getDeclaredMethod("eat2", String.class);
        method2.setAccessible(true);
        method2.invoke(user,"西瓜"); //null

        /**
         * 属性
         */
        long start=System.currentTimeMillis();
        Field field = userClass.getField("name");
        //field.setAccessible(true);
        Object o = field.get(user);
        System.out.println((String)o);
        long end=System.currentTimeMillis();
        System.out.println(end-start);



    }
}
