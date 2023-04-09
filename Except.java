
//r 所有的异常类是从 java.lang.Exception 类继承的子类。
//r Exception 类是 Throwable 类的子类。除了Exception类外，Throwable还有一个子类Error 。
// p Java中的异常分为两种类型：检查异常（Checked Exception）和运行时异常（Unchecked Exception）
// b 检查异常通常在编译时就会被检测出来，程序员必须在代码中 显式地处理 这些异常或者在方法签名中使用throws语句声明抛出异常。
// 这些通常是程序中的错误或者异常情况，如文件不存在、网络连接失败。常见的检查异常IOException、SQLException、ClassNotFoundException
/**
 *o 下面的表中列出了 Java 定义在 java.lang 包中的检查性异常类。
ClassNotFoundException	应用程序试图加载类时，找不到相应的类，抛出该异常。
CloneNotSupportedException	当调用 Object 类中的 clone 方法克隆对象，但该对象的类无法实现 Cloneable 接口时，抛出该异常。
IllegalAccessException	拒绝访问一个类的时候，抛出该异常。
InstantiationException	用 Class 类中的 newInstance 方法创建一个类的实例，而指定的类对象因为是一个接口或是一个抽象类无法实例化时，抛出异常。
InterruptedException	一个线程被另一个线程中断，抛出该异常。
NoSuchFieldException	请求的变量不存在
NoSuchMethodException	请求的方法不存在
 */
//b 运行时异常则不需要显式地捕获或声明，程序员可以选择处理或者 不处理这些异常。
// 这些异常通常是由程序的逻辑错误或者其他不可预测的因素引起的，如数组越界、空指针异常 
// 常见运行时异常NullPointerException、ArrayIndexOutOfBoundsException、ClassCastException
//p 错误（Error）
//b 错误通常表示虚拟机出现了严重的错误，例如OutOfMemoryError等。与异常不同，错误通常是不可恢复的，程序 不能对其进行处理。
// 例如OutOfMemoryError等。与异常不同，错误通常是不可恢复的，程序不能对其进行处理。
/**
 *o Java 根据各个类库也定义了一些其他的异常，下面的表中列出了 Java 的非检查性异常。
ArithmeticException	   当出现异常的运算条件时，抛出此异常。例如，一个整数"除以零"时，抛出此类的一个实例。
ArrayIndexOutOfBoundsException	用非法索引访问数组时抛出的异常。如果索引为负或大于等于数组大小，则该索引为非法索引。
ArrayStoreException	   试图将错误类型的对象存储到一个对象数组时抛出的异常。
ClassCastException	   当试图将对象强制转换为不是实例的子类时，抛出该异常。
IllegalArgumentException	抛出的异常表明向方法传递了一个不合法或不正确的参数。
IllegalMonitorStateException	抛出的异常表明某一线程已经等待对象的监视器，或试图通知其他正在等待对象的监视器而本身没有指定监视器的线程。
IllegalStateException	在非法或不适当的时间调用方法时产生。换句话说，即 Java 环境或 Java 应用程序没有处于请求操作所要求的适当状态下。
IllegalThreadStateException	线程没有处于请求操作所要求的适当状态时抛出的异常。
IndexOutOfBoundsException	指示某排序索引（例如对数组、字符串或向量的排序）超出范围时抛出。
NegativeArraySizeException	如果应用程序试图创建大小为负的数组，则抛出该异常。
NullPointerException	当应用程序试图在需要对象的地方使用 null 时，抛出该异常
NumberFormatException	当应用程序试图将字符串转换成一种数值类型，但该字符串不能转换为适当格式时，抛出该异常。
SecurityException	    由安全管理器抛出的异常，指示存在安全侵犯。
StringIndexOutOfBoundsException	此异常由 String 方法抛出，指示索引或者为负，或者超出字符串的大小。
UnsupportedOperationException	当不支持请求的操作时，抛出该异常。
 */
//b Java异常处理机制通过使用try-catch-finally块来实现异常处理。
/**  将可能抛出异常的代码放置在try，如果发生异常，则会跳转到相应的catch块进行异常处理。
*catch可以捕获指定类型的异常，并进行相应处理。
*finally中的代码无论是否发生异常会在try和catch之后执行，确保程序资源得到释放。*/
// o 只会成功捕捉一次后面的忽略

//w   try {
//     //o 有可能抛出异常的代码
//w   } catch (ExceptionType1 e) {
//     //o 处理ExceptionType1类型的异常 通过e来引用异常对象
//w   } catch (ExceptionType1 e)
//     // 处理ExceptionType2类型的异常
//w   } finally {
//     // 在try-catch块执行结束后执行的代码
//w }
// o finally块中的代码会在try-catch块执行结束后被执行，即使在try块中有return语句也不会影响finally块中的代码执行。
// finally块中的代码可以用来释放资源，比如关闭文件、数据库连接、网络连接等，以确保资源得到及时的释放和回收。
/**
 *r try-with-resources语句是java中的一种特殊的try语句，它可以声明一个或多个资源，并在语句结束时自动关闭它们。
 *资源是指必须在程序使用完毕后关闭的对象，例如文件、流、数据库连接等
 *w try (resource1; resource2; …) { // 代码块，可能会抛出异常 } catch (ExceptionType e) { // 代码块，处理异常 }
 *其中，resource1, resource2等是要声明的资源，它们必须在括号内初始化
 */ 

/**
 * b 以下是常见的Java公共异常：
*o NullPointerException（空指针异常）：当应用程序试图在需要对象的地方使用 null 时，抛出该异常。
ClassCastException（类转换异常）：当试图将对象强制转换为不是其实例的子类时，抛出该异常。
IllegalArgumentException（非法参数异常）：当向方法传递不合法的参数时，抛出该异常。
*o ArrayIndexOutOfBoundsException（数组下标越界异常）：当访问数组中不存在的索引时，抛出该异常。
*o ArithmeticException（算术异常）：当出现除数为零等算术条件时，抛出该异常。
SecurityException（安全异常）：当试图违反安全性时，抛出该异常，例如试图访问未授权的资源。
*r IOException（输入输出异常）：当试图执行输入/输出操作，但出现异常时，抛出该异常，例如读取不存在的文件。
InterruptedException（中断异常）：当一个线程处于等待、休眠或占用状态时，另一个线程对其进行中断时，抛出该异常。
*r RuntimeException（运行时异常）：当程序在执行时出现错误时，抛出该异常。例如，数组下标越界，空指针引用等。
ConcurrentModificationException（并发修改异常）：当多个线程同时修改同一个对象时，抛出该异常。
*o NegativeArraySizeException，表示尝试创建一个大小为负数的数组
*/

// p 抛出异常 可以使用 throw 关键字来抛出异常。

//r 使用 throw 抛出异常时，方法必须使用 throws 关键字声明它可能会抛出的异常类型
//r 使用 throw 需要配合 try 抛出 catch处理  throw new创建异常实例
//r 或由调用方法者处理 需要方法子句 throws 自定义异常类型 throw new创建异常实例
//例如 public static error2() throws IOException 

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// r 例如
class Example {
    public static void main(String[] args) {
        try {
            throw new Exception("--------------这是一个自定义异常信息"); // 抛出自定义异常
        } catch (Exception e) {
            System.out.println(e.getMessage()); // 捕获并输出自定义异常信息
        }
    }
}

public class Except {
    public static void main(String[] args) throws IOException {// r throws 带s的声明
        /**
         * o FileOutputStream是一个JavaIO类，用于写入字节数据到文件中。
         * out是一个变量名，可以根据需求来命名。而null是一个特殊值，表示变量out当前没有指向任何对象。
         * 通常在声明变量时，将其初始化为null是一个好习惯，以避免空指针异常的发生。
         */

        // 声明并初始化变量out为null
        FileOutputStream out = null;

        try {
            Example.main(args);
            // 创建FileOutputStream对象，并指定文件名为"meow.txt" 目录meow不存在
            out = new FileOutputStream("/Users/excusemeow/Library/CloudStorage/OneDrive-个人/vscode/java/moew/meow.txt");
            // 调用out.write()方法，将字符串转换为字节数组并写入文件中
            out.write("Hello, world!".getBytes());

            // 捕获异常，并输出异常信息
        } catch (FileNotFoundException e) {
            System.out.println("-------------catch 输出一个file not found错误错误 " + e.getMessage());
            // o throw new创建异常实例 抛出异常
            throw new IOException("------------- throw new IOException 喵喵能做错什么呢");

            // o 捕获throw的 IOException异常，并输出异常信息
        } catch (IOException e) {
            // 自动生成的块catch block
            e.printStackTrace();
        } finally {
            // o 在finally块中关闭文件流
            if (out != null) {
                try {
                    out.close();// close方法也可能抛出IOException异常，因此需要在finally块中进行处理
                } catch (IOException e) {
                    // 捕获IOException异常，并处理异常（通常不需要处理，只需记录日志即可）
                }
            }
        }
    }

}
