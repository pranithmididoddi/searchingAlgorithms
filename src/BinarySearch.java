import java.util.*;

class BinarySearch
{
    public static void main(String[] args)
    {
        int[] array={9,1,6,10,11,12};
        int first=0;
        int last=array.length-1;
        int number=6;

        //Arrays.sort(array);

        int middle=(first+last)/2;

        while(first<=last) {
            if (array[middle] < number) {
                first = middle + 1;
            }
            else if(array[middle]==number)
            {
                System.out.println("The element is present at: "+(middle+1)+" position");
                break;
            }
            else
            {
                last=middle-1;
            }
            middle=(first+last)/2;
        }
        if(first>last) System.out.println("The number is not in the list");
    }
}