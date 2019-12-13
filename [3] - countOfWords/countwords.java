public class countwords {

    public static void main(String[] args) {


        String input = "Today is Monday";

        int count = 0;

        for(char ch: input.toCharArray()){

            if(ch == 'a'){
                count++;
            }
        }


        System.out.printf("A frase: %s tem o nuemro de a: " + count, input.toString());


    }

}