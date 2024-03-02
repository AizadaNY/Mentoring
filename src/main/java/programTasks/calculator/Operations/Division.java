package programTasks.calculator.Operations;

public class Division extends Operations{


    public double calculate(String [] result){

        return Double.parseDouble(result[0].trim()) / Double.parseDouble(result[2].trim());

    }
}
