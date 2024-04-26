package lang.wrapper.test;

public class WrapperTest1 {
  public static void main(String[] args) {
    String str1 = "10";
    String str2 = "20";

    // 코드 작성
    Integer boxedValue1 = Integer.valueOf(str1);
    int unboxedValue1 =  boxedValue1;

    Integer boxedValue2 = Integer.valueOf(str2);
    int unboxedValue2 = boxedValue2;

    System.out.println("두 수의 합: " + (unboxedValue1 + unboxedValue2));
  }
}
