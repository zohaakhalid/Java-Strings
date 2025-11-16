import java.util.Scanner;

public class LabTask7f {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Input: ");
    String str = input.nextLine();

    int spaceIndex = str.indexOf(' '); 

    String firstWord = str.substring(0, spaceIndex);
    String secondWord = str.substring(spaceIndex + 1);
    System.out.println("Correct Answer: " + secondWord + " " + firstWord);
    }
  }
