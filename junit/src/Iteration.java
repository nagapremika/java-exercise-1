public class Iteration{
    public static void main(String args[]) {        //This class calls loop() method
        int number = 5;
        loop(number);
    }
    //Loop method provides the output
       public static void loop(int number1){

            for (int i = 1; i <= number1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }

            }
        }
    }


