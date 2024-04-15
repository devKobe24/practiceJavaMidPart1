package string.isEmpty;

public class NullCheckMain {

  public static void main(String[] args) {
    System.out.println(NullCheck.isEmptyCheck(null));
    System.out.println(NullCheck.isEmptyCheck(" "));
    System.out.println(NullCheck.isEmptyCheck(" Hello, Java\n "));
  }
}
