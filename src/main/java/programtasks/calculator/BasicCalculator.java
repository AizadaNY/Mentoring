package programtasks.calculator;

import programtasks.calculator.Operations.*;

public class BasicCalculator extends Operations{



    public static void main(String[] args) {
        UserInput input=new UserInput();
        String str=input.userInput();
        String [] result=input.convertString(input.userInput(),"");
        if(str.contains("*")){
            Multiplication multiplication=new Multiplication();
            multiplication.calculate(result);
        }else if(str.contains("+")){
            Addition addition=new Addition();
            addition.calculate(result);
        }else if(str.contains("-")){
            Subtraction subtraction=new Subtraction();
            subtraction.calculate(result);
        }else if(str.contains("/")){
            Division division=new Division();
            division.calculate(result);
        }

    }
}
