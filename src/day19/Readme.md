 一.缓冲流（内部维护8K大小）
 *          会创建一个内置的默认大小的缓冲区数组，通过缓冲区读写，减少系统IO次数，从而提高读写的效率
 *          字节缓冲流：`BufferedInputStream`，`BufferedOutputStream`
 *          字符缓冲流：`BufferedReader`，`BufferedWriter`
 *
 *     字节缓冲流
 *      构造器：
 *              BufferedInputStream(InputStream in)`
 *              BufferedOutputStream(OutputStream out)
 *              方法是：read  writer  也可以传入一个字节数组
 *      字符缓冲流
 *          构造器：
 *                  `public BufferedReader(Reader in)` ：创建一个 新的缓冲输入流。
 *                  `public BufferedWriter(Writer out)`： 创建一个新的缓冲输出流。
 *           特有方法：
 *           readLine()读一行文字。
 *           newLine()写一行行分隔符,由系统属性定义符号。
 * 二.转换流（字节和字符的桥梁）
 *              作用：
 *                  指定字符编码格式
 *       InputStreamReader（字节转字符）
 *       OutputStreamWriter（字符转字节）
 *
 *       构造器：
 *          InputStreamReader(InputStream in, String charsetName)
 *          `InputStreamReader(InputStream in)`
 *          `OutputStreamWriter(OutputStream in, String charsetName)`
 *          OutputStreamWriter(OutputStream in)
 *          常用方法：
 *  *                  read(cbuf)
 *  *                  osw.write(cbuf,0,len)
 *         案例：
 *              1. 指定GBK编码的转换流，读取文本文件。
 *              2. 使用UTF-8编码的转换流，写出文本文件。
 *
 *
 * 三，常见编码格式：
 *              ASCII
 *              iso-8859-1
 *              Unicode字符集
 *              Gb2312
 *              GBK
 *
 * 四.序列化流：
 *          将一个对象以及它的原始数据，转换为流形式写出到文件中
 *          将文件中的的信息，以流形式还原回对象
 *          构造器：
 *              序列化：ObjectOutputStream(fileOut)
 *              反序列化：ObjectInputStream（fileIn）
 *          常用方法：
 *                  readObject()
 *                  writeObject()
 *
 *           条件：
 *                  1.实现序列化接口
 *                  2.(瞬态)如果有transient修饰的属性说明该属性不可被序列化
 *五.打印流
 *              PrintStream(打印流FileOutPutStream的子类)
 *        构造器：
 *              public PrintStream(String fileName)  `
 *         常用方法：
 *                   System.setOut(ps)//改变打印方向
 *