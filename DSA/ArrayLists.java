import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1= new ArrayList<>();
        ArrayList<Boolean> list3= new ArrayList<>();

        //add elements in the arraylist
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(2);

        System.out.println(list);

        //to get a element
        int element = list.get(0);
        System.out.println(element);

        //add a element in between
        list.add(1,4);
        System.out.println(list);

        //set a elemnt
        list.set(0,0);
        System.out.println(list);

        //delete elemnet
        list.remove(4);
        System.out.println(list);

        //calculate size of  the arraylist
        int size = list.size();
        System.out.println(size);

        //loops on the arraylist
        for(int i=0;i<list.size()-1;i++){
            System.out.println(list.get(i));
        }

        //sorting the list
        Collections.sort(list);
        System.out.println(list);

    }
}