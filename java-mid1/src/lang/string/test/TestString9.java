package lang.string.test;

import java.util.Arrays;

public class TestString9 {

  public static void main(String[] args) {
    String email = "hello@example.com";
    String[] idAndDomain = email.split("@");
    String id = "";
    String domain = "";

    for (int i = 0; i < idAndDomain.length; i++) {
      if (i == 0) {
        id = idAndDomain[i];
      } else {
        domain = idAndDomain[i];
      }
    }

    System.out.println("id = " + id);
    System.out.println("domain = " + domain);
  }
}
