import java.lang.*;
import java.util.*;


public class SortedArray {
    public static void main(String args[]) {
    int [] marks = {4,63,67};
    boolean isSorted = true;
   // float sum = 0;
    for(int i=0;i<marks.length-1;i++)
    {
        if(marks[i]>marks[i+1])
        {
            isSorted = false;
        }
    }
    if(isSorted)
    {
        System.out.println("sorted");
    }
    else{
        System.out.println("not sorted");
    }
    
    
    }
}