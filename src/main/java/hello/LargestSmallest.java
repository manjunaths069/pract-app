package hello;

public class LargestSmallest {
    public int[] inputArray ={-1,-10,-100,-1000,-10000};
    public int getBiggest (){
        int biggest=-32000;
        for(int i=0;i<inputArray.length;i++){

            if(inputArray[i]>biggest){
                biggest=inputArray[i];
            }
        }
        return biggest;

    }
    public int getsmallest(){
        int smallest=32000;
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]<smallest){
                smallest=inputArray[i];
            }
        }
        return smallest;
    }
    /*only for testing*/
    public static void main(String args[]){
        LargestSmallest obj=new LargestSmallest();
        System.out.println("the bigest value is :"+obj.getBiggest());
        System.out.println("the smallest value is :"+obj.getsmallest());
    }
}
