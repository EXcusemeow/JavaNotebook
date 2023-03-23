//p 参数按值传送-------------------------------------
public class PassValueTest {
  // 定义一个类变量ptValue，类型为float
  private float ptValue;

  // 定义一个方法changeInt，参数为int类型，作用是将参数的值改为55
  public int changeInt(int value) {
    return value = 55;
  }

  // 定义一个方法changeStr，参数为String类型，作用是将参数的值改为"different"
  public void changeStr(String str) {
    str = new String("different");
  }

  // 定义一个方法changeObjValue，参数为PassValueTest类型，作用是将参数的ptValue属性改为99f
  // r
  // 参数类型是类名的意思是，这个参数可以接受任何属于这个类或者它的子类的对象。例如，如果一个方法的参数类型是Animal，那么它可以接受任何Animal或者它的子类（如Dog、Cat等）的对象作为参数。
  public void changeObjValue(PassValueTest ref) {
    ref.ptValue = 99f;
  }

  public static void main(String[] args) {

    // 创建一个PassValueTest对象pt，并调用其无参构造方法
    PassValueTest pt = new PassValueTest();
    int value;
    value = 11;
    // 调用pt对象的changeInt方法，传入value作为实参
    pt.changeInt(value);
    // o 输出value的值（期望是55）
    System.out.println("Int value is: " + value);

    String str;
    str = new String("hello");
    // 调用pt对象的changeStr方法，传入value1作为实参
    pt.changeStr(str);
    // o 输出value1的值（期望是"different"）
    System.out.println("Str value is: " + str);

    pt.ptValue = 101f;
    // 调用pt对象的changeObjValue方法，传入pt自身作为实参
    pt.changeObjValue(pt);
    // o 输出pt对象的ptValue属性的值（期望是99f）
    System.out.println("Current ptValue is: " + pt.ptValue);
  }
}

// b 泛型方法是一种可以接受不同类型的参数，并且可以返回不同类型的结果的方法。泛型方法的定义格式：---------------------
// 修饰符 <类型参数> 返回值类型 方法名(形参列表) {方法体}
// 其中，<类型参数>是用于指定一个或多个泛型类型名称的标识符，例如<T>、<T,U>等。类型参数只能代表引用类型，不能是基本类型（如int、double等）。

class GenericTest {
  //r 泛型方法 避免类型异常printArray------------------
  // <E>是一个类型参数，它可以代表任何引用类型，例如String、Integer、List等。在调用泛型方法时，编译器会根据传入的实际参数来推断<E>的具体类型
  public static <E> void printArray(E[] inputArray) {// o 定义了一个形参列表input..
    //o 输出数组元素 E element 则是定义的循环变量，它用来存储当前遍历到的数组元素。
    for (E element : inputArray) {
      //r printf方法中，常用的占位符如下：
      //o %d：输出整数。
      //o %f：输出浮点数。
      //o %s：输出字符串。
      //o %c：输出字符。
      // %b：输出布尔值。
      //o %n：换行符。
      // %t：日期和时间格式控制符。
      // %e：科学计数法格式。
      // %x：十六进制格式。
      // 这些占位符可以与一些标志符一起使用，以控制输出的格式。%10d表示整数占据10个字符宽，左侧用空格填充；%-10d表示整数占据10个字符宽，右侧用空格填充。
      System.out.printf("%s ", element);
    }
    System.out.println();
  }

  public static void main(String args[]) {
    // 创建不同类型数组： Integer, Double 和 Character
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

    System.out.println("整型数组元素为:");
    printArray(intArray); //o 传递一个整型数组 到print数组方法

    System.out.println("双精度型数组元素为:");
    printArray(doubleArray); // 传递一个双精度型数组

    System.out.println("字符型数组元素为:");
    printArray(charArray); // 传递一个字符型数组
  }
}