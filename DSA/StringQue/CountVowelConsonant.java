import java.util.*;
public class CountVowelConsonant{
    public static void main(String args[]){
        String s= "My name is Sonali";
        int vowelcount =0;
        int constantcount = 0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowelcount++;
            }else{
                if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                    constantcount++;
                }
            }
        }
        System.out.println(vowelcount+" "+constantcount);
    }
}