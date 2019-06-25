import java.util.*;
public class Reverse {  //This class reads a string and calls reverse method
    public static void main(String args[]) {
        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        reverse(str);
    }

    public static void reverse(String word) {       //This method reverses the string
        char[] chs = word.toCharArray();

        int i=0, j=chs.length-1;
        while (i < j) {
            // swap chs[i] and chs[j]
            char t = chs[i];
            chs[i] = chs[j];
            chs[j] = t;
            i++; j--;
        }
        System.out.println(chs);
    }
}