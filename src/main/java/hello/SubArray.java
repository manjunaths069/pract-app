package hello;

public class SubArray {
 public static int [] inputArray = {10,12,20,30,25,40,32,31,35,50,60};

 public int[] getSubArray(int [] inputArray, int start,int end){
     this.inputArray = inputArray;
     int outputArraylength = end+1-start;
     int [] outputArray=new int[outputArraylength];

     for(int i=start, j = 0;i<=end; i++, j++) {

             outputArray[j] = inputArray[i];
     }
      return outputArray;
  }

  public static void main(String args[]) {
     SubArray subArray = new SubArray();
     int[] outputArray = subArray.getSubArray(inputArray,5,9);

     for( int i=0;i<outputArray.length;i++){
         System.out.println("outputArray="+outputArray[i]);
     }
  }
}
