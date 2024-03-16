package programtasks.calculator;

public class ConvertUserInput {

    public String[]  convertString(String userInput,String operation){
        String[] arr=userInput.split(operation);
        return arr;
    }


}
