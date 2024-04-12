package lang.string.test;

public class TestString2 {

  public static void main(String[] args) {
    String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
    int arrLength = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      arrLength = arr[i].length();
      sum += arr[i].length();
      System.out.println(arr[i] + ":" + arrLength);
    }
    System.out.println("sum = " + sum);
  }

}
