package tSmirnova_hw02_all;

import java.util.Scanner;

public class MyArray {

    /*import java.util.Arrays;*/


        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            /*TASK 1*/
            System.out.print("Введите радиус : ");
            int r = in.nextInt();
            System.out.print("Введите сторону квадрата a: ");
            int a = in.nextInt();
            System.out.print("Введите сторону квадрата b: ");
            int b = in.nextInt();

            if (2 * r >= Math.sqrt(a * a + b * b))
                System.out.println("Можно");
            else
                System.out.println("Нельзя");
            /*in.close();*/

            /*TASK 2*/
            System.out.print("Введите число : ");
            int n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("День недели не соответствует заданному числу");

                    /*TASK 3*/
                    for (int times = 0; times < 4; times++) {
                        for (int line = 0; line < 5; line++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

            }
        }
    }

