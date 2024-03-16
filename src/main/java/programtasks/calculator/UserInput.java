package programtasks.calculator;

import java.util.Scanner;

public class UserInput extends ConvertUserInput{

    public String userInput(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }


}
