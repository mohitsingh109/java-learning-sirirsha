package com.javalearning.datastructure.strings;

public class StringPatternPrinting {

    /**
     * rows = 5
     *  *  --- row - 1
     *  * --- row - 2
     *  *** --- row - 3
     *  **** --- row - 4
     *  ***** --- row - 5
     */
    public static void pattern1(int rows) {
        for(int row = 1; row <= rows; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println(); // next line
        }
    }

//        *****  --- row 5
//        ****   --- row 4
//        ***    --- row 3
//        **     --- row 2
//        *      --- row 1

    public static void pattern2(int rows) {
        for(int row = rows; row > 0; row--) {
            for(int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println(); // next line
        }
    }


// 2 * rowNumber - 1
//  totalRow - currentRowNumber
//              ____*     row - 1   [2*1 - 1]: 1
//              ___***  - row - 2 (1 + 2) [2 * 2 - 1]: 3
//              __***** - row - 3(3 + 2) [2 * 3 - 1]: 5
//              _******* - row - 4 (5 + 2)
//              ********* - row - 5(7 + 2)

//            *
//            ***
//            *****
//            *******


    public static void pattern3(int rows) {
        for(int row = 1; row <= rows; row++) {

            for(int i = 1; i <= rows - row; i++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /***
     *
     *                 *******
     * //              *****
     * //              ***
     * //              *
     */
// n = 5
//                 *
//                ***
//               *****
//              *******
//             *********
//             _*******
//             __*****
//             ___***
//             ____*


    public static void pattern4(int n) {
        //Top part
        for(int row = 1; row <= n; row++) {

            for(int i = 1; i <= n - row; i++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //bottom part
        for(int row = n - 1; row > 0; row--) { //row = 5
            for(int j = 1; j <= n - row; j++) { // 5 - 3: 2
                System.out.print(" ");
            }

            for(int k = 1; k <= 2 * row - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     *     1_
     *    2_2_
     *   3_3_3_
     *  4_4_4_4_
     * 5_5_5_5_5_
     *
     */
    public static void pattern5(int rows) {
        for(int row = 1; row <= rows; row++) {

            for(int i = 1; i <= rows - row; i++) {
                System.out.print(" ");
            }

            for(int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }

            System.out.println();
        }
    }

    /**
     *
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     */

    public static void pattern6(int rows) {
        int printNumber = 1;
        for(int row = 1; row <= rows; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(printNumber + " ");
                printNumber++;
            }
            System.out.println(); // next line
        }
    }

    /**
     * rows = 5
     *  *  --- row - 1
     *  ## --- row - 2
     *  *** --- row - 3
     *  #### --- row - 4
     *  ***** --- row - 5
     */

    public static void pattern7(int rows) {
        boolean flag = true; // *
        for(int row = 1; row <= rows; row++) {
            for(int col = 1; col <= row; col++) {
                if(flag) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            flag = !flag;
            System.out.println(); // next line
        }
    }

    public static void main(String[] args) {
        //pattern1(50);
        //pattern2(5);
        //pattern3(10);
        //pattern4(6);
        //pattern5(5);
        //pattern6(5);
        //pattern7(7);
    }
}
