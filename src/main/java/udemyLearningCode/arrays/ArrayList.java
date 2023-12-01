package udemyLearningCode.arrays;

import java.util.Iterator;
import java.util.List;

public class ArrayList {

    public static void main(String[] args) {


        List<String> list=new java.util.ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            String value= iterator.next();
            System.out.println(value);
        }
    }}