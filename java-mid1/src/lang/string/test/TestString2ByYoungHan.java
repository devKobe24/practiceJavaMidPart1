package lang.string.test;

public class TestString2ByYoungHan {

  public static void main(String[] args) {
    String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
    int sum = 0;
    for (String s : arr) {
      System.out.println(s + ":" + s.length());
      sum += s.length();
    }
    System.out.println("sum = " + sum);
  }
}
