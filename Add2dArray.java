import java.lang.*;
import java.util.*;

public class Add2dArray {
    public static void main(String args[]) {
    int [][] arr1 = {{1,2,3},{4,5,6}};
    int [][] arr2 = {{3,1,2},{6,3,1}};
    
    int [][] result = {{0,0,0},{0,0,0}};
    // float [] marks = {45.7f,67.8f,63.7f};
    // float sum = 0;
    for(int i=0;i<arr1.length;i++) //row number of times
    {
        for(int j=0;j<arr1[i].length;j++) //column number of time
        {
            System.out.format("setting value for i=%d and j=%d\n",i,j);
            result[i][j] = arr1[i][j]+arr2[i][j];
        }
    }
    for(int i=0;i<arr1.length;i++) //row number of times
    {
        for(int j=0;j<arr1[i].length;j++) //column number of time
        {
            System.out.print(result[i][j]+" ");
            result[i][j] = arr1[i][j]+arr2[i][j];
        }
        System.out.println("");
    }
    
    }
}