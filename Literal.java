import java.util.*;
public class Literal{
    public static void main(String args[])      //This class reads the character
    {
        System.out.println("Enter a character");
        Scanner input=new Scanner(System.in);
        char character=input.next().charAt(0);
        find(character);
    }
    public static void find(char character)     //This method  prints uppercase or lower case or digit or symbol
    {
        if(Character.isUpperCase(character))
            System.out.println("Capital Letter");
        else if(Character.isLowerCase(character))
            System.out.println("Small Letter");
        else if(Character.isDigit(character))
            System.out.println("Digit");
        else
            System.out.println("Special Symbol");
    }

}