/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproblemcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String answer = "y";

        do {
            String inputcharacter = ValidateNumberOfTrailAndDataTypes();
            if (inputcharacter != null) {
                int[] numbers = ConvertStringTointArray(inputcharacter);
                System.out.println(" Array of splited arrarr : " + Arrays.toString(numbers));
                String Result = GitResult(numbers);
                System.out.println(" Final Ressult :   ");
                System.out.println(Result);

                System.out.println(" replay y/n ");
                answer = input.next();
            }

        } while (answer.equals("y"));

    }

    public static String ValidateNumberOfTrailAndDataTypes() {

        Scanner input;
        String numberOfthrowns;
        String inputcharacter = null;
        String rePlay;
        input = new Scanner(System.in);

        System.out.print("Please enter your Number of throwns : ");
        numberOfthrowns = input.nextLine().trim();
        if (numberOfthrowns.length() <= 7) {
            if (numberOfthrowns != "" && numberOfthrowns.matches("^[0-9]*$")) {
                System.out.println("Number of throwns : " + numberOfthrowns);

                System.out.println("Please enter Number of character equle to lenght of throwns : ");
                inputcharacter = input.nextLine().trim();

                if (inputcharacter != "" && inputcharacter.matches("^[0-9]*$")) {
                    if (inputcharacter.length() == Integer.valueOf(numberOfthrowns)) {

                        
                        return inputcharacter;

                    } else {
                        System.out.println(" Please enter Integer correct Number of  throwns equle to number of character ");
                        ValidateNumberOfTrailAndDataTypes();
                    }

                } else {
                    System.out.println(" Please  renter Integer  Number of  throwns equle to number of character ");
                    ValidateNumberOfTrailAndDataTypes();
                }
            } else {

                System.out.println(" Please enter Integer Number of throwns ");
                ValidateNumberOfTrailAndDataTypes();

            }
        } else {
            System.out.println(" Please enter  Number of throwns less than 1,000,000 ");
        }

         
        return inputcharacter;
    }

    public static int[] ConvertStringTointArray(String nameinputchar) {

        String[] splited = nameinputchar.split("");
        int[] numbers = new int[splited.length];
        for (int i = 0; i < splited.length; i++) {
            numbers[i] = Integer.parseInt(splited[i]);
        }
        return numbers;

    }

    public static String GitResult(int[] intArray1) {
//        System.out.println(" start GitResult  ");
        int maxlenght = 0;
        int restlenght = 0;

        int maxlenghtofLuckySeries = 0;
        int restlenghtofLuckySeries = 0;

        int Lukylenghtoftwo = 0;
        int Lukylenghtofthree = 0;
        int Lukylenghtof55 = 0;
        int Lukylenghtof66 = 0;
        int Lukysseries = 0;
        Integer[] intArrayLuvkySeriesofthree = new Integer[]{556, 656, 555, 666};
        Integer[] intArrayLuvkySeriesofTwo55 = new Integer[]{55};
        Integer[] intArrayLuvkySeriesofTwo66 = new Integer[]{66};

        List<Integer> intListofLuckySeriesofthree = new ArrayList<>(Arrays.asList(intArrayLuvkySeriesofthree));
        List<Integer> intListofLuckySeriesofTwo55 = new ArrayList<>(Arrays.asList(intArrayLuvkySeriesofTwo55));
        List<Integer> intListofLuckySeriesofTwo66 = new ArrayList<>(Arrays.asList(intArrayLuvkySeriesofTwo66));

//        int[] intArray1 = {6, 1, 6, 1, 6, 1, 6, 6, 6};
//        int[] intArray1 = {4, 5, 6, 1, 1, 6, 5, 1, 3, 6, 5, 6, 1, 2, 4, 5, 6, 6};
//        int[] intArray1 = {5, 6, 6, 1, 1, 1, 6, 6, 6, 2, 6, 6, 3, 4, 4, 1, 6};
        int count = 0;
        int arrlenght = intArray1.length;
        for (int i = 0; i <= arrlenght - 1; i++) {

///////////////////////////////////////////////  Exercise 3 /////////////////////////////////////////////////
            if (i <= arrlenght - 2) {

                if (i == 0) {

                    if (intListofLuckySeriesofthree.contains(Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])))) {

                        Lukylenghtofthree++;

                    }  
                    else if (intListofLuckySeriesofTwo66.contains(Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1])))) {
                        Lukylenghtof66++;
                        Lukylenghtoftwo++;
                    } //                       
                    else if (intListofLuckySeriesofTwo55.contains(Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1])))) {
                        Lukylenghtof55++;
                        Lukylenghtoftwo++;
                    }

                } else if (i == arrlenght - 2) {

                    if (intArray1[i - 1] != 6 && intListofLuckySeriesofTwo66.contains(Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1])))) {
                        Lukylenghtoftwo++;
                        Lukylenghtof66++;

                    } else if (intArray1[i - 1] != 5 && intListofLuckySeriesofTwo55.contains(Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1])))) {
                        Lukylenghtoftwo++;
                        Lukylenghtof55++;
                    }

                } else if (intArray1[i] == 6 || intArray1[i] == 5) {
                    if (intListofLuckySeriesofthree.contains(Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])))) //                            (Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1]) + String.valueOf(intArray1[i + 2])) == 666
                    {
                        Lukylenghtofthree++;

                    } else if (intArray1[i - 1] != 6 && intListofLuckySeriesofTwo66.contains(Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1])))) {
                        Lukylenghtoftwo++;
                        Lukylenghtof66++;
                    } else if (intArray1[i - 1] != 5 && intListofLuckySeriesofTwo55.contains(Integer.valueOf(String.valueOf(intArray1[i]) + String.valueOf(intArray1[i + 1])))) {
                        Lukylenghtoftwo++;
                        Lukylenghtof55++;
                    }

                }
            }
            if (intArray1[i] == 6 || intArray1[i] == 5) {
                restlenghtofLuckySeries++;

                if (restlenghtofLuckySeries > maxlenghtofLuckySeries) {
                    maxlenghtofLuckySeries = restlenghtofLuckySeries;
                }

            } else {
                restlenghtofLuckySeries = 0;
            }

/////////////////////////////// Exercise 2 //////////////////////////////////////////////////////////
            if (intArray1[i] != 6) {
                restlenght++;

                if (restlenght > maxlenght) {
                    maxlenght = restlenght;
                }

            } else {
                restlenght = 0;
            }

/////////////////////////////////////////Exercise 1 ///////////////////////////////////////////
            if (i == arrlenght - 1) {

            } else if (i <= arrlenght - 2) {

                if (i == 0) {
                    if (intArray1[i] == 6 && intArray1[i + 1] == 6 && intArray1[i + 2] != 6) {
                        count++;

                    }
                } else if (i == arrlenght - 2) {
                    if (intArray1[i - 1] != 6 && intArray1[i] == 6 && intArray1[i + 1] == 6) {
                        count++;

                    }
                } else {
                    if (intArray1[i - 1] != 6 && intArray1[i] == 6 && intArray1[i + 1] == 6 && intArray1[i + 2] != 6) {
                        count++;

                    }
                }
            }

        }
        if (maxlenghtofLuckySeries == intArray1.length) {
            Lukysseries = maxlenghtofLuckySeries;

        } else if (Lukylenghtoftwo == Lukylenghtofthree && Lukylenghtoftwo != 0 && Lukylenghtofthree != 0) {

            Lukysseries = 3;
        } else if (Lukylenghtoftwo > Lukylenghtofthree) {
            if (Lukylenghtof55 > 0 && Lukylenghtof66 > 0 && Integer.valueOf(Lukylenghtof55 + Lukylenghtof66) > Lukylenghtofthree) {

                Lukysseries = 2;

            } else {

                Lukysseries = 3;
            }

        } else if (Lukylenghtofthree > Lukylenghtoftwo) {
            if (Lukylenghtofthree == 1) {
                Lukysseries = 1;
            } else if (Lukylenghtofthree > 1) {
                Lukysseries = 3;
            }
        }

//        System.out.println(" Final Ressult :   ");
//        System.out.println("result      :   " + count);
//        System.out.println("maxlenght   :   " + maxlenght);
//        System.out.println("Lukylenght  :   " + Lukysseries);
        return (count + "\n" + maxlenght + "\n" + Lukysseries);
    }

}
