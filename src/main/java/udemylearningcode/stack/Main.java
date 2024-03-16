package udemylearningcode.stack;

public class Main {

    public static void main(String[] args) {

        Stack stack=new Stack(2);
        Boolean result=stack.isFull();
        System.out.println(result);
        stack.push(2);
        stack.push(7);
        stack.push(5);
        int element=stack.peek();
        System.out.println(element);
        stack.peek();




    }


}
