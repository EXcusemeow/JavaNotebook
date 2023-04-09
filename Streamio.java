
// p 输入输出流   流 stream 数据流data stream 
//o Java 提供了多种数据流的实现，根据数据类型、处理方式和功能不同，可以分为字节流、字符流、基本类型流、对象流、缓冲流、转换流、数据流等。
//o Java 的标准数据流分为标准输入流、标准输出流和标准错误输出流等。
// 标准输入流（System.in）用于从键盘读取数据，标准输出流（System.out）用于向控制台输出数据，标准错误输出流（System.err）用于向控制台输出错误信息。
//o io包数据流的4个基本抽象类是指用于定义数据流的基本功能和操作的抽象类，它们是：

//o  InputStream：字节输入流的抽象类，用于从数据源读取字节数据。
//o  OutputStream：字节输出流的抽象类，用于向数据目标写入字节数据。
//o  Reader：字符输入流的抽象类，用于从数据源读取字符数据。
//o  Writer：字符输出流的抽象类，用于向数据目标写入字符数据。

// b ---------------InputStream 输入流类有以下几个抽象方法：
// 访问数据流默认byte类型
// o int read()：从输入流中读取 一个 字节的值，并返回其整数值，直到流的末尾，则返回 -1。read()可以用于读取二进制/字符数据
// o read(byte[] b) 或 read(char[] c)：从输入流中读取 多个 字节或字符，并将它们存储到字节数组b或字符数组c中，返回实际读取的字节数或字符数，直到流的末尾，返回 -1。??填满整个数组
// o int read(byte[] b, int off, int len)：从输入流中读取最多 len 个字节，并将它们存储到字节数组 b 中，从偏移量 off 开始 返回实际读取的字节数或字符数，如果已到达流的末尾，则返回 -1。。
//跳过 监测和关闭
// o long skip(long n)：跳过并丢弃输入流中的 n 个字节 返回实际跳过的字节数或字符数。
// o int available()：返回在不阻塞的情况下 可以 从输入流中读取的字节数而不是实际剩余可读取。不太准
// o void close()：关闭输入流并释放与之关联的资源。
// 回推常用方法
// o boolean markSupported()：判断输入流是否支持 mark 和 reset 方法。返回布尔值
// o void mark(int readlimit)：在输入流中标记当前位置，参数 readlimit 表示在失效前可以读取的缓冲区最大字节数。
// o void reset()：将输入流重置到最后一次mark标记的位置。

// b ---------------OutputStream 输出数据流抽象类是一种用于向目标写入数据的流，例如文件、控制台、网络等。
//  在 Java 中，输出数据流的基类是 OutputStream，它是一个抽象类，定义了所有输出数据流的共同方法。有多种子类继承了 OutputStream，提供了不同的功能和性能，
// 例如 FileOutputStream、BufferedOutputStream、DataOutputStream 等。
//r 重要操作方法
//no BufferedWriter类的write方法可以写入一个字符串、一个字符数组或一个单个字符。
//no PrintWriter类的write方法可以写入一个字符串、一个字符数组、一个单个字符或一个格式化的文本
//no FileOutputStream类的write方法可以写入一个字节数组或一个单个字节。
//no DataOutputStream类的write方法可以写入各种基本数据类型，如int, long, float, double等
//  创建一个输出数据流对象，指定要写入的目标，例如文件名或其他输出流对象。
// g 使用 几种write() 方法或其他特定于子类的方法，将数据从内存写入到输出数据流中。
//o write() 方法是一种用于向输出数据流写入数据的方法，它有多种重载形式，可以接受不同类型和长度的参数，例如数字、字符串、字符数组等。
//g void write(int c/String str))：写入一个字节/字符串，字节根据 ASCII 码表或 Unicode 表转换为对应的字符。
//g void write(char[] cbuf)：写入一个字符数组。
//g void write(String str/char[] cbuf, int off, int len)：写入一个字符串/字符数组的一部分，从偏移量 off 开始，长度为 len。
// o 使用 flush() 方法或 close() 方法，将缓冲区中的数据刷新到目标中。
//g write() 方法进行写操作时并不一定直接将所写的内容写出，而先将需要写出的内容放到输出缓冲区，直到缓冲区满、调用 flush() 方法刷新流或调用 close() 方法关闭流时才真正输出。 这样处理可以减少实际的写出次数，提高系统效率。如果需要写出的内容立即输出，需要在完成 write() 方法后调用 flush() 方法。
// o 使用 close() 方法，关闭输出数据流并释放相关资源。

// p -------------------基本字节数据流类
// o 字节流可以处理任意类型的文件，如图片、音乐、视频等。
//b 文件数据流FileInputStream和FileOutputStream，文件数据流用于从文件中读写字节数据。
/**创建文件字节输入流的构造方法语法如下：
*w 以File对象为参数创建FileInputStream实例 new FileInputStream(File file)
*W 以文件对象的绝对路径为参数创建FIleInputStream实例 new FileInputStream(String filepath)

创建文件字节输出流的构造方法语法如下：
*W 以File对象为参数创建FileOutputStream实例 new FileOutputStream(File file)
*w 以文件对象的绝对路径为参数创建FIleOutputStream实例 new FileOutputStream(String filepath)
*/
// 常用方法继承自In/OutputStream  同上 但是不支持mark() reset()
// b ------------------filter过滤器数据流??
//y 缓冲区数据流BufferedInputStream和BufferedOutputStream，用于为其他输入输出流提供缓冲功能，提高读写效率。
/**
 * o 创建一个新的字节缓冲输入流 不带缓冲区大小即为默认大小
* BufferedInputStream (InputStream in);
BufferedInputStream (InputStream in, int size);
* o 创建一个新的字节缓冲输出流
BufferedOutputStream (OutputStream out);
BufferedOutputStream (OutputStream out, int size);
 */
//y 数据数据流DataInputStream和DataOutputStream，用于读写基本数据类型和字符串类型的数据。
// DataInputStream和DataOutputStream 用于读写基本数据类型的数据流类。它们可以从底层的输入流或输出流中读取或写入字节，并将其转换为Java中的boolean、byte、short、int、long、float、double或String等类型
//o DataInputStream和DataOutputStream的创建方式是使用一个已存在的输入流或输出流作为参数，构造一个新的数据流对象
//g 可以使用以下代码创建一个DataInputStream对象，从标准输入流中读取数据：
//w DataInputStream dis = new DataInputStream(System.in);
//g 或者，你可以使用以下代码创建一个DataOutputStream对象，向一个文件中写入数据：
//w DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
// o 常用方法
//o read和write方法，用于读写字节、布尔值、整数、浮点数、字符等基本数据类 型。
// read(byte[] b, int off, int len)：从输入流中读取len个字节到字节数组b中，从off位置开始存储。
// read(byte[] b)：从输入流中读取一定数量的字节到字节数组b中。
//o readBoolean()、readByte()、readShort()、readInt() readChar()等：从输入流中读取一个字节或两个字节，并转换为对应的基本数据类型。
//o readLine()和writeBytes()方法，用于读写字符串。
//o readUTF()和writeUTF()方法，用于读写UTF-8编码的字符串。
//o flush(),close()方法，用于刷新和关闭数据流并释放资源
// b -----------------ObjectInputStream反序列化  和ObjectOutputStream序列化 对象流
//o java序列化反序列化是指把java对象转换为字节序列的过程（序列化），以及把字节序列恢复为java对象的过程（反序列化）。这样可以实现对象的持久化存储或网络传输。
// 对象流是一种处理流，可以从底层输入输出流中读写对象或基本数据类型，常用于对象的序列化和反序列化。

//g ObjectInputStream的常用方法有：
//w ObjectInputStream obji = new ObjectInputStream(new FileInputStream("name.typename"));
//g readObject()：从输入流中读取一个对象，并返回该对象的引用。
// 为readObject()方法的返回类型是Object，它是所有类的父类，但是它不能直接调用文件中类特有的方法或访问类特有的字段。为了能够使文件中类的功能，我们需要把它强制类型转换为文件中的类型，这样就可以把它当作一个类对象来使用了。
// w classname s = (className) obji.readObject();
// readInt()、readByte()、readBoolean()等：从输入流中读取一个或多个字节，并转换为对应的基本数据类型。
// readUTF()：从输入流中读取一个UTF-8编码的字符串。

// close()：关闭此输入流并释放与此流关联的所有系统资源。
//g ObjectOutputStream的常用方法有：
// writeObject(Object obj)：将一个对象obj序列化为字节序列，并写入到输出流中。
// writeInt(int v)、writeByte(int v)、writeBoolean(boolean v)等：将基本数据类型或String类型的值转换为一个或多个字节，并写入到输出流中。
// writeUTF(String str)：将字符串str转换为UTF-8编码，并写入到输出流中。

// flush()：刷新此输出流并强制写出所有缓冲的输出字节。
// close()：关闭此输出流并释放与此流关联的所有系统资源

//no PrintStream，用于向输出流中写入格式化的文本数据，支持自动刷新功能。
//no ByteArrayInputStream和ByteArrayOutputStream，用于从内存中的字节数组中读写字节数据。
//no PipedInputStream和PipedOutputStream，用于实现管道通信，即一个线程的输出流可以作为另一个线程的输入流。

import java.io.*;//r 导入流包
import java.io.IOException;//异常导入
import java.util.Arrays;

public class Streamio {
    public static void main(String[] args) {
        Io io = new Io();
        io.wr();// In/OutputStream

    }
}

class Io {
    // b ---------------InputStream outputStream
    InputStream ipt;//使得finally可以有作用域
    public void wr() {
        byte[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };// 声明时初始化
        // g array={1,2,3,4,5,6,7,8,9,};
        // 如果要给一个已经声明过的数组赋予初始值，不能使用大括号{}，而要使用数组名和下标来指定每个元素的值
        // g File file = new File("C:/myfile.txt");//创建文件
        // g FileOutputStream output = new FileOutputStream("C:/myfile.txt", true);
        try (OutputStream opt = new FileOutputStream(
                "/Users/excusemeow/Library/CloudStorage/OneDrive-个人/vscode/JavaNotebook/output.txt") /* 自动创建和自动关闭资源 */) {
            opt.write(array);
            ipt = new FileInputStream(
                    "/Users/excusemeow/Library/CloudStorage/OneDrive-个人/vscode/JavaNotebook/input.txt");
                    ipt.read(array);
                    System.out.println(ipt + "Feil In/OutputStream");
        
        } catch (IOException i) {

            i.printStackTrace();
        } finally {
            try {
                ipt.close();// 需要再次捕捉错误
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}


class ReadWriteFileExample {
    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9,0};

        try (OutputStream output = new FileOutputStream("output.txt");
             InputStream input = new FileInputStream("output.txt")) {
            // 写入文件
            output.write(array);
            System.out.print("\n写入");

            // 读取文件
            byte[] ra = new byte[array.length];
            int count = input.read(ra);//单字节读取
            System.out.println("读取！");
            System.out.println("读取到的字节数：" + count);
            System.out.print("读取到的数组内容：");
            System.out.println(Arrays.toString(ra));
       
            for (byte b : ra) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
