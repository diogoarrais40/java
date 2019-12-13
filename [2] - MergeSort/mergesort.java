import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {

        int[] input = { 87, 57, 370, 110, 90, 610, 02, 710, 140, 203, 150 };

        System.out.println("before Sorting");
        System.out.println(Arrays.toString(input));

        mergeSortFunction(input);



        System.out.println("After Sorting");
        System.out.println(Arrays.toString(input));

    }


    public static void mergeSortFunction(int[] input){
        mergeSortFunction(input, 0, input.length - 1 );
    }

    private static void mergeSortFunction(int[] input, int start, int end) {

        int middle = (start + end) / 2;

        if (start < end) {
            mergeSortFunction(input, start, middle);
            mergeSortFunction(input, middle + 1 , end);
        }

        int i = 0, first = start , last = middle + 1 ;

        int[] tmp = new int[end - start + 1];

        while (first <= middle && last <= end) {
          tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        while (first <= middle) {
          tmp[i++] = input[first++];
        }
        while (last <= end) {
          tmp[i++] = input[last++];
        }
        i = 0;
        while (start <= end) {
          input[start++] = tmp[i++];
        }


    }
}
