
// p 类   构造器 方法 变量 语句 +;  { 语句块} 关键字 标识符 
/**
 [访问修饰符] class 类名 [extends 父类名] [implements 接口名列表] {
    //b 类的成员变量（属性）
    [访问修饰符] 类型 成员变量名 [= 默认值];
    //b 类的构造方法
    [访问修饰符] 类名([参数列表]) {
        // 构造方法的代码
    } 
    //b 类的方法
    [访问修饰符] 返回类型 方法名([参数列表]) {
        //o 方法的代码 方法结束常用return返回值 
        [return 返回值;]
    }
}*/

// b 括号
//y 小括号 () ：小括号通常用来表示方法的参数列表，或者表示条件语句的控制结构，比如 if、for、while 等。
//y 中括号 [] ：中括号通常用来表示数组类型，或者表示集合类型的泛型参数。
//y 大括号 {} ：大括号通常用来表示代码块，比如类的方法体、控制结构的语句块、初始化块等。
//y 尖括号 <> ：尖括号通常用来表示泛型类型，比如 List<String>。
//y 除了以上四种括号，Java 还有一些特殊的用法，比如注解中使用的 @ 符号，Lambda 表达式中使用的 -> 符号等。
// 在 Java 中，大多数语句都需要以分号 ; 结尾，例如赋值语句、方法调用、控制语句等等。但是，有一些语句是不需要以分号结尾的，例如：
//y 块语句（也称代码块或代码段），因为它们已经以大括号 {} 结尾，不需要再以分号结尾。
//y 类、接口、枚举、注解的定义，因为它们不是语句，也不需要以分号结尾。
//y switch-case 语句中的每个 case，因为它们已经以冒号 : 结尾。
//y import 语句和 package 语句，因为它们不是语句，也不需要以分号结尾。
// 代码块可以用来控制变量的作用域，从而避免变量名的冲突。代码块内声明一个变量时，该变量的作用域仅限于该代码块内部。代码块可以用于在程序执行期间临时创建一个对象，对象只能在代码块内使用，代码块执行完毕后，该对象将被销毁节省了内存空间。代码块还可以用于执行一组特定的操作，例如初始化代码等。
//b 访问控制饰符
//o default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。  修饰对象：类、接口、变量、方法。
//o private : 在同一类内可见。  修饰对象：变量、方法。 注意：不能修饰类（外部类）
// public : 对所有类可见。  使用对象：类、接口、变量、方法
//o protected : 对同一包内的类和所有子类可见。?不同包内子类?  使用对象：变量、方法。 注意：不能修饰类（外部类）。
// b 非访问控制符
// 非访问控制符（non-access modifiers）是一种在程序中用于控制类、方法、变量等元素行为的关键字。
// 常见的非访问控制符包括：
//o final：用于修饰变量时该变量的值不能被修改，或者修饰类时类不能被继承。被 final 修饰的实例变量必须显式指定初始值。final 修饰符通常和 static 修饰符一起使用来创建类常量。
//o static：用于修饰一个变量或方法，表示该变量或方法属于类而不是实例，并且可以通过类名直接访问。
//g static修饰的变量是全局变量，它在程序的生命周期内分配空间，存放在全局数据区。static修饰的变量只分配一次空间，前一次调用中的变量值通过下一次函数调用传递。
//g static修饰的方法是静态方法，它不需要创建对象就可以直接调用，它只能访问静态成员。static修饰的方法不能被重写（override），但可以被隐藏（hide）。
//g static还可以形成静态代码块，它在类加载时执行一次，并且优先于构造方法执行4。
// abstract：用于修饰一个类或方法，表示该类是一个抽象类，或者该方法是一个抽象方法，不能被实例化或直接调用，需要被子类继承或实现。声明抽象类的唯一目的是为了将来对该类进行扩充。
// synchronized：用于修饰一个方法或代码块，表示该方法或代码块在同一时间只能被一个线程访问。
// transient：用于修饰一个变量，表示该变量在序列化时将被忽略。
// volatile：用于修饰一个变量，表示该变量的值在多线程环境下可以被共享，并且每次修改都会立即更新到主存储器中，以确保线程之间的可见性和一致性。
//  b 类包 声明规范
//r 开发者自己定义的包名通常以自己的域名（反转过来）开头，例如com.example.mypackage。文件应该放在一个名为com/example/mypackage的目录下
//o 源文件的声明规则。当在一个源文件中定义多个类，并且还有​import导入包 ​和​package定义包​ 语句时，要特别注意这些规则。
// R 一个源文件中只能有一个 package
// r 一个源文件中只能有一个 ​public​ 类
// r 一个源文件可以有多个非​public​类
// r main方法并不是只能在公共类中定义的，它只是一个普通的静态方法，只要符合以下条件，就可以被JVM识别和执行：
// main方法必须是public的，因为它需要被JVM从外部访问。
// main方法必须是static的，因为JVM调用这个方法时不需要创建任何包含这个方法的实例。
// main方法必须有一个String[]类型的参数，用来接收命令行传递的参数。
// main方法可以有任意返回类型，但通常是void或int。
//o 所以使用多个主类时非公共类可以包含main方法，但是需要通过编译器或者指定完整名称来运行。
// o 源文件的名称应该和​public​类的类名保持一致。例如：源文件中​public​类的类名是​Employee​，那么源文件应该命名为​Employee.java​。
/**
 * r 如果一个类定义在某个包中，那么​package​语句应该在源文件的首行。
 * 如果源文件包含​import​语句，应该放在​package​语句和类定义之间。 没有​package​语句，​import​语句应该在源文件中最前面。
 * ​import​语句和​package​语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
 * 类有若干种访问级别，并且类也分不同的类型：抽象类和​final​类等
 */
// import包后可以直接调用类名而不用全称 *通配符导入全部类
// p 包装类就是将基本数据类型包装成的类，它有属性、方法，可以对象化交互 Java 有 8 种基本数据类型，每个基本类型都对应一个包装类 常见包装类可以分为
// 3 类：Number、Character、Boolean-----以及Void包装类
// o Number包含Byte、Short、Integer、Long、Float、Double1。
// Character 类是对 char 基本类型的封装，提供了一些字符相关的方法。Boolean 类是对 boolean 基本类型的封装，提供了一些布尔值相关的方法
// void 包装类是指 java.lang.Void 类，它是 void 关键字的包装类。它是一个不可实例化的占位类，它持有关键字为 void 的
// Class 的引。它的构造方法是私有的，不能通过 new 来创建对象
// void 包装类的主要作用是用于泛型和反射中，表示没有返回值的方法类型。

// b 包装类和基础类型相互转换的过程叫做装箱和拆箱。装箱就是基本数据类型向包装类转换；拆箱就是包装类向基本数据类型转换
// o 自动装箱和拆箱是由编译器自动完成的 当编译器检测到需要把基本数据类型转换成包装类时，编译器自动调用包装类的 valueOf() 方法实现自动装箱。
// o 当编译器检测到需要把包装类转换成基本数据类型时，编译器自动调用包装类的 xxValue()如intValue 方法实现自动拆箱
// 当基本数据类型和包装类之间进行赋值或运算时，例如 Integer i = 10; int b = i;
// 当基本数据类型和包装类之间进行比较时，例如 System.out.println(i1==i2);
// 当基本数据类型和包装类之间进行类型转换时，例如 String s = String.valueOf(i); int n =Integer.parseInt(s);
// p 对象
// r new操作符是用于创建类的 实例或数组的 对象 的语法，它通过动态分配内存并返回一个引用来实现
// y ClassName objectName = new ClassName(arg1, arg2, ...);
// 类、对象和实例的区别。在Java中，类是一个模板，它描述一类对象的行为和状态。对象是类的一个实例，它具有特定的属性和方法。实例是对象实例化后的结果，它可以通过new操作符创建，并赋值给一个引用变量。
// o 实例是对象的一种，但不是所有的对象都是实例 类本身也是对象，但不是类的实例。
// 对象是绝对的对象，它是类的一个具体化产品，有自己的属性和方法
// 实例是相对的实例，它是对象实例化后赋值给一个引用变量的结果
/**
 * g 可以区分同名的变量
 * o this关键字可以用来引用当前类的实例变量，也就是对象自身拥有的属性。
 * o this关键字可以用于调用当前类的方法，也就是对象自身能够执行的行为。
 * o this()可以用来调用当前类的构造函数，也就是对象自身的初始化方法。
 * 
 * o this关键字可以作为调用方法中的参数传递，也就是将对象自身作为实参传给其他方法。
 * o this关键字可以作为参数在构造函数调用中传递，也就是将对象自身作为实参传给其他构造函数。
 * o this关键字可以用于从方法返回当前类的实例，也就是将对象自身作为返回值返回给调用者。
 * 这是一个编程问题，与Java语言有关。这个错误的意思是，你不能在一个静态方法中使用this关键字，因为this指代当前类的对象，而静态方法不属于任何对象，而是属于类本身。
 * 如果你想在一个静态方法中创建一个DBAdapter对象，你需要传递一个合适的上下文参数，而不是this。上下文参数通常是一个Activity或者Application的实例，用于访问应用程序的资源和环境
 * o 创建一个类的对象，然后通过对象来访问非静态的字段。如，如果你有一个Shape类，它有一个非静态的字段color，创建一个对象并访问它的color：
 * Shape shape = new Shape (); shape.color = “red”;
 * o 将非静态的字段改为静态的，即在声明时加上static关键字。这样，你就可以在静态方法中直接使用类名加点号的方式来访问它，
 */
// b 变量 成员/实例变量 全局/静态 变量
// r 静态变量是指使用static关键字修饰的变量，它们属于类而不是对象，只有一份副本。静态变量可以直接通过类名访问，也可以通过对象名访问。
// o 不同位置声明变量
// r 一 方法内声明的变量 自动/局部变量or栈/临时变量
// r 二 类定义内声明的变量两种 1.0 类的 成员/实例变量(this.引用实例变量 2.0 类的全局/静态变量需要static修饰
// 成员变量和静态变量都可以被所有对象方法使用，但它们的使用方式略有不同。
// 成员/实例变量 是属于每个对象独有的变量，每个对象的成员变量值可以不同，必须通过对象来访问。
// 静态/全局变量 是属于类的属性，所有对象共享同一个静态变量，只需通过类名来访问即可，无需创建对象。public修饰可以被任何类方法访问 否则只能包内访问

// r static方法中使用非static变量，必须创建一个对象的实例，并通过它来引用变量
class Statictest {
    // 定义一个非static变量name
    public String name;

    // 定义一个static方法showName
    public static void showName() {
        // o 在这里不能直接访问name，因为name是属于对象的，而showName是属于类的
        // System.out.println(name); // 编译错误

        // o 如果要访问name，必须通过创建对象的实例来引用
        Statictest v = new Statictest();
        v.name = "Alice";
        System.out.println(v.name); // 输出Alice
    }
}

// b Java中的变量类型可以分为基本类型和引用类型。
// b 基本类型包括整型、浮点型、布尔型和字符型；引用类型包括接口对象类型、数组类型和枚举类型字符串等其余类型
// o 引用变量需要使用new关键字来创建对象 调用构造器初始化对象
// o 数据类型可以是任何Java类的名称，包括基本数据类型的封装类（Integer、Double等）数组和自定义类。变量名用于引用变量的值。
// r 引用变量的赋值是将一个对象的引用复制给另一个变量，两个引用变量指向同一个对象，它们共享该对象的状态和行为。
// r 对其中一个变量的修改会影响另一个变量指向的对象。
// 可以同时声明多个变量，多个变量之间用逗号分隔。
// y 声明引用分配引用空间 new创建实例分配存储空间 操作数变量必须初始化
/**
 * b 形参和实参
 * r 形参是函数定义时的参数，它没有确定的值，只是一个占位符。实参是函数调用时的参数，它有确定的值，可以是基本类型、引用类型、表达式等。
 * o 参数传递机制是值传递，实参会把它的值复制给形参，而不会影响实参本身。如果实参是基本类型或者String类型，则形参和实参相互独立；
 * o 如果实参是引用类型，则形参和实参指向同一个对象，在方法内部对对象的修改会反映到实际参数上。
 */
// 堆（heap）是用来存放Java中的对象和数组的内存区域，它是在程序运行时动态分配的，可以动态地增长或缩小。所有使用new创建的对象和数组都在堆中存储，由Java虚拟机的垃圾回收器来管理和回收。堆内存的访问速度相对较慢，但是可以存储更大的数据量。
// 栈（stack）是用来存放Java中的基本类型变量和对象引用变量的内存区域，它是在编译时静态分配的，大小和生命周期都是确定的。栈内存以帧（frame）为单位保存线程的状态，每个方法调用都会创建一个帧，包含局部变量表、操作数栈、常量池引用等信息。栈内存的访问速度相对较快，但是可以存储的数据量有限。
// b 方法-----------------------------------------------------------------
// b mian方法
// o 一个Java源文件中可以有多个主类，所谓主类就是函数运行的一个入口， public static void main
// 。如果想要运行不同的主类，可以在编译器中选择要运行的主类。
// b 构造器 是一种特殊的方法，用于初始化创建的对象的状态(必须) 会默认生成一个构造器。
// o 类的默认构造函数的名称必须与类的名称相同
// 构造函数没有返回值类型，包括void也不能写。但是有返回值，返回的是一个对象
// 构造函数在new创建对象时被自动调用，而方法需要在对象创建后对象名类名手动调用。
// 构造函数可以有多个重载形式，可以根据参数个数和类型的不同来区分不同的构造函数。
// 通常构造方法应该为所有成员变量初始化，成员变量值称为对象的属性
// 如果一个类定义了其他的构造器，但没有定义默认构造器，那么其他类需要使用默认构造器来创建该类的对象，就会出现编译错误。如果需要提供默认构造器，就需要在类中定义一个与类名相同且没有参数的构造器。
// o 抽象方法没有具体方法 具体方法由子类提供。抽象方法不能被声明成 final 和 static。
// 任何继承抽象类的子类必须实现父类的所有抽象方法，除非该子类也是抽象类。
// 如果一个类包含若干个抽象方法，那么该类必须声明为抽象类。抽象类可以不包含抽象方法。
// b 静态/类方法
// r 静态方法是指使用static关键字修饰的方法，它可以直接通过类名调用，不需要创建对象。静态方法只能访问静态变量和静态方法，不能访问非静态变量和非静方法
// o 静态方法不能被重写 不存在this值
// b 静态代码块
// r 静态代码块是指使用static关键字修饰的代码块，在类加载时执行，只执行一次。静态代码块用于进行一些初始化操作，例如加载驱动程序、创建数据库连接等。
// b this引用本类中其他构造方法多用于重载
// r this 还可以用来指名操作对象自身
// b 泛型方法是一种可以接受不同类型的参数，并且可以返回不同类型的结果的方法。泛型方法的定义格式：
// o 修饰符 <类型参数> 返回值类型 方法名(形参列表) {方法体}
// 其中，<类型参数>是用于指定一个或多个泛型类型名称的标识符，例如<T>、<T,U>等。。它可以代表任何引用类型，例如String、Integer、List等。在调用泛型方法时，编译器会根据传入的实际参数来推断<xxx>的具体类型,不能是基本类型（如int、double等）

// ____________________________________________________________________________________________
// ____________________________________________________________________________________________

// p 科学函数Math.xxx 运算符+-* / % 取模 除法取余数 ++ --加减1 前后区别 加减后使用变量/使用变量后加减
// b 关系运算符> < == !=
// b 逻辑运算 &&与 ||或 !非 前两个二元后一个一元运算符
// b 位运算符 ~取反 与& 或| 亦或^ 左右移<< >> 无符号右移(int/long)>>> 位只能整型和字符
// 按位与(&)：对两个数的二进制进行与运算，只有在两个二进制位都是1时，结果才是1。例如，3 & 5的结果是1。
// 按位或(|)：对两个数的二进制进行或运算，只要两个二进制位中有一个为1时，结果就是1。例如，3 | 5的结果是7。
// 按位异或(^)：对两个数的二进制进行异或运算，只有在两个二进制位不同时，结果才是1。例如，3 ^ 5的结果是6。
// 按位取反(~)：对一个数的二进制进行取反运算，将0变为1，将1变为0。例如，~3的结果是-4。
// 左移(<<)：将一个数的二进制位向左移动指定的位数，左边多出来的位补0。例如，3 << 2的结果是12。
// 右移(>>)：将一个数的二进制位向右移动指定的位数，右边多出来的位补符号位。例如，-3 >> 1的结果是-2。
// 无符号右移(>>>)：将一个数的二进制位向右移动指定的位数，右边多出来的位补0。例如，-3 >>> 1的结果是2147483646。
// b 条件运算符 变量(条件)? 值为:
// 否则值为------------------------------------------------------
// w variable = (condition) ? expression1 : expression2; z = x > y ? x : y;
// 这意味着如果条件为真，就执行表达式1并把结果赋值给变量，否则就执行表达式2并把结果赋值给变量。
class TiaoJian {
    // 类的构造器
    public TiaoJian() {
        int a, b;
        a = 10;
        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        b = (a == 1) ? 11 : 22;
        System.out.println("首选值 : 前的值" + b);

        // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        b = (a == 10) ? 11 : 22;
        System.out.println("否则 : 后的值" + b);
    }
}

// b 扩展赋值运算符 += -=....
// r . 点运算符是Java编程语言中的一个运算符，用于访问对象的属性或方法。点运算符的左侧是一个对象，右侧是对象的属性或方法名。
// 如果方法调用是在同一行，例如
// obj.method1().method2().method3()，那么会从左到右依次执行，每个方法的返回值作为下一个方法的调用对象。
// 如果方法调用是在不同行，例如 obj.method1(); obj.method2(); obj.method3();
// 那么会从上到下依次执行，每个方法的调用对象都是obj。
// 如果方法调用是嵌套的，例如
// obj.method1(obj.method2(obj.method3()))，那么会从最内层开始执行，每个方法的返回值作为外层方法的参数。
// 流程控制---------------------------------------------------------------------
// p 流程控制语句
// b 赋值 分支 循环 语句 --顺序流 分支流 循环流 continue break
// b 赋值语句
// b 分支语句 if-else, switch -case-break [default]=============================

// b if() else if() else_____________________________________________________
// if(条件为逻辑值)
class Ifelse {
    // 返回字符串
    public String addif(double i) {
        {
            if (i > 0) {
                i = i - 2;
                return " 返回值i=" + i;
                // r 在if语句中使用多个条件时，需要使用逻辑运算符来连接条件。这个例子中使用“&&”运算符将两个条件结合在一起
            } else if (0 >= i && i > -20) {
                return "负20以内" + i;
            } else {
                return "虚的厉害" + i;
            }
        }
    }

    // 方法的重载 需要不同参数列
    public void addif(int i) {
        {
            if (i > 0) {
                i = i - 1;
                System.out.println("ifelse类的对象.addif()无返回方法 i=" + i);
            } else {
                // if的嵌套
                if (i == 0) {
                    System.out.println("钱包余额" + i);
                } else {
                    System.out.println(i + " 大负翁是吧");
                }

            }
        }
    }
}

// b switch() case可能的值 break default否则执行默认________________________
// r 条件表达式结果为int/char单引号case'' (byte和short需要提升)string
//w 表达式可以是 byte short char intenum String
// o 在 case 语句中，不允许使用一般表达式，只能使用常量或枚举常量 case语句可以是一个常量表达式，例如字面值、枚举常量、final变量或final方法返回的常量表达式。
class Switchcase {
    // int条件
    // 类的默认构造器不能有返回值类型
    public Switchcase(int sc) {
        switch (sc) {
            case 0:
                System.out.println("归零");
                break;

            case 2:
                System.out.println(sc + "了吧来根二货");
                break;
            default:
                System.out.println("看看这是几 " + sc);
                break;
        }
    }

    // char类型条件
    public Switchcase(char sc) {
        if (sc != 'a' & sc != 'b' & sc != 'c' & sc != 'd') {
            System.out.println("单选abcd你看看选的是什么东西 " + sc);
        } else {
            // if else和switch套嵌
            switch (sc) {
                case 'a':
                    System.out.println("char=" + sc);
                    break;
                case 'b':
                    System.out.println("char=" + sc);
                    break;
                default:
                    System.out.println("俄罗斯大转盘4选2 你这是 " + sc);
                    break;
            }
        }
    }

    // string条件
    public Switchcase(String sc) {

        // 输入长度
        if (sc.length() > 2) {
            System.out.println("坦克超重了少打点字吧 太多了你要的这" + sc);
        } else {
            switch (sc) {
                case "ab":
                    System.out.println("String " + sc);
                    break;
                case "cd":
                    System.out.println("String " + sc);
                    break;
                default:
                    System.out.println("ab cd 挑一对 奴隶所没你选的这个 " + sc);
                    break;
            }

        }
    }
}

// p 循环语句 while() / do while() / for ()
// b while(条件) ---------------------------------------------------------------
class While {
    int i = 1; // 初始化变量

    public void While() {
        while (i < 4) {
            System.out.println(i);
            // r 条件自加
            i++;
        }
        System.out.println("恋爱循环");
        System.out.println(); // 打印换行符
    }

    // b do while(条件)---------------------------------------------------
    public void dowh() {
        do {
            System.out.println("恋爱没有循环");
            System.out.println(); // 打印换行符
            i++;
        } while (i < 0);
    }

    // b for( i= ;条件;自加)------------------------------------------------------
    // w for (初始化表达式; 测试表达式; 更新表达式) {
    // w 循环体}
    // 初始化表达式用于初始化或声明变量，只执行一次。
    // 测试表达式用于检查循环是否应该继续或停止。
    // 更新表达式用于更新循环计数器的值，每次执行循环体后都会执行。
    // 循环体是要重复执行的代码块。

    public void fori() {
        System.out.println("for( ; ; )");

        for (int i = 1; 4 > i; i++) {
            System.out.println("i= " + i);
        }

        // o for (元素类型 元素变量 : 遍历对象) { }
        System.out.println("for(类型  变量:遍历列表 )遍历型");
        int[] numb = { 1, 2, 3 };// r 初始化变量
        for (int num : numb) {
            System.out.println("num=" + num);
        }
        System.out.println();
    }

}

// p 跳转语句
// b 标号由一个自定义标识符和一个冒号组成，例如：label: 可以多个标号
// 在使用标号时，需要将它放在代码块的开头，然后在需要执行特定操作的地方使用break、continue或return语句加上标号，例如：break
// label:
// b break结束代码块 程序将直接结束当前循环或者switch代码块，不再执行后续的代码。
// b 但是如果有多层嵌套循环，可能会造成不易阅读和理解的代码。此时，可以使用带 标签：的 break 语句来中断指定循环
// b continue语句用于跳过当前循环中的剩余代码，直接进入下一次循环。它只能用于循环语句中（for、while和do-while）
class Cont {
    public Cont() {
        for (int i = 0; i < 4; i++) {
            if (i == 2) {
                System.out.println("跳过");
                continue;// 跳过
            }
            // r 循环代码块置后
            System.out.println("i循环" + i);
        }
    }

    public void contl() {
        // o 标号 外层循环行数
        System.out.println("跳过到指定外层循环");
        outfor: for (int i = 0; i <= 5; i++) {
            // 每行个数
            for (int j = 0; j < 6; j++) {
                // 一直执行内循环直到超出
                if (j >= i) {
                    System.out.println();
                    // o 跳过开始外层循环
                    continue outfor;
                }
                System.out.print("$");
            }

        }
    }
}
// p -----------------------------------------------------------------------
// b -----------------------------------------------------------------------

// r 公共class唯一
public class NoteApp {

    // r 公共 静态 无返回类型 main方法为程序入口 命令行参数置入args数组
    // o main前面三个修饰符 静态为不需要通过类的实例调动
    // y 无返回值 不需要通过return返回值 无法将结果赋值 不能参与运算
    // r 主方法唯一
    public static void main(String args[]) {
        // 可执行语句 System是系统包java.lang的一个类 out是类中的成员变量 println方法
        System.out.println("A=================================A====================================A");
        System.out.println();
        System.out.println("类 类静态变量/实例变量 构造器/方法+参数 \n");
        System.out.println("+++++++++++++++++++++分支语句++++++++++++++++++++ ");// 分支
        System.out.println();// 空行
        System.out.println("---------------------if ()else if else ");// if else
        // r 创建对象 一个名为Ifelse的类，它有一个带有一个字符串参数的构造器，可以在main方法中创建类的实例调用该构造器(类的默认构造器直接类名传参)。
        Ifelse ifelse = new Ifelse();
        // 调用Ife..类的对象ife...的方法addif
        ifelse.addif(1);
        System.out.println("类System.成员变量out.方法println +类对象.方法的返回值" + "\n" + ifelse.addif(1.0) + "\n");//

        System.out.println("----------------switch() case : defualt ");// switch
        System.out.println("int类型---------------------------");//
        // o 创建类的默认构造器直接类名传参
        Switchcase switchcase = new Switchcase(1);// 对象的实例化
        System.out.println("char类型----------------------------");//
        Switchcase switchchar = new Switchcase('b');
        System.out.println("String类型--------------------------");//
        Switchcase swstring = new Switchcase("abc");

        System.out.println();// null

        System.out.println("------------------条件运算 ()? : ");
        // o new 创建类Tiaojian的对象 类构造器直接使用
        TiaoJian tj = new TiaoJian();// ()? : 条件运算符
        System.out.println();
        System.out.println("+++++++++++++++++++++循环语句++++++++++++++++++");// 循环
        System.out.println();// 空行
        System.out.println("-------------------while()");
        While wh = new While();
        wh.While();// 对象调用方法
        System.out.println("------------------do while()");
        wh.dowh();
        System.out.println("------------------------for(;;)");
        wh.fori();
        System.out.println("^^^^^^^^^^^^^^^^^^^跳转语句^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("------------------------break;");
        System.out.println("break结束代码块 程序将直接跳出当前循环或者switch代码块，不再执行后续的代码。");
        System.out.println("------------------------continue");
        Cont cont = new Cont();
        cont.contl();
        System.out.println("------------------------for(;;)");
        System.out.println("V====================================V====================================V");
    }
}