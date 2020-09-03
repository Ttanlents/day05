***day13--笔记本***
 * 一.List集合（有序的  可重复的）
 *      ArrayList有序自动排序
 *      LinkedList:
 *          1.pop（）弹出，获取首位元素并且，删除这个元素
 *          2.push() 放进去一个元素，放在首位
 * 二.Set集合（无序的  不可重复的）
 *      hashSet是无序的
 *      treeSet是有序的（自动排序）
 *      LinckedHashSet 有序的（按照添加顺序）
 *          1.不能使用下标遍历，只能用增强for或者迭代器
 * 三.去重对象：
 *      重写hashcode()和equals()
 *              hashcode相等，equals不一定相等
 *              hashcode不等，equals一定不等
 * 往Haset添加元素的时候，HashSet会先调用元素的hashCode方法得到元素的哈希值
 * 如果hash值不相同，说明是一个新元素，直接存储在这个位置上；
 * 如果hash值相同，然后判断equals,返回true，说明元素已经存在，替换,返回false,说明不是同一个元素，存储。
 * 相同哈希值的元素就这样存储在同一个哈希桶中，用链表连接，如果超过链表的阈值（8），则转换成红黑树存储数据。
 *
 * 四.Map集合：
 *      hashMap:无序的
 *      treeMap：有序的(自动排序)
 *      LinkedhashMap 有序的（按照添加顺序）
 *
 * 五.比较器
 *       Comparator()用于自定义排序，比较灵活
 *      comparable<>()是写死在类中不利于需求变更