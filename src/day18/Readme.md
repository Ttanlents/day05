***day18--笔记本***

 * 一，字节文件输出流FileOutputStream：
 *              构造器：
 *                      FileOutputStream(File file)`
 *                      FileOutputStream(String name)`
 *                      FileOutputStream(File file, boolean append)`
 * 
 *              常用方法：   write(byte[] b, int off, int len)
 *                          write(byte[] b)
 *                          close()  关闭流
 *                          flush() 刷新此输出流并强制任何缓冲的输出字节被写出
 *                  换行： \r\n    \r:回车   \n 换行   windows : \r\n , mac: \r ,Unix: \n
 *
 * 二，字节输入流FileInputStream：
 *          构造器：
 * `            FileInputStream(File file)
 * `            FileInputStream(String name）
 *          常用方法：
 *                        read(byte[] b)`：使用数组读取，每次读取多个字节，减少了系统间的IO操作次数，从而提高了读写的效率
 *              注意：   BUG()读取数组的时候不指定下标会出现错误，改进添加数组下标
 *                      读到文件末尾是：-1
 *               输入输出流关闭原则：先进后出
 *
 * 三,字符输入流(FileReader)
 *          构造器：
 *          FileReader(File file)
 *          FileReader(String fileName)
 *
 *          常用方法：
 *              close()`
 *              read()`返回一个int字符  （char）a 强转回来
 *              read(char[] buff)`  返回负一表示读完了
 *              write(String str, int off, int len)`
 *              flush() `
 *              close()`
 *
 * 四，字符输出流(FileWriter)
 *              构造器：
 *                      `FileWriter(File file)`
 *                      `FileWriter(String fileName)`
 *              常用方法：
 *                      `write(int b)` 写一个字符
 *                      `write(char[] cbuf, int off, int len)`写出字符数组
 *                      	fw.write("\r\n"); 换行
 *  jdk1.7 对流关闭的优化：
 *          try (创建流对象语句，如果多个,使用';'隔开)
 *          try ( FileWriter fw = new FileWriter("fw.txt"); )
 *
 * 五，属性集`java.util.Properties ` 继承于` Hashtable`
 *          构造方法：无参
 *
 *          常用方法：setProperty(String key, String value)`
 *                     getProperty(String key) `
 *                     stringPropertyNames() ` ：所有键的名称的集合。
 *                     load(inputStream is)加载文件