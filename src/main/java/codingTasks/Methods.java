package codingTasks;

import java.util.*;

public class Methods {
    //user provides any number
    public static int getUserInputNumbers () {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide any number ");
        int number = 0;
        try {
            number = userInput.nextInt();
            System.out.println("Thanks for your input");
            if (number == 0) {
                System.out.println("Please provide any number except 0");
                number = userInput.nextInt();
                System.out.println("Thanks for your input");
            }
        } catch (Exception e) {
            System.out.println("Special characters or letters not allowed to enter");
        }
        return number;
    }


    public static void getFibonacciNumberUsingLoop ( int number){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 0; i < number - 2; i++) {
            int lastNum =list.get(list.size()-1);
            int secondLastNum =list.get(list.size() - 2);
            int fibNumber = lastNum + secondLastNum;
            list.add(fibNumber);

        }
        if (number <= 0) {
            System.out.println("No data to show based on your request");
        } else if (number == 1) {
            System.out.println("List of fibonacci numbers based on your request: " + list.get(0));
        }
        else {
            System.out.println("List of fibonacci numbers based on your request: " + list);
        }

    }

//    public static void getFibonacciNumberUsingRecursion(int number){
//
//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(1);
//        if(number<=1)
//         return   System.out.println("List of fibonacci numbers based on your request: " + list.get(0));
//        else
//            int lastNum =list.get(list.size()-1);
//            int secondLastNum =list.get(list.size() - 2);
//            int fibNumber = lastNum + secondLastNum;
//            list.add(fibNumber);
//        System.out.println("List of fibonacci numbers based on your request: " + list);
//
//        getFibonacciNumberUsingRecursion(number);
//
//
//
//
//    }

    public static void getNxM_matrix(int row,int column){
        Random random=new Random();
        List<Integer> listOfRandomNumbers=new ArrayList<>();
        for (int i = 0; i < row; i++) {
            listOfRandomNumbers.clear();
            for (int j = 0; j <column; j++) {
                listOfRandomNumbers.add(random.nextInt(100));
            }
            System.out.println(listOfRandomNumbers.toString().
                    replace("[", "").replace("]",""));
        }
    }

    public static void putValueToTheMultidimensionalArray(int row,int column,String value,String[][] arr){


                 if(arr[row][column].trim().toUpperCase()!="O"||arr[row][column].trim().toUpperCase()!="X"){
                    arr[row][column]=value;
                 }else{
                    System.out.println("Cell already occupied.Select different location");
                }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]).toString());
        } }

        public static void searchingValue(String value,int row, int column,String[][] arr){
            for (row = 0; row < arr.length; row++) {
                for (column = 0; column< arr[row].length; row++) {
                  if((arr[row][column]==value)||(arr[row][column].contains(value))){
                      System.out.println("Cell already occupied");
                  }else{
                      arr[row][column]=value;
                      System.out.println("Value inserted");
                      return;
                  }
                }
            }
        }





}
