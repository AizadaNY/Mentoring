package programTasks.calculator;

import programTasks.calculator.Operations.Addition;
import programTasks.calculator.Operations.Operations;

import java.util.Scanner;

public class BasicCalculator extends Operations{



    public static void main(String[] args) {
        UserInput input=new UserInput();
        String str=input.userInput();

        if(str.contains("*")){



        }
        input.convertString(input.userInput(),"");
    }
}
