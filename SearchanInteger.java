import java.lang.*;
import java.util.*;

public class SearchanInteger {
    public static void main(String args[]) {
    float [] marks = {45.7f,67.8f,63.7f};
    float num = 45.2f;
    boolean isInArray = false;
    for(float element:marks)
    {
        if(num==element)
        {
            isInArray = true;
            break;
        }
    }
    if(isInArray)
    {
        System.out.println("Present");
    }
    else{
        System.out.println("Not Present");
    }
    
    }
}