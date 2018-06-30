package hello;

public class SeperatingArray {
    public int [] inputArray = {1,2,3,4,5,6,7,8,9,10};
    public int ouputArray1,outputArray2;
    public int seperate1() {
        for (int i = 0; i < inputArray.length; i++) {
            ouputArray1 = inputArray[i];
        }
        return ouputArray1;
    }
    public int seperate2(){
        for(int i=0;i<inputArray.length;i++){
            outputArray2 = inputArray.length/2 -i;
        }
        return outputArray2;
    }
public static void main(String args[]){
         SeperatingArray seperate = new SeperatingArray();
         System.out.println("Output Array1="+seperate.seperate1());
         System.out.println("Output Array2="+seperate.seperate2());
}

}
