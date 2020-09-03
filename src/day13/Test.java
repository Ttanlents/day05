package day13;



import java.util.*;

/**
 * List集合（有序的  可重复的）
 *      ArrayList有序自动排序
 *      LinkedList:
 *          1.pop（）弹出，获取首位元素并且，删除这个元素
 *          2.push() 放进去一个元素，放在首位
 * Set集合（无序的  不可重复的）
 *      hashSet是无序的
 *      treeSet是有序的（自动排序）
 *      LinckedHashSet 有序的（按照添加顺序）
 *          1.不能使用下标遍历，只能用增强for或者迭代器
 * 去重对象：
 *      重写hashcode()和equals()
 *              hashcode相等，equals不一定相等
 *              hashcode不等，equals一定不等
 * 往Haset添加元素的时候，HashSet会先调用元素的hashCode方法得到元素的哈希值
 * 如果hash值不相同，说明是一个新元素，直接存储在这个位置上；
 * 如果hash值相同，然后判断equals,返回true，说明元素已经存在，替换,返回false,说明不是同一个元素，存储。
 * 相同哈希值的元素就这样存储在同一个哈希桶中，用链表连接，如果超过链表的阈值（8），则转换成红黑树存储数据。
 *
 * Map集合：
 *      hashMap:无序的
 *      treeMap：有序的(自动排序)
 *      LinkedhashMap 有序的（按照添加顺序）
 * <
 * 比较器
 *       Comparator()用于自定义排序，比较灵活
 *      comparable<>()是写死在类中不利于需求变更
 */

public class Test {
    public static void main(String[] args) {
        String  s=new String("abc");
        String ss=new String("abc");
        System.out.println(s.hashCode());
        System.out.println(ss.hashCode());
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.toString());
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.pop(); //后进先出
        System.out.println(list);

        HashSet<Student> set = new HashSet<>();  //无序的
        // LinkedHashSet<Student> set = new LinkedHashSet<>(); //有序的

        Student student = new Student("张三", 18, "男");
        Student student1 = new Student("李四", 35, "女");
        Student student2 = new Student("王五", 18, "男");
        Student student3 = new Student("张三", 19, "男");
        set.add(student);
        set.add(student1);
        set.add(student3);
        set.add(student2);
        System.out.println(set);


        //hashMap  无序的
        //TreeMap 有序的(自动排序)
        Map<String, Student> map = new LinkedHashMap<>();
        map.put("b2a456", student);
        map.put("b2a457", student);
        map.put("abbbbb", student1);
        map.put("bac", student2);
        System.out.println(map);

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        User u1 = new User("赵匡胤", 50, 95);
        User u2 = new User("努尔哈赤", 55, 80);
        User u5 = new User("张三", 55, 80);
        User u3 = new User("康熙", 50, 85);
        User u4 = new User("雍正", 50, 90);
        List<User> userList = listUtils.add(u1,u2,u3,u4,u5);
        for (User user : userList) {
            System.out.println(user.getName());
        }
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return -1;
            }
        });
       /* Collections.sort(userList,(o1,o2)->{
            if (o1.getAge()==o2.getAge()){
                return o2.getScore()-o1.getScore();
            }
            return o2.getAge()-o1.getAge();
        });*/
        for (User user : userList) {
            System.out.println(user.getName()+": "+user.getAge());
        }


    }


}
