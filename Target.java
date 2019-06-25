import java.util.*;
public class Target{    //This class reads a number between 1-50
    public static void main(String args[])
    {
        System.out.println("Enter a number betwwen 1-50");
        Scanner input=new Scanner(System.in);
        int guess=input.nextInt();
        find(guess);
    }
 public static void find(int guess)     //It prints relation between guessed number and target

 {
     int target=45;
     if(target>guess)
         System.out.println("Number guessed is less than original number");
     else if(target==guess)
         System.out.println("Number guessed matches original number");
     else
         System.out.println("Number guessed is more than original number");
 }
}