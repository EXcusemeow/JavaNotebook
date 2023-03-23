
//  p -------------scanner类 输入
//o System.in 是一个连接控制台程序和键盘输入的 InputStream 流，可以读取用户从键盘输入的数据。有以下几种常用方法读取控制台的输入：
//  System.in.read()： 返回输入数值的 ASCII 码，该值为 0 到 255 范围内的 int 字节值，若返回值为 -1，则表示没有读取到任何字节，读取结束。
// - BufferedReader 包装 System.in：使用 BufferedReader 类的 readLine() 方法可以一次读取一行字符串，但需要先将 System.in 转换为 InputStreamReader 对象，再传递给 BufferedReader 的构造器。

//r 需要创建对象 ! ! !
// r Scanner 包装 System.in：使用 Scanner 类可以方便地从控制台读取各种类型的数据，如整数、浮点数、字符串等，只需调用相应的 nextXXX() 方法即可。
//o next()：读取一个字符串，以空白字符（空格、制表符、换行符等）为分隔符。空格分开的多个字符每次调用会依次下一个.
//o nextInt()：读取一个整数，以空白字符为分隔符。
//o nextDouble()：读取一个双精度浮点数，以空白字符为分隔符。
//o nextLine()：读取一行字符串，以换行符为分隔符。
//o nextBoolean()：读取一个布尔值，以空白字符为分隔符。

import java.util.Scanner; // 导入Scanner类
import java.text.DecimalFormat;
import java.text.NumberFormat;//导入NumberFormat类

public class scan {

    public static void main(String[] arg) {
        // o 创建Scanner对象，接收从控制台输入c
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入2个str ：");

        // b ---------------------读取字符串
        String s = scanner.next();
        char c = scanner.next().charAt(0); // r 读取第一个字符qas
        System.out.println("输入的是 " + s + " 康康几个数 " + s.length() + "\n 字符0号" + c + "\n输入 int"); // 输出字符串
        // b -----------------------读取一个整数
        int n = scanner.nextInt();
        System.out.println("钥匙三块一把 你配个几把 " + n);
        Double weight, height, bmi;
        System.out.println("---------------------------------asDecimalFormat\n"+"输入w浮点");
        weight = scanner.nextDouble();// 读取double
        System.out.println("输入h浮点十以内");
        height = scanner.nextDouble();// 读取
        bmi = weight / height / height;

        // b ---------------------实例化decimalformat使用 格式参数为 0.##两位小数 左边0写零
        DecimalFormat decf = new DecimalFormat("0.##");
        // b --------------------格式化为不带千位分隔符、保留两位小数的字符串
        DecimalFormat df = new DecimalFormat("0.00");
        String str1 = df.format(bmi);// 字符化
        System.out.println(str1); // 输出

        // b ----------------------格式化为带千位分隔符、保留两位小数的字符串
        df = new DecimalFormat("#,##0.00");
        String str2 = df.format(bmi);
        System.out.println(str2); // 输出：

        // b -----------------------格式化为带货币符号、带千位分隔符、保留两位小数的字符串
        df = new DecimalFormat("¤#,##0.00");
        String str3 = df.format(bmi);
        System.out.println(str3); // 输出：

        System.out.println("两位小数bmi " + decf.format(bmi)); // 数字格式化为字符串输出
        scanner.close(); // o 关闭Scanner对象string 防泄漏

        // b ----------------------NumberFormat格式化输出对象
        Numfor num = new Numfor();
    }

}

// p -----------------------DecimailFormat 格式化输出
/**
 * b 格式化为不带千位分隔符、保留两位小数的字符串
 * DecimalFormat df = new DecimalFormat("0.00");
 * b 格式化为带千位分隔符、保留两位小数的字符串
 * df = new DecimalFormat("#,##0.00");
 * b 格式化为带货币符号、带千位分隔符、保留两位小数的字符串
 * df = new DecimalFormat("¤#,##0.00");
 */
// p -------------------------Numberformat 格式化输出
// o NumberFormat可以用于将数字格式化为本地化的字符串，或者将本地化的字符串解析为数字。

// b NumberFormat.format() 方法可将数字格式化为本地化的字符串。
// double num = 12345.67;
// String formattedNum = numberFormat.format(num);
// System.out.println(formattedNum); // 输出：12,345.67
// b NumberFormat.parse() 方法可将本地化的字符串解析为数字。
// String str = "12,345.67";
// double num = numberFormat.parse(str).doubleValue();
// System.out.println(num); // 输出：12345.67
// b NumberFormat.setGroupingUsed() 方法可设置是否启用分组（即千位分隔符）。
// numberFormat.setGroupingUsed(false); // 禁用分组
// NumberFormat.setMaximumFractionDigits() 和

// NumberFormat.setMinimumFractionDigits() 方法可设置小数部分的最大和最小位数。
// numberFormat.setMaximumFractionDigits(2); // 小数部分最多两位
// numberFormat.setMinimumFractionDigits(2); // 小数部分最少两位

// b NumberFormat.setRoundingMode() 方法可设置舍入模式。
// numberFormat.setRoundingMode(RoundingMode.HALF_UP); // 四舍五入

// r ---------------------------- NumberFormart返回实例 不能实例化
// o NumberFormat.getInstance() 方法可返回默认的NumberFormat实例，它基于默认的本地化设置。o
class Numfor {
    // 类的构造器
    public Numfor() {
        Double d = 12345.123456789;
        Double db = 12345.12345;
        // r numberformat不能实例化 只能初始化化 "format(d)"方法将数字格式化为 字符串。
        String str = NumberFormat.getInstance().format(d);
        System.out.println("----------------------------默认格式NumberFormat.getInstance() " + str);
        // o NumberFormat.getCurrencyInstance() 方法可返回一个用于格式化货币值的实例。通用
        str = NumberFormat.getCurrencyInstance().format(d);
        System.out.println("货币/通用格式 " + str);
        // o NumberFormat.getNumberInstance() 方法可返回一个用于格式化通用数字的实例instance。
        str = NumberFormat.getNumberInstance().format(d);
        System.out.println("通用数字格式 " + str);
        // o NumberFormat.getPercentInstance(); 方法 对象格式化数字为百分比形式：
        str = NumberFormat.getPercentInstance().format(d);
        System.out.println("百分比数字格式 " + str);

        // b 方法控制整数部分的最大位数 和 小数部分的最小位数：
        // r -----------------初始化化 通用数字
        NumberFormat numb = NumberFormat.getInstance();
        // o NumberFormat.getInstance().setMaximumIntegerDigits() 无返回值 void 类型的方法
        // -------------------格式化小数最小位数
        numb.setMinimumFractionDigits(2);
        System.out.println("小数最小位数 " + numb.format(d));

        numb.setMaximumIntegerDigits(3);
        // -------------------格式化整数最大位数
        System.out.println("整数最大位数 " + numb.format(d) + "\n随便定的数字  " + numb.format(123456.1234567));

    }

}
