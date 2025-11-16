import java.util.Scanner;
public class LabTask7i {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    System.out.print("Input: ");
    String str = input.nextLine();

    int firstH = str.indexOf('h');     
    int lastH = str.lastIndexOf('h'); 
        
    String start = str.substring(0, firstH + 1);      
    String middle = str.substring(firstH + 1, lastH); 
    String end = str.substring(lastH);             

    middle = middle.replace('h', 'H');

    String result = start + middle + end;
    System.out.println("Output: " + result);
    }
}
