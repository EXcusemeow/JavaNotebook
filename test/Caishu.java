package test;
import java.util.Scanner;

public class Caishu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("你他妈输入啊");
        int num = (int) (Math.random() * 10) + 1;
        int a;
        int count = 0;
        do {
            a = sc.nextInt();
            count = count + 1;
            if (a > num) {
                System.out.println("偏大");
            } else if (a < num) {
                System.out.println("偏小");
            }
        } while (a != num);
        {
            System.out.println("恭喜你，猜了" + count + "次");
        }
    }
}

class Cai {
    public static void main(String[] args) {
        int ca[] = new int[5];
        int c[]={1,2,3,4,5};
        ca=c;
        for (int i = 0; i < ca.length; i++) {
            System.out.print(ca[i] + i+"  ");//值相加
            System.out.println(ca[i] + " i" + i);//字符串隔开不相加
           

        }
    }

}