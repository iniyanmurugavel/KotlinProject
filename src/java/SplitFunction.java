package java;

import java.util.ArrayList;

public class SplitFunction {
    public static void main(String args []){
        String arr[]={"iniyan","ashok","priya","sairam","nagarjun"};
        System.out.println("print all size "+arr.length);
        String stepInformations="";
        for(String stepElements :arr){
            stepInformations =stepInformations.concat(stepElements);
        }
        String[] stepArray=stepInformations.split(",");

        System.out.println("Total element Size "+stepArray.length);
    }
}
