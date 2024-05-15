package udemylearningcode.stack;

public class ThreeInOne {

    private int numberOfStacks=3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize){
        stackCapacity=stackSize;
        values=new int[stackSize*numberOfStacks];
        sizes=new int[numberOfStacks];
    }

    public Boolean isFull(int stackNumber){
        if(sizes[stackNumber]==stackCapacity){
            return true;
        }else {
            return false;
        }
    }

    public Boolean isEmpty(int stackNumber){
        if(sizes[stackNumber]==0){
            return true;
        }else{
            return false;
        }
    }

    private int indexOfTop(int stackNumber){
        int offset=
    }
}
