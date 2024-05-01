package de.telran.lesson_7;
import java.util.LinkedList;
import java.util.List;


public class SimpleLinkedList {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        //add to tail

        list.add(5);
        list.add(8);
        list.add(2);
        list.add(9);
        list.addLast(7);// ravnoznachno s add

        System.out.println(list);


        //add element

        list.add(2,10);

        System.out.println(list);


        //add to head

        list.addFirst(11);
        list.add(0,12);// c indeksom, ravnoznachno s addFirst
        System.out.println(list);



        //deleting elements

        //delete head

        System.out.println(list.remove(0));// delete by index
        System.out.println(list);

        System.out.println(list.removeFirst());// alternative method
        System.out.println(list);

        // delete by tail

        System.out.println(list.removeLast());
        System.out.println(list);

        System.out.println(list.remove(list.size()-1)); // delete tail by index
        System.out.println(list);

        //delete in center

        System.out.println(list.remove(2)); //delete by index
        System.out.println(list);

        System.out.println(list.remove(Integer.valueOf(8)));// delete by object, just for integer, cos compillator is confused
        System.out.println(list);

        //get info from list

        System.out.println(list.get(1));//show element with 1 index
        System.out.println(list.getFirst()); //show first elem
        System.out.println(list.getLast()); // show last elem

        //modify info



        // extra methods - find info

        System.out.println(list.contains(5));
        System.out.println(list.contains(10));
        if(list.contains(5)) {
            System.out.println("the number is found");
        }
        else {
            System.out.println("the number is not found");
        }

        //clear list
        list.clear();
        System.out.println(list);
    }
}
