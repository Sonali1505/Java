// Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package. It is like the Vector in C++.

// Java ArrayList class can contain duplicate elements.
// Java ArrayList class maintains insertion order.
// Java ArrayList class is non synchronized.
// Java ArrayList allows random access because the array works on an index basis.
// In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
// We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases.


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