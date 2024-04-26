package lang.wrapper.test;

public class WrapperTest2 {
  public static void main(String[] args) {
    String[] array = {"1.5", "2.5", "3.0"};
    double sum = 0.0;
    // 코드 작성
    for (String item : array) {
      double parseDouble = Double.parseDouble(item);
      sum += parseDouble;
    }

    System.out.println("sum = " + sum);
  }
}
