import java.util.*;
public class Digit {    //Digit class reads a number and calls sum() method
    public static void main(String args[]) {

        System.out.println("Enter a number");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        sum(number);
    }

    public static void sum(int input) {     //This method prints the number in descending order and gives sum of even numbers
        int temp = input;
        int sum=0,r,count=0,i;


        while(temp!=0)
        {
            r=temp%10;
            if(r%2==0)
                sum=sum+r;
            temp=temp/10;
            count++;
        }

temp=input;
        int[] arr=new int[count];
        for(i=0;count>i;i++)
        {
            arr[i]=temp%10;
          temp=temp/10;
        }

        for (i = 0; i < count; i++) {

            for (int j = 0; j < count; j++)

                if (arr[i] > arr[j]) {

                    temp = arr[j];

                    arr[j] = arr[i];

                    arr[i] =  temp;

                }

        }
        for(i=0;i<count;i++)

        System.out.print(arr[i]);
        System.out.println();

        System.out.println(sum);
    }
}