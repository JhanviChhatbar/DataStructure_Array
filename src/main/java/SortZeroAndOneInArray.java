public class SortZeroAndOneInArray {

    // sort given array which contains only zeros and once without using any APIs

    public static void main(String[] args) {

        int[] input = {1,1,0, 1,0, 0,0,1,1};

        //sortUsingTwoPointers(input);
        swapElementUsingTemp(input);
    }

    public static void print(int[] output){
        for(int i=0; i < output.length; i++){
            System.out.print(output[i] + " ");
        }
    }

    // In this solution, will sort using two pointer, one at from left and one fron right of array
    // If found and one at left and any zero at right then will swap both values
    public static void sortUsingTwoPointers(int[] input){
        int i=0;
        int j= input.length-1;

        while (i<=j){
            if(input[i] == 0){
                i++;
            }else if(input[j] == 0){
                input[i] = 0;
                input[j] = 1;
                i++; j--;
            }else{
                j--;
            }
        }

        print(input);
    }

    public static void swapElementUsingTemp(int[] input){
        int left = 0;

        // Iteration over array using length function
        for (int i = 0; i < input.length; ++i) {

            // If zeros are present
            if (input[i] == 0) {

                // Swap the elements using
                // temporary variable
                int temp = input[left];
                input[left] = input[i];
                input[i] = temp;

                // Pre incrementing left pointer
                ++left;
            }
        }

        // Calling above function to
        // print updated array
        print(input);
    }
}
