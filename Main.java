package com.company;
import java.util.Scanner;

class Matrix {

    Scanner num = new Scanner(System.in);
    int[][] matr;
    int a, b, c, d;

    Matrix() {
        System.out.print(" Enter the fist element of matr     : ");
        a = num.nextInt();
        System.out.print(" Enter the second element of matr   : ");
        b = num.nextInt();
        System.out.print(" Enter the third element of matr    : ");
        c = num.nextInt();
        System.out.print(" Enter the fourth element of matr   : ");
        d = num.nextInt();
        matr = new int[2][2];
        matr[0][0] = a;
        matr[0][1] = b;
        matr[1][0] = c;
        matr[1][1] = d;
        System.out.println("___YOUR__MATRIX___");
        System.out.println(a + "  " + b);
        System.out.println(c + "  " + d);

        Scanner dot = new Scanner(System.in);
        System.out.println("___________MENU___________");
        System.out.println(" 1. count determinant ");
        System.out.println(" 2. change the matrix ");
        System.out.println(" 3. multiplicate  (matrix)");
        System.out.println(" 4. count the sum (matrix)");
        System.out.println(" 5. multiplicate  (number)");
        System.out.println(" 6. EXIT");

        int action;
        lol: while (true) {
            System.out.print("__Choose the number of action__");
            action = dot.nextInt();
            switch (action) {
                case 1:
                    countDet(a, b, c, d);
                    break;
                case 2:
                    changeMatr(a, b, c, d);
                    break;
                case 3:
                    multiplicate(a, b, c, d);
                    break;
                case 4:
                    findtheSum(a, b, c, d);
                    break;
                case 5:
                    multiplicNumber(a, b, c, d);
                    break;
                case 6: System.out.println("_____________BYE!___________");
                    break lol;
                default:
                    System.out.println("_____________ERROR___________");
                    break;
            }
        }
    }

    void countDet(int a, int b, int c, int d) {
        int result;
        result = a * d - b * c;
        System.out.println("___DETERMINANT_IS___" + result);
    }

    void changeMatr(int a, int b, int c, int d) {
        int temp;
        temp = b;
        b = c;
        c = temp;
        System.out.println("___CHANGED_MATRIX_IS___");
        System.out.println(a + "  " + b);
        System.out.println(c + "  " + d);
    }

    void multiplicate(int a, int b, int c, int d) {
        int a1, b1, c1, d1;
        int result1, result2, result3, result4;
        Scanner num = new Scanner(System.in);
        System.out.println("_Enter_elements_of_new_matrix_");
        System.out.print(" Enter the fist element of matr : ");
        a1 = num.nextInt();
        System.out.print(" Enter second element of matr   : ");
        b1 = num.nextInt();
        System.out.print(" Enter third element of matr    : ");
        c1 = num.nextInt();
        System.out.print(" Enter fourth element of matr   : ");
        d1 = num.nextInt();
        result1 = a1 * a;
        result2 = b1 * b;
        result3 = c1 * c;
        result4 = d1 * d;
        System.out.println( "____NEW_MATRIX_IS___");
        System.out.println(result1 + "  " + result2);
        System.out.println(result3 + "  " + result4);

    }

    void findtheSum(int a, int b, int c, int d) {
        int a1, b1, c1, d1;
        int result1, result2, result3, result4;
        Scanner num = new Scanner(System.in);
        System.out.println("_Enter_elements_of_new_matrix_");
        System.out.print(" Enter the fist element of matr : ");
        a1 = num.nextInt();
        System.out.print(" Enter second element of matr   : ");
        b1 = num.nextInt();
        System.out.print(" Enter third element of matr    : ");
        c1 = num.nextInt();
        System.out.print(" Enter fourth element of matr   : ");
        d1 = num.nextInt();
        result1 = a1 + a;
        result2 = b1 + b;
        result3 = c1 + c;
        result4 = d1 + d;
        System.out.println( "____NEW_MATRIX_IS___");
        System.out.println(result1 + "  " + result2);
        System.out.println(result3 + "  " + result4);

    }

    void multiplicNumber(int a, int b, int c, int d) {
        int number;
        int result1, result2, result3, result4;
        Scanner num = new Scanner(System.in);
        System.out.print(" Enter NUMBER : ");
        number = num.nextInt();
        result1 = a * number;
        result2 = b * number;
        result3 = c * number;
        result4 = d * number;
        System.out.println( "____NEW_MATRIX_IS___");
        System.out.println(result1 + "  " + result2);
        System.out.println(result3 + "  " + result4);
    }

}


public class Main {
    public static void main(String[] args) {

        Matrix Matr = new Matrix();

    }
}