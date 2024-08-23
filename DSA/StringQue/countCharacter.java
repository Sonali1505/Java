import java.util.*;
public class countCharacter{
    public static void main(String args[]){
        String s = "I like mango";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) !=' '){
                count++;

            }
        }
        System.out.println(count);
    }
}