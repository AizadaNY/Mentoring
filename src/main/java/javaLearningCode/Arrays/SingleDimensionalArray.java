package javaLearningCode.Arrays;

public class SingleDimensionalArray {

    int [] arr=null;
// it a constructor to create an array with size
    public SingleDimensionalArray(int sizeOfArray){
        arr=new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            arr[i]=Integer.MIN_VALUE;
        }
    }

    //method to provide location and data to array
    public void insertToArray(int location,int value){

        try{
            if( arr[location]==Integer.MIN_VALUE){
                arr[location]=value;
                System.out.println("Successfully inserted");
            }else{
                System.out.println("The cell is already occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access Array");
        }




    }

}
