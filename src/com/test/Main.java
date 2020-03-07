package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

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
        lengthMoreSr(n, array);

        System.out.println();
        System.out.println("task4");
        System.out.println("Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.");
        varabValMi(n, array);
*/
        System.out.println();
        System.out.println("task5");
        System.out.println("Найти количество чисел, содержащих только четные цифры, а среди них количество чисел с равным числом четных и нечетных цифр.");
        evenNumbers(array);

/*
        System.out.println();
        System.out.println("task6");
        System.out.println("Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.");
        increasingNumbers(array);

        System.out.println();
        System.out.println("task7");
        System.out.println("Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.");
        variousValues(array);

        System.out.println();
        System.out.println("task8");
        System.out.println("Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.");
        printMatrixFromTo(in);

        System.out.println();
        System.out.println("task9");
        System.out.println("9.Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.");
        allAboutMatrix(in);
*/
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
        double[] array = new double[Integer.parseInt(n)];
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

    private static void varabValMi(int n, Integer[] array) {
        int[] countArray = new int[n];

        for (int i = 0; i < array.length; i++) {
            String s = "" + array[i];
            char[] ch = s.toCharArray();
            int count = 0;

            for (int i1 = 0; i1 < ch.length; i1++) {
                for (int i2 = 1; i2 < ch.length; i2++) {
                    if (ch[i1] == ch[i2]) {
                        count++;
                    }
                }
            }
            countArray[i] = count;
        }
        int min = countArray[0];
        int minVal = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > min) {
                min = countArray[i];
                minVal = i;
            }
        }
        System.out.println("min = " + min + "\tValue with least Digits Number: " + array[minVal]);
    }

    //task5
    private static void evenNumbers(Integer[] array) {
        boolean val = true;
        int val1 = 0, val2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                String s = "" + array[i];
                char[] ch = s.toCharArray();
                for (int i1 = 0; i1 < ch.length; i1++) {
                    if (ch[i1] % 2 == 0) {
                        val1 += 1;
                    } else {
                        val2 += 1;
                    }
                }
                val1 = 0;
                val2 = 0;
                if (val1 == val2 && val) {
                    val = false;
                    System.out.println("Первое значение удовлетворяющее условию: "+array[i]);
                }
            }
        }
    }
    //task6
    private static void increasingNumbers(Integer[] array) {
        boolean val = false, justFirst = true;
        for (int i = 0; i < array.length; i++) {
            String s = "" + array[i];
            char[] ch = s.toCharArray();
            for (int i1 = 0; i1 < ch.length - 1; i1++) {
                if (ch[i1] >= ch[i1 + 1]) break;
                else val = true;
            }
            if (val && justFirst) {
                System.out.println(array[i]);
                val = false;
                justFirst = false;
            }
        }
    }

    //task7
    private static void variousValues(Integer[] array) {/*
        int[] intArray = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
        IntStream.of(intArray)
                .filter(x -> String.valueOf(x).chars()
                        .distinct()
                        .count() == String.valueOf(x).length())
                .forEach(System.out::println);*/

        boolean val = false, justFirst = true;
        for (int i = 0; i < array.length; i++) {
            String s = "" + array[i];
            char[] ch = s.toCharArray();
            for (int i1 = 0; i1 < ch.length - 1; i1++) {
                if (ch[i1] == ch[i1 + 1]) break;
                else val = true;
            }
            if (val && justFirst) {
                System.out.println(array[i]);
                val = false;
                justFirst = false;
            }
        }

    }

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
        int[][] arr = new int[N][N];
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

    //task 9

    private static void allAboutMatrix(Scanner in) {
        System.out.print("Введите кол-во значений для ввода: ");
        String n = in.nextLine();
        int[][] matrix = new int[Integer.parseInt(n)][Integer.parseInt(n)];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * (Integer.parseInt(n) + Integer.parseInt(n)) + (-Integer.parseInt(n)));
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("task9.1");
        System.out.println("Упорядочить строки (столбцы) матрицы в порядке возрастания значений.");

        int[][] newArrayAfterSort = matrix;
        for (int i = 0; i < newArrayAfterSort.length; i++) {
            Bubsort(newArrayAfterSort[i]);
        }
        printMatrix(newArrayAfterSort);

        System.out.println();
        System.out.println("task9.2");
        System.out.println("Выполнить циклический сдвиг заданной матрицы на k позиций вправо (влево, вверх, вниз).");

        System.out.print("Введите кол-во озиций для сдвига: ");
        String position = in.nextLine();
        int m[][] = matrix.clone();
        for (int i = 0, matrixLength = matrix.length; i < matrixLength; i++) {
            m[i] = cyclicRowMove(m[i], Integer.parseInt(position));
        }
        printMatrix(m);

        System.out.println();
        System.out.println("task9.3");
        System.out.println("Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.");

        int max = 1;
        int maxValue = matrix[0][0];
        int maxMax = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    max++;
                    if (max > maxMax) maxMax++;
                } else {
                    maxValue = matrix[i][j];
                    max = 1;
                }
            }
        }
        System.out.println("max = " + maxMax);

        System.out.println();
        System.out.println("task9.4");
        System.out.println("Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.");

        int sum = 0;
        int val1, val2, jots1 = 0, jots2 = 0;
        boolean s1 = false;
        boolean s2 = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((matrix[i][j] > 0) && !s1) {
                    // val1 = matrix[i][j];
                    s1 = true;
                    jots1 = j;
                    continue;
                } else if ((matrix[i][j] > 0) && !s2) {
                    //  val2 = matrix[i][j];
                    s2 = true;
                    jots2 = j;
                }
            }
            if (s1 && s2) {
                for (int g = jots1 + 1; g < jots2; g++) {
                    sum += matrix[i][g];
                }
                if (jots2 == jots1 + 1) {
                    System.out.println("Между двумя найденными положительными значениями нет никаких чисел.");
                } else System.out.println("sum = " + sum);
            } else {
                System.out.println("Нет двух положительных значений в строке");
            }
            s1 = false;
            s2 = false;
            sum = 0;
        }

        System.out.println();
        System.out.println("task9.5");
        System.out.println("Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.");

        int matrixNew[][] = new int[matrix.length][matrix.length];
        System.out.print("Введите:\n1 если хотите повернуть матрицу на 90 градусов против часовой стрелки\n" +
                "2 если хотите повернуть матрицу на 180 градусов против часовой стрелки\n" +
                "3 если хотите повернуть матрицу на 270 градусов против часовой стрелки" +
                ": ");
        String degree = in.nextLine();

        if (Integer.parseInt(degree) == 1) {
            matrixNew = rotateMatrix(matrix);
            printMatrix(matrixNew);
        } else if (Integer.parseInt(degree) == 2) {
            matrixNew = rotateMatrix(rotateMatrix(matrix));
            printMatrix(matrixNew);
        } else if (Integer.parseInt(degree) == 3) {
            matrixNew = rotateMatrix(rotateMatrix(rotateMatrix(matrix)));
            printMatrix(matrixNew);
        } else System.out.println("Error");

        System.out.println();
        System.out.println("task9.6");
        System.out.println("Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.");


        double[][] matrixWithouSr = new double[matrix.length][matrix.length];
        double srForTheLune;
        double summ = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                summ += matrix[i][j];
            }
            srForTheLune = summ / matrix.length;
            for (int j = 0; j < matrixWithouSr.length; j++) {
                matrixWithouSr[i][j] = matrix[i][j] - srForTheLune;
            }
            summ = 0;
        }

        for (int i = 0; i < matrixWithouSr.length; i++) {
            for (int j = 0; j < matrixWithouSr.length; j++) {
                System.out.print(String.format("%.2f ", matrixWithouSr[i][j]) + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("task9.7");
        System.out.println("Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.");

        int[][] a = matrix;
        // int[][] a = {{1, 2, 3, 0, 5},                {2, 2, 3, 0, 5},                {0, 0, 0, 0, 0},                {4, 2, 3, 0, 5},                {5, 2, 3, 0, 5}};
        int i1 = matrix.length, j1 = matrix.length;
        boolean notNull;

        for (int i = 0; i < i1; i++) {
            notNull = true;
            for (int j = 0; j < j1; j++)
                if (a[i][j] != 0) {
                    notNull = false;
                    break;
                }
            if (notNull) {
                for (int k = i; k < (i1 - 1); k++)
                    for (int j = 0; j < j1; j++)
                        a[k][j] = a[k + 1][j];
                --i;
                --i1;
            }
        }
        for (int j = 0; j < j1; j++) {
            notNull = true;
            for (int i = 0; i < i1; i++)
                if (a[i][j] != 0) {
                    notNull = false;
                    break;
                }
            if (notNull) {
                for (int k = j; k < (j1 - 1); k++)
                    for (int i = 0; i < j1; i++)
                        a[i][k] = a[i][k + 1];
                --j;
                --j1;
            }
        }
        for (int i = 0; i < j1; i++, System.out.println()) {
            for (int j = 0; j < j1; j++) {
                System.out.print(a[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("task9.8");
        System.out.println("Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.");
        int[][] nullValAtLast = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int index = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) nullValAtLast[i][index++] = matrix[i][j];
            }
        }
        printMatrix(nullValAtLast);
    }

    private static void printMatrix(int[][] matrixB) {
        for (int[] ints : matrixB) {
            for (int j = 0; j < matrixB.length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int[][] matrixB = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixB[i][j] = matrix[j][matrix.length - 1 - i];
            }
        }
        return matrixB;
    }


    public static int[] Bubsort(int[] data) {
        for (int barrier = data.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
        return data;
    }


    private static int[] cyclicRowMove(int[] row, int k) {
        int rowLenght = row.length;
        int[] r = new int[rowLenght];
        int n = (k % rowLenght) + rowLenght;
        for (int i = 0; i < rowLenght; i++) {
            r[(i + n) % rowLenght] = row[i];
        }
        return r;
    }
}
