/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class procode {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("x");

//        int[] intArray1 = {6, 1, 6, 1, 6, 1, 6, 6, 6};
//        int[] intArray1 = {4, 5, 6, 1, 1, 6, 5, 1, 3, 6, 5, 6, 1, 2, 4, 5, 6, 6};
        int[] intArray1 = {5, 6, 6, 1, 1, 1, 6, 6, 6, 2, 6, 6, 3, 4, 4, 1, 6};
        int count = 0;
        int arrlenght = intArray1.length;
        System.out.println("  arrlenght : " + arrlenght);
        for (int i = 0; i <= arrlenght - 1; i++) {
//            for (int j = i + 1; j < intArray1.length; j++) {
            System.out.println("  iiiii : " + i);

            if (i == arrlenght - 1) {
                System.out.println("  iiiii kkk : " + i);

            } else if (i <= arrlenght - 2) {
                System.out.println("  iiiii ggg: " + i);
                if (i == 0) {
                    if (intArray1[i] == 6 && intArray1[i + 1] == 6 && intArray1[i + 2] != 6) {
                        count++;
                        System.out.println(" count 7 :: " + count + "---intArray1[i] : " + intArray1[i] + "---intArray1[j] : " + intArray1[i]);

                        System.out.println(" count 8 :: " + count);

                    }
                } else if (i == arrlenght - 2) {
                    if (intArray1[i - 1] != 6 && intArray1[i] == 6 && intArray1[i + 1] == 6) {
                        count++;
                        System.out.println(" count 9 :: " + count + "---intArray1[i] : " + intArray1[i] + "---intArray1[j] : " + intArray1[i]);

                        System.out.println(" count 10 :: " + count);

                    }
                } else {
                    if (intArray1[i - 1] != 6 && intArray1[i] == 6 && intArray1[i + 1] == 6 && intArray1[i + 2] != 6) {
                        count++;
                        System.out.println(" count 11 :: " + count + "---intArray1[i] : " + intArray1[i] + "---intArray1[j] : " + intArray1[i]);
                        System.out.println(" count 12 :: " + count);

                    }
                }
            }

            System.out.println(" count result  :: " + count);
        }
    }
}
