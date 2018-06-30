package hello;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

public class FrontBack {
    int[] inputArray = {2, 3, 15, 15, 3, 2};
    public boolean isSymmetric() {
        boolean symmetric = true;
        for(int i = 0; i< inputArray.length/2; i++){
            if(inputArray[i] != inputArray[inputArray.length-(i+1)]){
                symmetric = false;
                break;
            }
        }
        return  symmetric;
    }


    /*Only For Testing*/
    public static void main(String args[]) {
        FrontBack frontBack = new FrontBack();
        System.out.println("Front Back Array list:" + frontBack.isSymmetric());
    }
}


