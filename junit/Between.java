public class Between{
    public static void main(String args[]) {        //This class reads a number and calls between() method
        int i = 26;
        between(i);
    }
    public static void between(int i)       //This method verifies whether a number is between 20 and 30 and also even-Jerry or odd-Tom
    {
        if (i>20&&i<30)
        {
         if(i%2==0)
             System.out.println("Jerry");
         else
             System.out.println("Tom");
        }
    }
}
