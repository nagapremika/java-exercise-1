public class Palindrome {       //This class reads a number and calls Palindrome() method
    public static void main(String[] args) {
        int i = 242;
        palindrome(i);
    }
    public static void palindrome(int i){       //This method prints whether the number is palindrome and sum is less than or greater than 25
      int  n = i;
        int r, p = 0, s = 0;
        while (n != 0) {
            r = n % 10;
            p = p * 10 + r;
            n = n / 10;

        }
        if (i == p) {
            while(p!=0) {
                r = p % 10;
                s = s + r;
                p = p / 10;
            }
            if (s > 25){
                System.out.print(i);
                System.out.println(" is a palindrome and sum is greater than 25");}
            else{
                System.out.print(i);
                System.out.println(" is a palindrome and sum is less than 25");}


        } else {
            System.out.print(i);
            System.out.println(" is not a palindrome");
        }

}
}