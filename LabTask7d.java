public class LabTask7d{
    public static void main(String[] args) {
     
      int randomNum = 65 + (int)(Math.random() * 26);
      char letter = (char) randomNum;
      System.out.println("Random uppercase letter: " + letter);
    }
}
