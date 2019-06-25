public class Character
{
    public static void main(String args[]) {        //This class reads a string and calls letter() method
        String c = "Ed";
        letter(c);
    }
    public static void letter(String c)     //This method  prints vowel or consonant
    {
        int i;
        for(i=0;i<c.length();i++)
        {
        if( !((c.charAt(i) >= 'a' && c.charAt(i)<= 'z') || (c.charAt(i)>= 'A' && c.charAt(i) <= 'Z')))
        {
            System.out.println("error");
        }
        else
        {
         switch(c.charAt(i))
            {
                case 'a': System.out.print("vowel ");
                             break;
                case  'e':   System.out.print("vowel ");
                            break;
                case 'i': System.out.print("vowel ");
                            break;
                case 'o' :System.out.print("vowel ");
                            break;
                case 'u' :System.out.print("vowel ");
                            break;
                case 'A': System.out.print("vowel ");
                             break;
                case  'E':   System.out.print("vowel ");
                             break;
                case 'I': System.out.print("vowel ");
                             break;
                case 'O' :System.out.print("vowel ");
                         break;
                case 'U' :System.out.print("vowel ");
                            break;
                default: System.out.print("Consonant ");
            }
        }
    }
}
}