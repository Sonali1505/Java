import java.util.*;
public class Stringreverse{
    public static void main(String args[]){
        String str= "Sonali";
        //For reverse a string there are four approach
        //1st approach
        char ch[]= str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
System.out.println();

        //2nd approach
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
System.out.println();
        //3rd approach
        StringBuffer sb= new StringBuffer(str);
        System.out.print(sb.reverse());

        System.out.println();

        //4th approach
        StringBuilder strBuild = new StringBuilder(str);
        System.out.println(strBuild.reverse());
    }
}