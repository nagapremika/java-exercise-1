import java.util.*;
import java.lang.*;
public class Repeat   //This class reads a word and calls repeat() method
{
public static void main(String args[]){
String word="StackRoute";
int n=3;
repeat(word,n);
}
public static void repeat(String word,int n)    //This  method  reverses the string
{
int l=word.length();
String str="";
  String s=  word.substring(l-n,l);
  for(int i=0;i<n;i++)
  str=str+s;
  str=word+str;
  System.out.println(str);
}
}