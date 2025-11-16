import java.util.Scanner;

public class LabTask7g{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input: ");
    String str = input.nextLine();

    int first = str.indexOf('f');      
    int last = str.lastIndexOf('f');   
        if (first == -1) {
            // no 'f' found → print nothing
        } else if (first == last) {
            System.out.println(first);  
        } else {
            System.out.println(first + " " + last);  // first and last position
        }
    }
}
