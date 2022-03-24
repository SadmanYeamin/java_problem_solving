import java.lang.*;
import java.util.*;


public class ReverseArray {
    public static void main(String args[]) {
    int [] marks = {4,67,63};
    int temp =0;
    int l = marks.length;
    int n = Math.floorDiv(l,2);
   // float sum = 0;
    for(int i=0;i<n;i++)
    {
        temp = marks[i];
        marks[i] = marks[l-i-1];
        marks[l-i-1] = temp;
    }
    for(int element:marks)
    {
        System.out.println(element +" ");
    }
    
    }
}