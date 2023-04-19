
// p 输入输出流   流 stream 数据流data stream 
//o Java 提供了多种数据流的实现，根据数据类型、处理方式和功能不同，可以分为字节流、字符流、基本类型流、对象流、缓冲流、转换流、数据流等。
//o Java 的标准数据流分为标准输入流、标准输出流和标准错误输出流等。
// 标准输入流（System.in）用于从键盘读取数据，标准输出流（System.out）用于向控制台输出数据，标准错误输出流（System.err）用于向控制台输出错误信息。
//o io包数据流的4个基本抽象类是指用于定义数据流的基本功能和操作的抽象类，它们是：

//o  InputStream：字节输入流的抽象类，用于从数据源读取字节数据。
//o  OutputStream：字节输出流的抽象类，用于向数据目标写入字节数据。
//o  Reader：字符输入流的抽象类，用于从数据源读取字符数据。
//o  Writer：字符输出流的抽象类，用于向数据目标写入字符数据。

// b ----------------------------------------------InputStream 输入流类有以下几个 抽象方法：
// 访问数据流默认byte类型
// o int read()：从输入流中读取 下一个 字节的值，并返回其整数值，直到流的末尾，则返回 -1。read()可以用于读取二进制/字符数据
// o read(byte[] b) 或 read(char[] c)：从输入流中读取 多个 字节或字符，并将它们存储到字节数组b或字符数组c中，返回实际读取的字节数或字符数，直到流的末尾，返回 -1。??填满整个数组
// o int read(byte[] b, int off, int len)：从输入流中读取最多 len 个字节，并将它们存储到字节数组 b 中，从偏移量 off 开始 返回实际读取的字节数或字符数，如果已到达流的末尾，则返回 -1。。
//跳过 监测和关闭
// o long skip(long n)：跳过并丢弃输入流中的 n 个字节 返回实际跳过的字节数或字符数。
// o int available()：返回在不阻塞的情况下 可以 从输入流中读取的字节数而不是实际剩余可读取。不太准
// o void close()：关闭输入流并释放与之关联的资源。
// 回推常用方法
// o boolean markSupported()：判断输入流是否支持 mark 和 reset 方法。返回布尔值
// o void mark(int readlimit)：在输入流中标记当前位置，参数 readlimit 表示在失效前可以读取的缓冲区最大字节数。
// 该方法将当前位置标记为流中的一个点。readlimit参数指定可以在不失去标记的情况下读取的最大字节数。在读取超过此限制的字节数之后，调用reset()方法将抛出IOException异常。
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
// r 使用 flush() 方法或 close() 方法，将缓冲区中的数据刷新到目标中。
//g write() 方法进行写操作时并不一定直接将所写的内容写出，而先将需要写出的内容放到输出缓冲区，直到缓冲区满、调用 flush() 方法刷新流或调用 close() 方法关闭流时才真正输出。 这样处理可以减少实际的写出次数，提高系统效率。如果需要写出的内容立即输出，需要在完成 write() 方法后调用 flush() 方法。
// r 使用 close() 方法，关闭输出数据流并释放相关资源。

// p -------------------------------------------基本字节数据流类
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
// b ----------------------------------------------------filter过滤器数据流??
//  b 使用bufferedoutputstream和bufferedinputstream可以减少访问磁盘或网络的次数，从而提高文件或网络通信的性能。
//y 缓冲区数据流 BufferedInputStream和BufferedOutputStream，用于为其他输入输出流提供缓冲功能，减少速度差异提高读写效率。
/**
 * o 创建一个新的字节缓冲输入流 不带缓冲区大小即为默认大小
* BufferedInputStream (InputStream in);
BufferedInputStream (InputStream in, int size);
* o 创建一个新的字节缓冲输出流
BufferedOutputStream (OutputStream out);
BufferedOutputStream (OutputStream out, int size);
 */
// r 关闭需要先flush()强制输出
//b 数据数据流 DataInputStream和DataOutputStream，用于读写基本数据类型和字符串类型的数据。
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
//r readLine()可以读取不同类型
//o readUTF()和writeUTF()方法，用于读写UTF-8编码的字符串。
//o flush(),close()方法，用于刷新和关闭数据流并释放资源
// b -------------------------------ObjectInputStream反序列化  和ObjectOutputStream序列化 对象流
//o java序列化反序列化是指把java对象转换为字节序列的过程（序列化），以及把字节序列恢复为java对象的过程（反序列化）。这样可以实现对象的持久化存储或网络传输。
// 对象流是一种处理流，可以从底层输入输出流中读写对象或基本数据类型，常用于对象的序列化和反序列化。
//o Java序列化接口是Java语言提供的一个机制，用于将对象转换为二进制数据流，从而可以在网络上传输或存储到磁盘中。Java中提供了一个Serializable接口，该接口是一个标记接口，没有任何方法需要实现，只要实现了该接口的类就可以进行序列化。
// 一个java对象要能序列化，必须实现一个特殊的java.io.Serializable接口，它是一个空接口，只起到标记的作用。
// 一个java对象要能反序列化，必须保证其所属的类存在，并且具有相同的serialVersionUID，它是一个用来标识类版本的静态常量。
//r 序列化时，不会保存静态变量和瞬态变量（用transient修饰的变量），因为它们不属于对象的状态。
// 序列化时，会保存对象的所有属性（包括私有属性）和方法，以及父类的属性和方法（如果父类也实现了Serializable接口）。
// 序列化时，可以自定义writeObject和readObject方法来控制对象的序列化和反序列化过程。
// 序列化时，可以自定义writeReplace和readResolve方法来替换序列化和反序列化的对象。
// 序列化时，如果对象引用了其他对象，那么这些对象也会被序列化，并且会保持引用关系。
//r 序列化时，如果多次写入同一个对象，那么只会写入第一次的对象内容，后面的只会写入引用信息，以节省空间
//o transient是一个java关键字，它可以修饰一个属性，表示该属性不会被序列化
//g ObjectInputStream的常用方法有：
//w ObjectInputStream obji = new ObjectInputStream(new FileInputStream("path/name.typename"));

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

//r flush()：刷新此输出流并强制写出所有缓冲的输出字节。
// close()：关闭此输出流并释放与此流关联的所有系统资源

//no PrintStream，用于向输出流中写入格式化的文本数据，支持自动刷新功能。
//no ByteArrayInputStream和ByteArrayOutputStream，用于从内存中的字节数组中读写字节数据。
//no PipedInputStream和PipedOutputStream，用于实现管道通信，即一个线程的输出流可以作为另一个线程的输入流。
// p ---------------------------------------------------------基本字符流
// b --------------------------------reader writer
/**
 * 基本字符流是指以字符为单位读写数据的流，主要用于处理文本文件。基本字符流有两个抽象类：Reader和Writer，它们分别是输入字符流和输出字符流的超类。

*g 常用的输入字符流的类有：
* FileReader：从文件中读取字符数据。
*o BufferedReader：从缓冲区中读取字符数据，提高效率。
*o InputStreamReader：将字节流转换为字符流，可以指定编码方式。
* StringReader：从字符串中读取字符数据。
// b ----------------InputStreamReader
*g 常用的输出字符流的类有：
* FileWriter：向文件中写入字符数据。
*o BufferedWriter：向缓冲区中写入字符数据，提高效率。
*o OutputStreamWriter：将字符流转换为字节流，可以指定编码方式。
* PrintWriter：向文本输出流打印对象的格式化表示形式，可以自动刷新。

// o InputStreamReader和OutputStreamWriter是两个字符流类，它们可以将字节流转换为字符流，或者将字符流转换为字节流，可以指定编码方式。
InputStreamReader的主要方法有：
// o 构造方法
*y public InputStreamReader (InputStream in)：使用默认的字符集创建一个InputStreamReader对象，从指定的字节输入流中读取数据。
*y public InputStreamReader (InputStream in, String charsetName)：如enc使用指定的字符集创建一个InputStreamReader对象，从指定的字节输入流中读取数据。
* public String getEncoding ()：返回此流使用的字符编码的名称。
*o public int read ()：从输入流中读取一个字符，并返回其整数值。如果已到达流的末尾，则返回 *1。
*o public int read (char [] cbuf, int offset, int length)：从输入流中读取一些字符，并将它们存储到字符数组 cbuf 中。
*o public boolean ready ()：判断此流是否已准备好被读取。
// g FileReader()是一个构造方法，用来创建一个FileReader对象，它可以从文件中读取字符数据。FileReader类是InputStreamReader类的子类，它使用默认的字符编码和缓冲区大小来读取文件。
//g FileReader()有两种形式，分别是：
// FileReader(File file)：以file指定的文件名创建一个FileReader对象。
// FileReader(String fileName)：以fileName指定的文件名创建一个FileReader对象。
// FileReader类继承了InputStreamReader类的所有方法，如read(), close(), ready()等。它还实现了Closeable和Readable接口。

//b --------------------OutputStreamWriter的主要方法有：
// o 构造方法
*y public OutputStreamWriter (OutputStream out)：使用默认的字符集创建一个OutputStreamWriter对象，向指定的字节输出流中写入数据。
*y public OutputStreamWriter (OutputStream out, String charsetName)：使用指定的字符集创建一个OutputStreamWriter对象，向指定的字节输出流中写入数据。
* public String getEncoding ()：返回此流使用的字符编码的名称。
*o public void write (int c)：向输出流中写入一个字符。
*o public void write (char [] cbuf, int offset, int length)：向输出流中写入字符数组 cbuf 中的一部分。
*o public void write (String str, int offset, int length)：向输出流中写入字符串 str 中的一部分。
*o public void flush ()：刷新该流的缓冲区。
*o public void close ()：关闭此流，但要先刷新它。
// o long skip(long n)：跳过并丢弃输入流中的 n 个字节 返回实际跳过的字节数或字符数。
// o void close()：关闭输入流并释放与之关联的资源。
// 回推常用方法
// o boolean markSupported()：判断输入流是否支持 mark 和 reset 方法。返回布尔值
// o void mark(int readlimit)：在输入流中标记当前位置，参数 readlimit 表示在失效前可以读取的缓冲区最大字节数。
// 该方法将当前位置标记为流中的一个点。readlimit参数指定可以在不失去标记的情况下读取的最大字节数。在读取超过此限制的字节数之后，调用reset()方法将抛出IOException异常。
// o void reset()：将输入流重置到最后一次mark标记的位置。
 */
//g FileWriter是一个用来写入字符数据到文件的类。它是OutputStreamWriter类的子类，它使用默认的字符编码和缓冲区大小来写入文件。FileWriter类实现了Closeable, Flushable, Appendable和AutoCloseable接口。
//g FileWriter有五种构造方法，分别是：
// FileWriter(String fileName)：以fileName指定的文件名创建一个FileWriter对象。
// FileWriter(String fileName, boolean append)：以fileName指定的文件名和append指定的追加模式创建一个FileWriter对象。

// FileWriter(File file)：以file指定的文件名创建一个FileWriter对象。
// FileWriter(File file, boolean append)：以file指定的文件名和append指定的追加模式创建一个FileWriter对象。
//no FileWriter(FileDescriptor fd)：以fd指定的文件描述符创建一个FileWriter对象。
// FileWriter类继承了OutputStreamWriter类的所有方法，如write(), close(), flush(), getEncoding()等。它还可以使用append()方法来追加字符或字符串到文件末尾。

// b ------------------------------------------- BufferedReader的主要方法有：
// 基本通用同前
//  public BufferedReader(Reader in)：构造一个字符缓冲输入流对象，接收一个Reader类的实例。
// o public String readLine() throws IOException：每次读取下一行数据，返回包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null。
// b ------------------------------------------- BufferedWriter的主要方法有：
// 它有一个内部的字节数组buf来存储要写入的数据，当buf满了或者用户调用了flush方法时，它就会将buf中的数据写入到底层输出流中
//r 使用bufferedoutputstream时，为了保证缓冲区中的数据能够及时地写入到底层的输出流中，需要调用flush方法来强制刷新缓冲区。

//  public BufferedWriter(Writer out)：构造一个字符缓冲输出流对象，接收一个Writer类的实例。
//  public void write(String str) throws IOException：写入一个字符串。
// o public void newLine() throws IOException：根据系统来决定换行符。

//b printwriter类是Java IO中的一个类，它可以用来以通常可读的形式（文本）写入输出数据。它继承了抽象类Writer。

// printwriter类的特点是：
//o 它可以将原始数据（int、float、char等）转换为文本格式，然后将格式化的数据写入到输出流中。
//o 它不会抛出任何输入/输出异常，而是需要使用checkError方法来检查是否有错误发生。
//o 它具有自动刷新功能，也就是说，如果调用println或printf方法之一，它会强制将所有数据写入到目标输出流中。

//r 要创建一个printwriter对象，我们需要导入java.io.PrintWriter包，然后使用以下 构造方法之一：
// PrintWriter(OutputStream out)：创建一个新的缓冲输出流，以将数据写入指定的底层输出流。
// PrintWriter(OutputStream out, boolean autoFlush)：创建一个新的缓冲输出流，以将数据写入指定的底层输出流，并指定是否自动刷新。

// PrintWriter(File file)：创建一个新的缓冲输出流，以将数据写入指定的文件。
// PrintWriter(File file, String csn)：创建一个新的缓冲输出流，以将数据写入指定的文件，并指定字符集编码。
// PrintWriter(String fileName)：创建一个新的缓冲输出流，以将数据写入指定的文件名。
// PrintWriter(String fileName, String csn)：创建一个新的缓冲输出流，以将数据写入指定的文件名，并指定字符集编码。

// PrintWriter(Writer out)：创建一个新的缓冲输出流，以将数据写入指定的底层写入器。
// PrintWriter(Writer out, boolean autoFlush)：创建一个新的缓冲输出流，以将数据写入指定的底层写入器，并指定是否自动刷新。

// o printwriter类提供了以下常用方法：
// print()：将指定的数据打印到输出流中。
//o println()：将指定的数据和换行符打印到输出流中。
// println在创建PrintWriter对象时使用FileOutputStream(feil,false)类传入的参数是false会覆盖你的原文件，传入的是true，那么它会在原文件的末尾追加内容
// printf()：使用指定的格式字符串和参数将格式化字符串打印到输出流中。
// append()：将指定的字符序列追加到输出流中。
// flush()：刷新输出流，保证所有数据都被写入到目标输出流中。
// close()：关闭输出流，并释放与之关联的所有资源。
//o checkError()：检查输出流中是否有错误，并返回布尔结果。
// p ----------文件处理
// b ---------------------------------------File类是Java标准库中的一个类，它表示文件和目录的路径名的抽象表示。使用File类，可以在Java中对文件和目录进行操作，例如创建、删除、重命名、遍历等。
// Java File类是java.io包中的一个类，它用于表示文件和目录的抽象路径名。你可以通过File类来创建、删除、重命名、查找文件和目录，以及获取它们的属性信息，但不能用它来读写文件内容。

//r File类有多个构造函数，其中常用的是以下几种：
//o File(String pathname)：通过给定的文件路径字符串构造File对象。
//o File(String parent, String child)：通过给定的父路径字符串和子路径字符串构造File对象。
//o File(pathname)：根据给定的 文件路径字符串 创建一个新的 File 对象。
//o File(File parent, String child)：通过给定的父路径File对象和子路径字符串构造File对象。

// File类的一些常用方法包括：
//g 目录
// boolean createNewFile()：当且仅当不存在具有此抽象路径名指定的名称的文件时，原子地创建由此抽象路径名指定的一个新的空文件。
//o boolean mkdir()：创建此抽象路径名指定的目录。
//o boolean mkdirs()：创建此抽象路径名指定的目录，包括创建必需但不存在的父目录。
//o String[] list()：返回由此抽象路径名所表示的目录中的文件和目录的名称所组成字符串数组。
//g  文件
//o boolean renameTo(File dest)：重新命名此抽象路径名表示的文件。
//o long length()：返回由此抽象路径名表示的文件的长度。
//o boolean delete()：删除此抽象路径名表示的文件或目录。
//g 信息
//o String getName()：返回由此抽象路径名表示的文件或目录的名称。
//o String getPath()：将此抽象路径名转换为一个路径名字符串。
//o String getParent()：返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
//o String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串。
// File getParentFile()：返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。
// list()：获取目录下所有文件和子目录的名称。

// o 文件测试
// boolean canRead()：测试是否可以读取此抽象路径名的文件。
// boolean canWrite()：测试是否可以修改此抽象路径名的文件。
// boolean exists()：测试此抽象路径名的文件或目录是否存在。
// boolean isDirectory()：测试此抽象路径名的文件是否是一个目录。
// boolean isAbsolute() 判断给定的路径名是否是绝对路径名。
// boolean isFile()：测试此抽象路径名的文件是否是一个标准文件。
//b --------------------------------------随机访问文件
// o 随机访问文件是指可以在文件中的任意位置读写数据的一种方式。Java.io包提供了RandomAccessFile类来实现这个功能。1

//o RandomAccessFile类有两个构造方法，可以指定文件名和访问模式。
//w RandomAccessFile(File file, String mode)：以file指定的文件名和mode指定的访问模式创建一个随机访问文件流。
//w RandomAccessFile(String name, String mode)：以name指定的文件名和mode指定的访问模式创建一个随机访问文件流。
//r 访问模式有四种，分别是：
// r：表示以只读方式打开文件。
// rw：表示以读写方式打开文件，如果文件不存在，则创建该文件。
// rws：表示以读写方式打开文件，并对内容或元数据都同步写入底层存储设备。
// rwd：表示以读写方式打开文件，并对文件内容的更新同步更新至底层存储设备

//o 读写方法和data数据流相同
// RandomAccessFile类还可以使用readXXX()或writeXXX()方法来读写各种基本类型的数据和字符串，如readInt(), readLine(), writeChar(), writeDouble()等。
//o RandomAccessFile类有一些特有指针的方法，如：
//r void seek(long pos)：将文件记录指针定位到pos的位置 。
//r long getFilePointer()：返回文件记录指针的当前位置 从读写指针位置开始写入文件。
// int skipBytes(int n)：跳过n个字节，返回数为实际跳过的字节数。
//o long length()：返回文件长度。
// void setLength(long newLength)：设置文件长度，如果扩展了文件，其新增部分的字节为零。

//异常导入
import java.io.*;//r 导入流包
import java.util.Arrays;

class Io {
    // b ---------------InputStream outputStream
    InputStream ipt;// 使得finally可以有作用域

    public void wr() {
        // byte[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };// 声明时初始化
        byte[] array = { 066, 065, 67, 68, 69 };// 声明时初始化
        // 如果要给一个已经声明过的数组 赋予初始值，不能使用大括号{}，而要使用数组名和下标来指定每个元素的值
        // g File file = new File("C:/myfile.txt");//创建文件
        // g FileOutputStream output = new FileOutputStream("C:/myfile.txt", true);
        try (OutputStream opt = new FileOutputStream("JavaNotebook/output.txt");
        /* 自动创建和自动关闭资源 */) {

            opt.write(array);// -------写入
            ipt = new FileInputStream("JavaNotebook/output.txt");// r 在写 后面否则空报错
            // -----------mark
            if (ipt.markSupported()) {
                System.out.println("支持mark");
                ipt.mark(5);// 读取前
                ipt.reset();// 读取后超出会报错
            }

            byte[] i = new byte[10];
            int byteRead = ipt.read(i);// r ----------读取到i 返回读取到的字节数

            while (byteRead != -1) { // ？？？读取过就会无
                System.out.println(
                        "--------------in/outstream\n字符集加数字  " + new String(i, 0, byteRead) + Arrays.toString(i));
                System.out.print("计数" + byteRead);
                byteRead = ipt.read(i);// 无剩余可读取字节数 -1
                System.out.println("  计数" + byteRead);
            }

            byte[] ii = new byte[10];
            ipt.read(ii);
            System.out.println("输入Feil In/OutputStream" + Arrays.toString(ii) + "  \n" + "直接打印对象为" + ipt + opt);// 需要重新写入

        } catch (IOException i) {

            i.printStackTrace();
        } finally {
            try {//
                if (ipt != null) {// 不为空
                    ipt.close(); // 需要再次捕捉错误
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

// g ---------------------------------序列化
class Person implements Serializable {

    String name;
    String gf;
    Integer age;// r age 属性声明为 Integer 类型而不是 int 类型。Integer 类型是一个包装器类，它实现了 Serializable 接口

    public Person(String name, String gf, Integer age) {
        // 赋予给当前创建的对象
        this.name = name;
        this.gf = gf;
        this.age = age;
    }

    public String toString() { // 重写toString()方法
        return "Person{" + name + gf + age + '}';
    }
}

class Obj {
    public Obj() {

        try {
            // 写入对象 // 创建对象文件输出流，指定文件名
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaNotebook/person.txt"));
            OutputStreamWriter osw = new OutputStreamWriter(oos, "UTF-8");
            Person p = new Person("Lolita", "单身狗", 18); // 创建一个Person对像
            oos.writeObject(p); // 序列
            oos.close();

            // 读取对象// 创建对象 文件输入流，
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("JavaNotebook/person.txt"));
            Person pi = (Person) ois.readObject(); // 读取对象，需要强制转换为Person类型 反序列
            ois.close(); //
            System.out.println("---------------objectin/outputstream\n" + pi.age + pi.gf + pi.name);// 调用属性
            System.out.println(pi);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException c) {
            System.out.println(c);
        }
    }

}

// g ---------------------------bufferreader /writer
class Rw {
    public Rw() {
        try {
            // 创建一个文件输出流和一个缓冲输出流，用于写入目标文件
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("JavaNotebook/target.txt"));

            // 创建一个文件输入流和一个缓冲输入流，用于读取源文件
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("JavaNotebook/target.txt"));

            // 定义一个字节数组和一个变量，用于存储从缓冲输入流中读取的数据和长度
            byte[] buffer = new byte[1024];
            int len = 0;
            // 循环读取缓冲输入流中的数据，直到返回-1表示结束
            while ((len = bis.read(buffer)) != -1) {
                // 将读取的数据写入到缓冲输出流中
                bos.write(buffer, 0, len);
            }
            // g --------------------------printwriter println/printf
            try {
                // 创建一个File对象，表示要写入的文件
                String file = "JavaNotebook/person.txt";
                // 创建一个PrintWriter对象，使用UTF-8编码
                PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));
                // 创建一个BufferedReader对象
                BufferedReader bf = new BufferedReader(new FileReader(file));
                // 写入一些数据

                System.out.println("-----------------bufferreader/writer\n---printwriter println/printf");
                pw.println("喵喵喵!");
                pw.printf("loli %d years old\n", 18);// 格式化输出
                pw.append("喵？");
                System.out.println("没刷新 " + bf.readLine());

                // 刷新并关闭输出流
                String ln;
                pw.flush();
                while ((ln = bf.readLine()) != null) {
                    System.out.print(ln);
                }
                System.out.println("");
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            // 刷新缓冲输出流
            bos.flush();
            // 关闭缓冲 内部会自动关闭底层的文件流
            bos.close();
            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class RandomAccessF {
    public RandomAccessF() {
        try (RandomAccessFile raf = new RandomAccessFile("JavaNotebook/random.txt", "rw")) // 自动关闭资源
        {
            raf.seek(2);// 指针运动
            raf.write('a');
            raf.write(65);// 字符集A的码
            raf.write('1');
            raf.writeUTF("Meow?");//utf字符串
            raf.seek(0);// 指针运动以读取
            System.out.println("----------RandomAccessFile随机读写");  
            System.out.println(raf.readLine());    
            } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Streamio {
    public static void main(String[] args) {
        Io io = new Io();
        io.wr();// In/OutputStream
        Obj ob = new Obj();
        Rw rw = new Rw();
        RandomAccessF raf = new RandomAccessF();
    }
}
