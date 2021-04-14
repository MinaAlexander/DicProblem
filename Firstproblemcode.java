/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproblemcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class Firstproblemcode {

    public static void main(String[] args) {
        ValidateNumberOfTrailAndDataTypes();

    }

    public static void ValidateNumberOfTrailAndDataTypes() {

        Scanner input;
        String name;
        String nameinputchar;
        input = new Scanner(System.in);
        input = new Scanner(System.in);
        System.out.print("Enter your Number of trails : ");
        name = input.nextLine();
        System.out.println("Number of trails : " + name);

        if (name != "" && !name.matches("^[a-zA-Z]*$")) {
            input = new Scanner(System.in);
            nameinputchar = input.nextLine();
            System.out.println(" nameinputchar : " + nameinputchar);
            System.out.println(" Integer.valueOf(g.name) : " + Integer.valueOf(name));

            if (nameinputchar != "" && !nameinputchar.matches("^[a-zA-Z]*$")) {
                if (nameinputchar.length() == Integer.valueOf(name)) {
                    input.close();
                    ConvertStringTointArray(nameinputchar);
                } else {
                    System.out.println(" Please enter Integer chars ");
                    ValidateNumberOfTrailAndDataTypes();
                }

            } else {
                System.out.println(" Please enter Integer chars ");
                ValidateNumberOfTrailAndDataTypes();
            }
        } else {
            System.out.println(" Please enter Integer chars ");
            ValidateNumberOfTrailAndDataTypes();
        }
    }

    public static void ConvertStringTointArray(String nameinputchar) {

        String[] splited = nameinputchar.split("");
        int[] numbers = new int[splited.length];

        for (int i = 0; i < splited.length; i++) {
            numbers[i] = Integer.parseInt(splited[i]);
        }
        GitResult(numbers);

        System.out.println(" Array of splited Numbers : " + Arrays.toString(numbers));

    }

    public static void GitResult(int[] intArray1) {
        int maxlenght = 0;
        int restlenght = 0;
        int Lukylenghtoftwo = 0;
        int Lukylenghtofthree = 0;
        int Lukylenghtof55 = 0;
        int Lukylenghtof66 = 0;

//        int[] intArray1 = {6, 1, 6, 1, 6, 1, 6, 6, 6};
//        int[] intArray1 = {4, 5, 6, 1, 1, 6, 5, 1, 3, 6, 5, 6, 1, 2, 4, 5, 6, 6};
//        int[] intArray1 = {5, 6, 6, 1, 1, 1, 6, 6, 6, 2, 6, 6, 3, 4, 4, 1, 6};
        int count = 0;
        int arrlenght = intArray1.length;
        System.out.println("  arrlenght : " + arrlenght);
        for (int i = 0; i <= arrlenght - 1; i++) {
//            for (int j = i + 1; j < intArray1.length; j++) {
            System.out.println("  iiiii : " + i);
            if (i <= arrlenght - 2) {
                System.out.println("  iiiii of exc 39996655 ::: " + i);
//                System.out.println("  Integer : " + String.valueOf(Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2]))));
                if (i == 0) {
                    if (Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 666
                            || Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 555
                            || Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 656
                            || Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 556) {

                        Lukylenghtofthree++;

                    } else if (intArray1[i] == 6 && intArray1[i + 1] == 6) {
                        Lukylenghtof66++;
                        Lukylenghtoftwo++;
                    } else if (intArray1[i] == 5 && intArray1[i + 1] == 5) {
                        Lukylenghtof55++;
                        Lukylenghtoftwo++;
                    }

                } else if (i == arrlenght - 2) {

//                    if (Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 666
//                            || Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 555
//                            || Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 656
//                            || Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 556) {
//
//                        Lukylenghtofthree++;
//                        System.out.println("  iiiii of exc  Lukylenghtofthree2244 ::: " + Lukylenghtofthree++ + "  --- iii ::: " + i);
//
//                    } 
                    if (intArray1[i - 1] != 6 && intArray1[i] == 6 && intArray1[i + 1] == 6) {
                        Lukylenghtoftwo++;
                        Lukylenghtof66++;

                    } else if (intArray1[i - 1] != 5 && intArray1[i] == 5 && intArray1[i + 1] == 5) {
                        Lukylenghtoftwo++;
                        Lukylenghtof55++;
                    }

                } else if (intArray1[i] == 6 || intArray1[i] == 5) {

                    if (Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 666
                            || Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 555
                            || Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 656
                            || Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 556) {

                        Lukylenghtofthree++;
//                        System.out.println("  iiiii of exc  Lukylenghtofthree2244 ::: " + Lukylenghtofthree++ "  --- iii ::: " + i);

                    } else if (intArray1[i - 1] != 6 && intArray1[i] == 6 && intArray1[i + 1] == 6 || intArray1[i - 1] != 5 && intArray1[i] == 5 && intArray1[i + 1] == 5) {
                        Lukylenghtoftwo++;
                        Lukylenghtof66++;
                    } else if (intArray1[i - 1] != 5 && intArray1[i] == 5 && intArray1[i + 1] == 5) {
                        Lukylenghtoftwo++;
                        Lukylenghtof55++;
                    }

                }
            }

            if (intArray1[i] != 6) {
                System.out.println("  iiiii : " + i);
                restlenght++;

                if (restlenght > maxlenght) {
                    maxlenght = restlenght;
                }

            } else {
                restlenght = 0;
            }
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
            System.out.println(" count result  :: " + maxlenght);
            System.out.println("  Lukylenghtoftwo : " + Lukylenghtoftwo);
            System.out.println("  Lukylenghtofthree : " + Lukylenghtofthree);

            System.out.println("  Lukylenghtoftwo 66: " + Lukylenghtof66);
            System.out.println("  Lukylenghtofthree 55: " + Lukylenghtof55);

            System.out.println("  ///////////////////////////////////////////: ");

            System.out.println("  ///////////////////////////////////////////  ::: " + Integer.valueOf(Lukylenghtof55 + Lukylenghtof66));

            if (Lukylenghtoftwo == Lukylenghtofthree) {
                System.out.println("  Lukylenght  111: " + Integer.valueOf(3));
            } else if (Lukylenghtoftwo > Lukylenghtofthree) {
                if (Lukylenghtof55 > 0 && Lukylenghtof66 > 0 && Integer.valueOf(Lukylenghtof55 + Lukylenghtof66) > Lukylenghtofthree) {
                    System.out.println("  Lukylenght  11222: " + Integer.valueOf(2));

//                    if (Lukylenghtoftwo == 1) {
//                        System.out.println("  Lukylenght  111: " + Integer.valueOf(2));
//                    }
//                    else if (Lukylenghtoftwo > 1) {
//                        System.out.println("  Lukylenght  111: " + Integer.valueOf(2));
//                    }
                } else {
                    System.out.println("  Lukylenght  11333: " + Integer.valueOf(3));
                }

            } else if (Lukylenghtofthree > Lukylenghtoftwo) {
                if (Lukylenghtofthree == 1) {
                    System.out.println("  Lukylenght  11444: " + Integer.valueOf(1));
                } else if (Lukylenghtofthree > 1) {
                    System.out.println("  Lukylenght  11555: " + Integer.valueOf(3));
                }
            }

        }

    }
}
