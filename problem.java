public class problem {

    public static void main(String[] args) {

        System.out.println("x");

        int[] intArray1 = { 6, 1, 6, 1, 6, 1, 6, 6, 6 };
        // int[] intArray2 = { 4, 5, 6, 1, 1, 6, 5, 1, 3, 6, 5, 6, 1, 2, 4, 5, 6, 6 };
        // int[] intArray3 = { 5, 6, 6, 1, 1, 1, 6, 6, 6, 2, 6, 6, 3, 4, 4, 1, 6 };
        int count = 0;
        for (int i = 0; i < intArray1.length; i++) {
            for (int j = i + 1; j < intArray1.length; j++) {

                if (intArray1[i] == 6 && intArray1[j] == 6) {
                    count++;
                    System.out.println(" count++" + count+ "---intArray1[i] : "+intArray1[i]+ "---intArray1[j] : "+intArray1[j]);
                }
            }

            // if (intArray1[i] == intArray1[j]){

            // }
        }

    }

}
