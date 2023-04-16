package test;

public class Fortest {
  public static void main(String[] args) {
    int n = 5;int i = 1;
    for (; n >= i; i++) {//夏姬八试
      System.out.print("(null)");
      for (int j = 1; i>=j; j++) {
        System.out.print(j);
        if (i == j & i != 1) {
          int k;
          for (k=i; k > 0; k--) {//夏姬八试
            System.out.print(k);
          }
        }
      }
      System.out.println();
    }
  }

}
