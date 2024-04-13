package lang.string.test;

public class TestString6Review {

  public static void main(String[] args) {
    String str = "start hello java, hello spring, hello jpa";
    String key = "hello";

    int count = 0;
    int index = 0;
    index = str.indexOf(key);
    System.out.println("OUT OF WHILE ========== index = " + index);
    System.out.println("OUT OF WHILE ========== count = " + count);
    System.out.println();

    while (index >= 0) {
      index = str.indexOf(key, index + 1);
      System.out.println("INSIDE OF WHILE ========== index = " + index);
      count++;
      System.out.println("INSIDE OF WHILE ========== count = " + count);
      System.out.println();
    }
    System.out.println("END OF WHILE ========== index = " + index);
    System.out.println("END OF WHILE ========== count = " + count);
  }

}
