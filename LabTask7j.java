import java.util.Scanner;
public class LabTask7j {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input: ");
        String str = input.nextLine();

        // 1. Third character (index 2 because index starts from 0)
        System.out.println(str.charAt(2));

        // 2. Second-to-last character
        System.out.println(str.charAt(str.length() - 2));

        // 3. First five characters
        if (str.length() >= 5)
            System.out.println(str.substring(0, 5));
        else
            System.out.println(str);

        // 4. All but the last two characters
        if (str.length() > 2)
            System.out.println(str.substring(0, str.length() - 2));
        else
            System.out.println("");

        // 5. Characters with even indices
        for (int i = 0; i < str.length(); i += 2)
            System.out.print(str.charAt(i));
        System.out.println();

        // 6. Characters with odd indices
        for (int i = 1; i < str.length(); i += 2)
            System.out.print(str.charAt(i));
        System.out.println();

        // 7. All characters in reverse order
        for (int i = str.length() - 1; i >= 0; i--)
            System.out.print(str.charAt(i));
        System.out.println();

        // 8. Every second character in reverse order
        for (int i = str.length() - 1; i >= 0; i -= 2)
            System.out.print(str.charAt(i));
        System.out.println();

        // 9. Length of string
        System.out.println(str.length());
    }
}
