package adapter.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,3,4,12));
        //use iterator to traverse the list
//        Iterator<Integer> iter = numbers.iterator();
//        traverse(iter);

        Vector<Integer> vector = new Vector<>(numbers);
        Iterator<Integer> iterAdapter = new EnumerationAdapter<>(vector.elements());
        traverse(iterAdapter);
    }

    public static void traverse(Iterator<Integer> iter){
        while(iter.hasNext()){
            int value = iter.next();
            System.out.println(value);
            if(value == 12){
                iter.remove();
            }
        }
    }
}
