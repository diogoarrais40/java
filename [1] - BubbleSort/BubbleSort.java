import java.util.Arrays;

class BubbleSortImproved {
    public static void main(String args[]) {
        String[] test = { "A", "C", "D", "E", "B" };
        System.out.println("Before Sorting : " + Arrays.toString(test));
        bubbleSortImproved(test);
        System.out.println("After Sorting : " + Arrays.toString(test));
    }

    public static void bubbleSortImproved(String[] names) {
        boolean swapped = true;

        int last = names.length - 2;

        while (swapped) {
            swapped = false;

            for(int i = 0; i <= last; i++){
                if(names[i].compareTo(names[i + 1 ]) > 0 ){
                    System.out.printf("Pair to Swaap %s", names[i]);
                       
                swap(names, i, i + 1);

                swapped = true;
                
                }

         

            }
            last--;
        }
    }

    public static void swap(String[]names, int from, int to){
        String temp = names[from];
        names[from] = names[to];
        names[to] = temp;
    }

}
