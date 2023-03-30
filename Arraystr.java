
//p 数组 一组同类型的数据的集合，可以使用数组来存储和操作多个数据。数组是一个对象，它可以包含任何类型的数据，包括基本数据类型和引用数据类型。
// 数组有以下几个特点：
// 数组是固定长度的，一旦定义了数组的长度，就不能再改变它的大小。
// 数组中的每个元素都有一个下标，下标从0开始，逐个递增。
// 数组中的元素可以是任何类型，包括基本类型和引用类型。
// 数组在内存中是连续存储的，所以可以通过下标来快速访问数组中的元素。
// r 导入arrays包
import java.util.Arrays;
// r 导入Collectors包   collect() 方法收集列表。
import java.util.stream.Collectors;

import org.w3c.dom.css.ViewCSS;

import java.util.Vector; // 向量
import java.util.ArrayList;// 向量更新换代

//b ----------------------------------------------- 数组可以通过以下方式来创建和访问：
// r import java.util.Arrays;
// 声明数组变量
// type[] arrayName;
// 创建一个数组
// arrayName = new type[arraySize];  或者合并声明type[] arrayName = new type[arraySize];
//o 或者静态初始化type[] arrayName = {value1, value2, ..., valueN};

public class Arraystr {
    public static void main(String[] args) {

        int[] nums = new int[10];// o 创建一个长度10的整型数组对象
        int firstN = nums[0]; // 访问int数组中的第一个元素
        String[] words = { "hello", "world", "java" }; // 创建静态初始化数组
        String[] wd = { "奶", "奶", "滴", "不", "喝" }; // 修改数组中元素
        words = wd;
        words[4] = "喝, 是, 吧!!!";

        // b -------------------------------多维数组中可以使用以下方式进行初始化：
        // o 使用大括号和逗号分隔符来初始化多维数组
        // o 使用for循环语句初始化一个二维数组
        // o 使用Arrays.fill()方法初始化
        int[][] arrayi = { { 1, 2 }, { 3, 4, 5 }, { 6 } };// 初始化了一个2维数组，第一行有2个元素，第二行有3个元素，第三行有1个元素
        int[][] arrayf = new int[3][3];
        // 使用for循环语句初始化一个3x3的二维数组，并为每个元素赋值为其所在行和列的和。
        for (int i = 0; i < arrayf.length; i++) {
            for (int j = 0; j < arrayf[i].length; j++) {
                arrayf[i][j] = i + j;
            }
        }
        //no 使用Arrays.fill()方法初始化一个3x3的二维数组，并为每个元素赋值为1。
        int[][] array1 = new int[3][3];
        for (int[] row : array1) {
            // r 调用arrays包fill()方法
            Arrays.fill(row, 1);
        }

        int[][] num3x4 = new int[3][4]; // 创建一个3行4列的二维数组
        // 对二维数组进行赋值
        num3x4[0][0] = 0;
        num3x4[1][2] = 0;
        // b ------------------------------System.arraycopy()修改数组多个元素

        // b 嵌入数组System.arraycopy(src ,srcPos ,dest ,destPos ,length) 方法的参数如下
        // w (Object src, int srcPos, Object dest, int destPos, int length)
        // g 源数组（Object 类型）：表示要被复制的原始数组。
        // g 源数组起始位置（int 类型）：表示要复制的原始数组的开始位置。
        // 目标数组（Object 类型）：表示数组复制的目标位置。
        // 目标数组起始位置（int 类型）：表示目标数组中的起始位置。
        // g 要复制的元素数量（int 类型）：表示要复制的元素数量。

        int num2[] = { 1, 2, 3, 4, 5 };
        System.arraycopy(num2, 0, nums, 2, 5); // o 修改替换元素
        System.out.println("\n---------------嵌入数组System.arraycopy(src ,srcPos ,dest ,destPos ,length) ");
        // p 打印整个数组Arrays类和其中的toString()方法。 多维数组deepToString()方法
        // r 使用Arrays.toString()或Arrays.deepToString()方法打印数组时，数组的元素类型必须是对象类型，而不是基本类型。
        // b ---------------------------- 打印整个数组 Arrays类和toString()方法
        System.out.println("-------------------Arrays.toString(nums)方法打印单维" + "\n" + Arrays.toString(nums));
        System.out.println(Arrays.toString(words));
        // b 打印基本类型数组，可以使用引入的Arrays.stream()方法和引入的IntStream类。
        // Stream API，将数组转换为一个流，然后使用 .boxed() 方法将流中的元素包装成相应的包装类型，如 int 被封装成 Integer。
        // 最后使用.collect方法(Collectors.toList()) 将流中的元素收集到一个列表中。
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("--------------------Arrays.stream(arr).boxed().collect( Collectors.toList() )方法打印单维" + "\n"
                + Arrays.stream(arr).boxed().collect(Collectors.toList()));
        // b ----------------------------打印整个多维数组，使用Arrays.deepToString()方法。
        int[][] arr1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        System.out.println("--------------------Arrays.deepToString( arr1 )方法打印多维" + "\n"
                + Arrays.deepToString(arr1));
        System.out.println("-------------------Arrays.toString( arr1[1] )方法打印多维的一维 " + "\n" + Arrays.toString(arr1[1]));
        AverageArray.ave();
    }
}

// b 求平均-------------------------------------------------
class AverageArray {

    public static void ave() {

        int[] array = { 5, 10, 15, 20, 25 };// 创建一个数组并初始化
        int sum = 0; // 声明变量并初始化为零

        // 遍历数组并将每个元素加到总和中
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // 计算平均值 (double)类型转换
        double average = (double) sum / array.length;
        System.out.println("平均值: " + average);
    }
}
// p 字符串 String 可变的字符串类 StringBuilder 和 StringBuffer
// 如果需要频繁修改字符串的内容，建议使用StringBuilder或StringBuffer，而不是String。因为每次对String对象进行修改都会创建一个新的String对象，会造成额外的内存消耗。

// b -------------------------SBB 共有操作 String类 StringBuilder 和StringBuffer字符类

// y 获取字符串长度：使用length()方法来获取字符串的长度。如 int length = str.length();
// g .length() 方法只适用于字符串类型，对于其他类型的数组，如整数数组，应该使用 .length 属性来获取数组的长度。
// r equals()：判断两个字符串是否相等。sbb对象的引用是否相等
// o charAt()：获取字符串中指定位置的字符。char charAt(int index)
// o subString(,)：获取字符串的一个子串。String substring(int beginIndex, int endIndex)
// g String sub = str.substring(0, 5);
// no indexOf()：查询一个字符或子串在字符串中的位置。Builder 和 Buffer需要new创建一个对象来调用该方法。

class Stringsbb {
    public static void main(String[] args) {
        Stringsbb st = new Stringsbb();// 类实例才能调用非静态 可用stri();直接调用静态方法
        System.out.println("\n--------------------------------SBB通用\n");
        st.strsbb();
        System.out.println("--------------------------------String\n");
        st.stri();
        System.out.println("--------------------------------StringBuffer\n");
        st.strbf();
    }

    // b -------------------------SBB
    public void strsbb() {

        String str1 = " 喵 喵 喵 ";
        String str2 = new String("Meow");
        StringBuffer sb = new StringBuffer(str2);
        StringBuffer sb2 = new StringBuffer("Meow");
        // -----------------------------有操作的呀
        // g .length() 方法只适用于字符串类型，对于其他类型的数组，如整数数组，应该使用 .length 属性来获取数组的长度。
        System.out.println("sb.length()方法来获取字符串的长度  " + sb.length());
        System.out.println("sb.equals(sb2)：判断两个字符串是否相等。sbb对象的引用是否相等" + str2.equals(sb.toString()) + sb.equals(sb2));
        System.out.println("sb.charAt(0)获取字符串中指定位置的字符" + sb.charAt(0));
        System.out.println("sb.subString(1,4)不包含4：获取字符串的一个子串" + sb.substring(1, 4));

    }

    // b --------------------------------------------------------------以下是一些 String
    // 基本的字符串操作：

    /**
     * o 创建字符串：可以使用双引号（""）来创建一个字符串。也可以直接声明一个变量
     * 例如，String name ="names";。在使用字符串字面量声明字符串时，Java会在编译时自动将字符串字面量转换为String对象。
     * g 也可以用 字符数组 和new创建字符串 字符串数组不行
     * g 也可以直接赋值字面量或者new建立对象后初始化
     */
    // ------------------------------------------------------------真正的操作
    // o 比较str1.compareTo(str2)如 int result = str1.compareTo(str2);
    // 方法来比较两个字符串字典序Unicode值大小 大写<小写 方法返回一个正负整数值。如相等，则返回0
    // no .compareToIgnoreCase(String str)：比较字符串对象的大小，不考虑大小写。
    // o 比较字符串：使用equals()方法来比较两个字符串是否相等。如if(str1.equals(str2)) { }
    // r 比较字符串 使用 == 来比较两个字符串是否是同一实例
    // equalsIgnoreCase(String str)：比较字符串对象是否相等，不考虑大小写。
    // o 开头检测.startsWith(str) 结果是boolean值 方法用于检查一个字符串是否以另一个字符串作为前缀开头。
    // no endsWith(String )：判断字符串对象是否以指定的后缀结尾。
    // o regionMatches(int toffset, String other, int ooffset, int len)：
    // o 比较从toffset开始len个字符是否相等，另一个字符串从ooffset开始。
    // regionMatches(boolean , int, String, int, len)：
    // 与regionMatches方法相同，但可以选择是否忽略大小写。
    // o 消除空格.trim()：去除字符串两端的空格 会返回一个新的对象。str.trim()
    /**
     * o 替换字符串：使用replace( , )方法来替换字符串中的某个子串或字符
     * g string.replace (oldChar/str , newChar/str)
     * 如String newStr= str.replace("World", "Java");
     */
    // o 将字符串转换为大写或小写：String stru = str.toUpperCase()/= str.toLowerCase();
    // o 连接字符串str1.concat("str").concat(str2) 和 加号+连接两个字符串= "str"+str2;。

    /**
     * o type.valueof( value)是一种将 字符串 数字 对象互相转换的方法.
     * String str = "123";
     * int num = Integer.valueOf(str);
     * String str = String.valueOf(num);
     */
    // no 检查字符串是否包含特定的子字符串：boolean contains = str.contains("substring");
    // no 查找字符串：变量str使用indexOf()方法来查找字符串中是否包含某个子串首次出现位置。
    // no 如 万恶之源 和int index = str.indexOf("World");值-1为不存在
    // no int index = str.toLowerCase().indexOf("world"); // index = 6，不区分大小写查找

    // b ---------------------------String
    public void stri() {

        String str1 = " 喵 喵 喵 ";
        String str2 = new String("Meow");
        String str3 = new String(str1);

        char[] arr = { 'E', 'x', 'c', 'u', 's', 'e' };
        String strArr = new String(arr);// 字符数组 和new创建字符串(
        System.out.println("\nstr1 + str2 + strArr " + str1 + str2 + strArr);
        // -----------------------------有操作的呀
        System.out.println("-----------比较/n");
        int result = str1.compareTo(str2);
        int result1 = strArr.compareTo(str2);
        System.out.println("str1.compareTo(str2) 字典序比较结果是  " + result);
        System.out.println("strArr.compareTo(str2) 字典序比较结果是  " + result1);
        boolean eq = str1.equals(str2);
        System.out.println("str1.equals(str2) 是否相等比较结果是  " + eq + "  equalsIgnoreCase(String)：比较字符串对象是否相等，不考虑大小写。");
        boolean eqeq = str1 == str3;
        System.out.println("str1==str3是否同一实例" + eqeq);
        System.out.println("str2.startsWith(\"M\")是否以m开头  " + str2.startsWith("M") + "  endsWith(String ):后缀略");
        boolean rm = str2.regionMatches(1, strArr, 0, 1);
        boolean irm = str2.regionMatches(true, 1, strArr, 0, 1);
        System.out.println("str2.regionMatches(1, strArr , 0, 1)比较从toffset开始len个字符e是否相等，另一个字符串从ooffset字符E开始 " + rm);
        System.out.println("增加了是否忽略大小写regionMatches(boolean , int, String, int, len)" + irm);
        System.out.println("\n---------修改\n");
        System.out.println("str1.trim() 去除字符串两端的空格 会返回一个新的对象  " + str1.trim());
        System.out.println("strArr.replace(\"e\",str2) 方法来替换字符串中的某个子串或字符  " + strArr.replace("e", "e" + str2));
        System.out.println("str2.toUpperCase()/toLowerCase() 大小写" + str2.toUpperCase() + str2.toLowerCase());
        System.out.println("连接字符串" + str1.concat(str2) + " 加号+连接两个字符串= " + str1 + str2);
        String str = "123";
        int num = Integer.valueOf(str);
        System.out.println("type.valueof( value) Double  " + Double.valueOf(num) + "Boolean  " + Boolean.valueOf(str));
        // -------------------------------

    }

    // b ------------------------------------------StringBuilder和StringBuffer类基本操作
    // StringBuilder和StringBuffer类之间的区别在于线程安全性。StringBuilder是一个非线程安全的类，适用于单线程环境下的字符串拼接操作。StringBuffer是一个线程安全的类，适用于多线程环境下的字符串拼接操作。
    // o 不能用直接赋值字面量来创建 可以new创建 也可以直接声明一个变量

    /**
     * no equals()用于比较StringBuilder和StringBuffer对象的引用是否相等
     * 将StringBuilder对象转换为String对象，再使用equals()比较
     * no if (sb1.toString().equals(sb2.toString())) {}
     */
    // 修改字符串的方法，例如append()、insert()、delete()、replace()等方法。这些方法可以用来修改StringBuilder和StringBuffer对象的内容，而不会创建一个新的对象。
    // o 修改.replace(int start, int end, String str)如sb.replace(6, 10, "Python");
    // o 追加append(char/str)：在字符串的末尾追加字符或字符串。
    // o 插入insert(int , char/str)：在字符串的指定位置插入字符或字符串。
    // o delete(int start, int end)：删除字符串中的指定字符(int start ) 或一段字符。
    // o capacity() 方法返回目前对象内的字符数组的容量可用于存储字符串的缓冲区的大小。
    // g 如果字符串的长度超过了容量，则在执行字符串修改操作时，这些类会自动扩展其容量以适应新的字符数据。
    // g ensureCapacity(int minCapacity) 方法可用于确保 对象具有至少指定的最小容量。
    // 指定值如果小于当前容量，则不会修改对象的当前容量。
    // no toString()方法将SB对象转换成字符串。String str = sb.toString();
    // no reverse()方法将SB对象中的字符反转。sb.reverse();

    // b ---------------------------------------StringBFb
    public void strbf() {
        StringBuffer strbf;
        strbf = new StringBuffer("Meow");
        StringBuffer sb = new StringBuffer(strbf);
        StringBuffer sb2 = new StringBuffer("Meow");
        strbf.replace(4, 8, "喵喵喵");
        System.out.println("strbf.replace(4, 8, \"喵喵喵\")修改区间内字符串  " + strbf);
        System.out.println("strbf.append(char/str)：在字符串的末尾追加字符或字符串  " + strbf.append(sb2 + "???"));
        System.out.println("sb.insert(int , char/str)：在字符串的指定位置插入字符或字符串。  " + sb.insert(4, "???"));
        System.out.println("sb.delete(int start, int end)：删除指定字符(int start ) 或一段字符  " + sb.delete(4, 6));
        System.out.println("sb2.capacity() 方法返回目前对象可用于存储字符串的缓冲区的大小  " + sb2.capacity());
    }
}

// p Vectoor类是Java中的一个内置类，用于表示和操作二维向量（x、y坐标）用于操作动态数组。import java.util.Vector;
// r Vector类已经过时，Java
// 1.2版本开始被ArrayList所取代，使用ArrayList来操作动态数组。导入java.util.ArrayList类
// b ------------------------vector成员变量
// o elementData -
// Vector类内部使用一个Object类型的数组来存储元素。当Vector对象创建时，它会分配一个默认容量的数组，并可以根据需要调整大小。
// o capacityIncrement -
// Vector类允许您指定Vector的容量在需要时自动增加。capacityIncrement是由构造函数中传递的参数指定的大小。
// o elementCount -
// elementCount变量保存向量中当前元素的数量。当您向Vector添加或删除元素时，该值相应增加或减少。
// no modCount 变量是Vector类的一个内部变量，用于跟踪Vector对象修改的次数。每添加或删除一个元素时都会增加。
// no serialVersionUID
// 长整型id数字，由Java定义，标识不同版本的Java类。更改Java类的代码时，需要更改serialVersionUID的值以确保与之前版本的类区分开来。
// b ---------------------------vector三种构造方法
// r Vector<Object> vector = new Vector<Object>();需要声明保存元素类型
// r Object 表示可以存储任意类型的对象。也可以使用其他类或接口来限制向量中的数据类型
// o Vector(): 这个构造方法创建一个空的Vector对象，并且默认大小为10。
// o Vector(int initialCapacity):
// 这个构造方法创建一个空的Vector对象，并且指定了它的大小，也就是初始化容量为initialCapacity。
// o Vector(int initialCapacity, int capacityIncrement):
// 这个构造方法创建一个空的Vector对象，并指定了它的容量大小，同时指定容量的增量，即capacityIncrement。增量指的是当Vector在容量不足的情况下自动增加的容量大小。
// b ---------------------------------增 add() addElement()
// o 向向量中添加元素 add() 或 addElement() 方法. add() 方法返回一个 boolean 值，表示是否添加成功，
// addElement() 方法则无返回值。
// b ---------------------------------删 remove() 或 removeElement()
// o 从向量中删除元素 remove() 或 removeElement() 方法从向量中删除元素。remove() 方法返回被删除的元素，
//o removeElement(obj) 方法则返回一个 boolean 值，表示是否删除成功。
// remove(int index): 删除指定索引位置的元素，并返回该元素的值。
//o removeElementAt(int index)方法从Vector中删除指定索引处的元素，并不返回已删除的元素。
//o removeAllElement() 方法，用于从向量中删除所有元素，使向量为空 
// r 官方文档clear()方法代替removeAllElements()方法
// removeAll(Collection<?> c): 删除向量中包含在指定集合中的所有元素，并返回一个布尔值，指示是否已成功删除所有元素。

// b ---------------------------------查 get() 或 elementAt()
// no get() 或 elementAt() 方法获取向量中的元素。get() 方法返回一个指定位置的元素
// o elementAt()方法则返回指定位置的元素对象。
// o contains() 方法来检查 Vector 中是否包含字符串
// o indexOf(Object o)方法：返回向量中第一个出现指定元素的索引位置，如果未找到，则返回-1。
// o lastIndexOf(Object o)方法：后向前返回向量中最后一个出现指定元素的索引位置，如果未找到，则返回-1。
// b -----------------------------------改 set() 或 insertElementAt()
// o set() 或 insertElementAt() 方法修改向量中的元素。set() 方法将指定位置的元素替换为新元素，并返回被替换的元素，
// no insertElementAt() 方法则将新元素插入到指定位置，并将原位置的元素向后移动一个位置。



class Vector1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();// 默认容量10
        String st = "Meow";
        vec.addElement(st + "???");// 使用addElement添加初始化
        Vector<Integer> veci = new Vector<>(1);
        veci.addElement(1);// 增
       Boolean b= veci.add(2);
       veci.add(2);
        System.out.println("\n--------------------------增");
        System.out.println("向量需要new创建对象并用<>声明类型 \naddelement添加元素()" + vec);
        System.out.println(b+"add(int,obj)添加并返回布尔状态"+veci);//布尔不能直接加向量
        vec.insertElementAt("Excuse", 0);
        System.out.println("插入insertElement(obj,int)" + vec);
        System.out.println("--------------------------删");//删
        vec.remove(0);
        boolean bb=veci.removeElement(2);

        System.out.println("remove(int)删除元素 "+vec+"\nremoveElementAt(int index)不返回已删除的元素");
        System.out.println("remove(obj)删除元素 "+veci+bb);
        veci.removeAllElements();

        System.out.println("--------------------------查");

        System.out.println("--------------------------改");

    }
}