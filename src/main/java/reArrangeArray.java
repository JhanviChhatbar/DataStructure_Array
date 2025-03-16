import java.util.Arrays;

public class reArrangeArray {
    /*
    Given an array of elements of length N, ranging from 0 to N – 1. All elements may not be present in the array.
    If the element is not present then there will be -1 present in the array.
    Rearrange the array such that A[i] = i and if i is not present, display -1 at that place.
     */

    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        int[] output = reArrangeArr(arr);

        Arrays.stream(output).forEach(System.out::println);


    }

    public static int[] reArrangeArr(int[] input){
        int temp =0;
        for(int i=0; i<input.length;){
            if(input[i] >=0 && input[i] != i){
                temp = input[input[i]];
                input[input[i]] = input[i];
                input[i] = temp;
            }
            else{
                i++;
            }
        }
        return input;
    }
}
