public class Loop{
    public static void Main(String args[])
    {
        int number=5;
        loop(number);
        void number(int number)
        {
            for(int i=1;i<number;i++)
            {
                for(int j=1;j<=i;j++)
                {
                   System.out.print(i);
                }
                System.out.println();
            }
        }
    }

}
