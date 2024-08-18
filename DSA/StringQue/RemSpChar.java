import java.util.*;
public class RemSpChar{
    public static void main(String args[]){
        String str = "@So$n#$ali&";
        String replaceString = str.replaceAll("[^a-zA-Z0-9]","");
            System.out.print(replaceString);
    

        
            

    }
}