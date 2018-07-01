package hello;

public class IntegerInputs {
    int maximum = -32000, minimum = 32000;
    public int getMaximum(Input input){
        for(int i=0;i<input.inputArray.length;i++){
            if(input.inputArray[i] > maximum){
                maximum=input.inputArray[i];
            }
        }
        return maximum;
    }
    public int getMinimum(Input input){
        for(int i=0;i<input.inputArray.length;i++){
            if(minimum > input.inputArray[i]){
                minimum = input.inputArray[i];
            }
    }
    return minimum;
    }
//    public static void main(String args[]){
//        IntegerInputs integerInputs = new IntegerInputs();
//        System.out.println("maximum value =" + integerInputs.getMaximum());
//        System.out.println( "minimum value ="+ integerInputs.getMinimum());
//
//    }
}

