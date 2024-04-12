package lang.string.test;

public class TestString5 {

  public static void main(String[] args) {
    String str ="hello.txt";
    String ext = ".txt";

    int fileStartIndex = str.indexOf("hello");
    int fileEndIndex = str.indexOf(".txt");
    int extStringIndex = ext.indexOf(".txt");

    String filename = str.substring(fileStartIndex, fileEndIndex);
    String extName = ext.substring(extStringIndex);

    System.out.println("filename = " + filename);
    System.out.println("extName = " + extName);


  }

}
