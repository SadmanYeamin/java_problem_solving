import java.lang.*;
import java.util.*;

public class Sumofarray {
    public static void main(String args[]) {
    float [] marks = {45.7f,67.8f,63.7f};
    float sum = 0;
    for(float element:marks)
    {
        sum = sum + element;
    }
    System.out.println("The value of sum is" +sum);
    }
}