
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

//b ----------------------------------------------- 数组可以通过以下方式来创建和访问：
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
        // 使用Arrays.fill()方法初始化一个3x3的二维数组，并为每个元素赋值为1。
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

    }
}

// p 求平均-------------------------------------------------
class AverageArray {

    public static void main(String[] args) {

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
