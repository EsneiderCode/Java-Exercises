public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    int indexEmpty = name.indexOf(" ");
    String initialName = name.charAt(0) + "." + name.charAt(indexEmpty+1);
    return initialName.toUpperCase();
  }
}
