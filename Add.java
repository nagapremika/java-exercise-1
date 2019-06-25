import java.util.Scanner;
public class Add{

    public static void main(String args[])
    {
     sum();
    }
    static void sum()//Method to add numbers in array
    {
        int sum=0;
        System.out.println("Enter no. of numbers");
        Scanner input=new Scanner(System.in);
        int no_of_times=input.nextInt();
        for(int i=0;i<no_of_times;i++)
        {
            System.out.println("Enter a digit");
            int digit=input.nextInt();
            sum=sum+digit;
                    }
        System.out.println(sum);
    }


}