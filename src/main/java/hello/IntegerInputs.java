package hello;

public class IntegerInputs {
    public int[] inputArray = new int[]{10,2,3,40,50,6,70,8};
    int maximum,minimum;
    public int getMaximum(){
        for(int i=0;i<=inputArray.length;i++){
            if(inputArray[i] > maximum){
                maximum=inputArray[i];
            }
        }
        return maximum;
    }
    public int getMinimum(){
        for(int i=0;i<=inputArray.length;i++){
            if(minimum < inputArray[i]){
                minimum = inputArray[i];
            }
    }
    return minimum;
    }
    public static void main(String args[]){
        IntegerInputs integerInputs = new IntegerInputs();
        System.out.println("maximum value =" + integerInputs.getMaximum());
        System.out.println( "minimum value ="+ integerInputs.getMinimum());

    }
}

