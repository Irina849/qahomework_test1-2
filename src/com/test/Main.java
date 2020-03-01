package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("TASK1");
/*        System.out.println();
        System.out.println("task1");
        System.out.println("Приветствовать любого пользователя при вводе его имени через командную строку.");
        greeting(in);*/

/*        System.out.println();
        System.out.println("task2");
        System.out.println("Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        viewArgs(args);*/

/*        System.out.println();
        System.out.println("task3");
        System.out.println("Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
        printRandomValues(in);*/

/*
        System.out.println();
        System.out.println("task4");
        System.out.println("Ввести пароль из командной строки и сравнить его со строкой-образцом.");
        passowdEquals(args, in);
*/

/*        System.out.println();
        System.out.println("task5");
        System.out.println("Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.");
        sumOfArgs(args);*/

/*        System.out.println();
        System.out.println("task6");
        System.out.println("Ввести с консоли n целых чисел.");
        biiigTask6(in);*/
        /**********************/

/*      System.out.print("Введите кол-во значений для ввода: ");
        int n = in.nextInt();
        if (n == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        Integer[] array = new Integer[n];
        System.out.print("Введите целые числа через пробел: ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }*/

/*      System.out.println("TASK2");
        System.out.println();
        System.out.println("task1");
        System.out.println("Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.");
        maxShortMaxLong(array);

        System.out.println();
        System.out.println("task2");
        System.out.println("Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.");
        sort(n, array);

        System.out.println();
        System.out.println("task3");
        System.out.println("Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.");
        lengthMoreSr(n, array);*/

/*        System.out.println();
        System.out.println("task4");
        System.out.println("Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.");

        System.out.println();
        System.out.println("task5");
        System.out.println("Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.");

        System.out.println();
        System.out.println("task6");
        System.out.println("Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.");
        int n = in.nextInt();

        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = in.nextInt();
        }

        System.out.println();
        System.out.println("task7");
        System.out.println("Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.");*/

/*        System.out.println();
        System.out.println("task8");
        System.out.println("Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.");
        printMatrixFromTo(in);*/


    }

    //task1
    private static void greeting(Scanner in) {
        System.out.print("Print you name: ");
        String name = in.next();
        System.out.println("Hello, " + name);
    }

    //task2
    private static void viewArgs(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("аргумент = " + args[i]);
        }
    }

    //task3
    private static void printRandomValues(Scanner in) {
        System.out.print("Введите кол-во значений для ввода: ");
        String n = in.nextLine();
        double array[] = new double[Integer.parseInt(n)];
        System.out.println("Вывод в столбец:");
        for (int i = 0; i < Integer.parseInt(n); i++) {
            array[i] = Math.random() * 100;
            System.out.println(array[i]);
        }
        System.out.println("Вывод в строку:");
        for (int i = 0; i < Integer.parseInt(n); i++) {
            System.out.print(array[i] + "\t");
        }
    }

    //task4
    private static void passowdEquals(String[] args, Scanner in) {
    /*    System.out.print("Print your password: ");
        String newPass = in.next().trim();
        System.out.println(args.equals(newPass));*/

        String pass = "irina849";
        System.out.print("Print your password: ");
        String newPass = in.next().trim();
        System.out.println(pass.equals(newPass));
        // System.out.println(pass.equals(args[0]));
    }
    //task5

    private static void sumOfArgs(String[] args) {
        long comp = 1;
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
            comp *= Integer.parseInt(args[i]);
        }
        System.out.println("Сумма аргументов = " + sum);
        System.out.println("Произведение аргументов = " + comp);
    }

    //task6
    private static void biiigTask6(Scanner in) {
        System.out.print("Введите кол-во значений для ввода: ");
        int n = in.nextInt();
        if (n == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        Integer[] array = new Integer[n];
        System.out.print("Введите целые числа через пробел: ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        System.out.println();
        System.out.println("task6.1");
        System.out.println("Четные и нечетные числа.");

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) System.out.println(array[i] + " - четное");
            else System.out.println(array[i] + " - нечетное");
        }
        System.out.println();
        System.out.println("task6.2");
        System.out.println("Наибольшее и наименьшее число.");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            else if (array[i] < min) min = array[i];
        }
        System.out.println("Mинимальное значение = " + min);
        System.out.println("Mаксимальное значение = " + max);

        System.out.println();
        System.out.println("task6.3");
        System.out.println("Числа, которые делятся на 3 или на 9.");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 || array[i] % 9 == 0) System.out.print(array[i] + "\t");
        }

        System.out.println();
        System.out.println("task6.4");
        System.out.println("Числа, которые делятся на 5 и на 7.");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i] % 7 == 0) System.out.print(array[i] + "\t");
        }

        System.out.println();
        System.out.println("task6.5");
        System.out.println("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.");

        List<Integer> result1 = new ArrayList<Integer>();
        String number1;
        for (Integer arrays : array) {
            number1 = arrays.toString();
            if (number1.length() == 3 && number1.charAt(0) != number1.charAt(1) && number1.charAt(1) != number1.charAt(2) && number1.charAt(0) != number1.charAt(2)) {
                System.out.print("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр:");
                result1.add(arrays);
                System.out.print(arrays);
            }
        }

        System.out.println();
        System.out.println("task6.6");
        System.out.println("«Счастливые» числа.");
        List<Integer> result2 = new ArrayList<Integer>();
        String number2;
        for (Integer count : array) {
            number2 = count.toString();
            if (number2.length() == 4 && number2.charAt(0) + number2.charAt(1) == number2.charAt(2) + number2.charAt(3)) {
                result2.add(count);
            }
        }

        System.out.println("“Счастливые” числа: " + result2);
        System.out.println();
        System.out.println("task6.7");
        System.out.println("Элементы, которые равны полусумме соседних элементов.");
        List<Integer> result = new ArrayList<Integer>();

        Integer[] numbers = array.clone();
        for (int ii = 1; ii < numbers.length - 1; ii++) {
            if (numbers.length < 3) break;
            if (numbers[ii] == (numbers[ii - 1] + numbers[ii + 1]) / 2) result.add(numbers[ii]);
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println("Элементы, которые равны полусумме соседних элементов: " + result.get(i));
        }
    }

    //TASK2
    //task1
    private static void maxShortMaxLong(Integer[] array) {
        String number;
        int i = Integer.parseInt(String.valueOf(array[0]));
        int max = i;
        int min = i;
        int max_length = String.valueOf(array[0]).length();
        int min_length = String.valueOf(array[0]).length();

        for (Integer arrays : array) {
            number = arrays.toString();
            if (number.length() > max_length) {
                max_length = number.length();
                max = Integer.parseInt(number);
            } else if (number.length() < min_length) {
                min_length = number.length();
                min = Integer.parseInt(number);
            }
        }
        System.out.println("MAX: " + max + "\t" + max_length);
        System.out.println("MIN: " + min + "\t" + min_length);
    }

    //task2
    private static void sort(int n, Integer[] array) {
        Integer[] arr = array.clone();
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i1 = 0; i1 < n - 1; i1++) {
                if (arr[i1] > arr[i1 + 1]) {
                    isSorted = false;
                    buf = arr[i1];
                    arr[i1] = arr[i1 + 1];
                    arr[i1 + 1] = buf;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "\t " + arr[i].toString().length());
        }
    }

    //task3
    private static void lengthMoreSr(int n, Integer[] array) {
        String number;
        String number1;
        int count = 0;
        for (Integer arrays : array) {
            number = arrays.toString();
            count += number.length();

        }
        double ser = count / n;
        for (Integer arrays : array) {
            number1 = arrays.toString();
            if (number1.length() >= ser) {
                System.out.println("Число: " + number1 + "\t Длинна: " + number1.length());
            }
        }
    }

    //task4
    //task5
    //task6
    //task7
    //task8
    private static void printMatrixFromTo(Scanner in) {
        System.out.print("Введите кол-во значений для ввода: ");
        int k = in.nextInt();
        if (k <= 1) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        System.out.print("Введите размерность квадратной матрицы: ");
        int N = in.nextInt();
        if (N <= 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        int arr[][] = new int[N][N];
        int firstValue = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (firstValue < k) {
                    arr[i][j] = firstValue;
                    firstValue++;
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.print("\n");

        }
    }


    private static void bubbleSort(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int thirdCUP = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = thirdCUP;
                }
            }
        }
    }


}
