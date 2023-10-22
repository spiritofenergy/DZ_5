package org.example;

import java.util.*;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        System.out.println(" // 1. Пользователь вводит два числа. Возвести второе в степень первого");
        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(Math.pow(x, y));

        System.out.println(" // 2. Пользователь вводит три числа. Возвести 1 в степень 2, и результат в \n" +
                "степень 3.");
        System.out.println(" Введите три числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        double result = Math.pow(num1, num2);
        double superDouble = Math.pow(result, num3);
        System.out.println(result);
        System.out.println(superDouble);

        System.out.println(" // 3. Решить предыдущую задачу, но Math.pow можно использовать только на \n" +
                "одной строчке вашей программы(хоть и много раз).");
        System.out.println(" Введите три числа");
        int num12 = scanner.nextInt();
        int num22 = scanner.nextInt();
        int num32 = scanner.nextInt();
        double result2 = Math.pow(Math.pow(num12, num22), num32);
        System.out.println(result2);

        System.out.println("// 4. Пользователь вводит, две строки. Найти разницу в длине.");
        System.out.println("Введите две строки");
        ArrayList<String> StrArray = new ArrayList<String>();

        String str1 = scanner.nextLine();
        System.out.println(str1);
        StrArray.add(str1);

        String str2 = scanner.nextLine();
        System.out.println(str2);
        StrArray.add(str2);

        int largeString = StrArray.get(0).length();
        int shortString = StrArray.get(0).length();

        int strMax = 0;
        int strMin = 0;
        for (int i = 0; i < StrArray.size(); i++) {
            if (StrArray.get(i).length() > largeString) {
                largeString = StrArray.get(i).length();
                strMax = i;
            }
        }
        for (int y1 = 0; y1 < StrArray.size(); y1++) {
            if (StrArray.get(y1).length() < shortString) {
                shortString = StrArray.get(y1).length();
                strMin = y1;
            }
        }
        System.out.println( "Длинная строка - " + StrArray.get(strMax) + " Длина " + largeString);
        System.out.println( "Короткая строка - " + StrArray.get(strMin) + " Длина " + shortString);
        System.out.println("Разница в длине составляет " + ( largeString - shortString) + "\n");

        System.out.println(" 5. Пользователь вводит три строки. Найти разницу в длине самой короткой" +
                "и самой длинной.");
        System.out.println("Введите три строки");
        ArrayList<String> StrArray2 = new ArrayList<String>();
        String str12 = scanner.nextLine();
        StrArray2.add(str12);
        String str22 = scanner.nextLine();
        StrArray2.add(str22);
        String str32 = scanner.nextLine();
        StrArray2.add(str32);
        int largeString2 = StrArray2.get(0).length();
        int shortString2 = StrArray2.get(0).length();
        int strMax2 = 0;
        int strMin2 = 0;
        for (int i2 = 0; i2 < StrArray2.size(); i2++) {
            if (StrArray2.get(i2).length() > largeString2) {
                largeString2 = StrArray2.get(i2).length();
                strMax2 = i2;
            }
        }
        for (int y2 = 0; y2 < StrArray2.size(); y2++) {
            if (StrArray2.get(y2).length() < shortString2) {
                shortString2 = StrArray2.get(y2).length();
                strMin2 = y2;
            }
        }
        System.out.println( "Длинная строка - " + StrArray2.get(strMax2) + " Длина " + largeString2);
        System.out.println( "Короткая строка - " + StrArray2.get(strMin2) + " Длина " + shortString2);
        System.out.println("Разница в длине составляет " + ( largeString - shortString) + "\n");

        System.out.println(" 6. Пользователь вводит три строки. Найти разницу в длине самой короткой" +
                "и самой длинной без < и > .");
        System.out.println("Введите три строки");
        String str14 = scanner.nextLine();
        String str24 = scanner.nextLine();
        String str34 = scanner.nextLine();
        String[] names = {str14, str24, str34};
        String maxString = String.valueOf(Arrays.stream(names).max(Comparator.comparing(String::length)));
        String minString = String.valueOf(Arrays.stream(names).min(Comparator.comparing(String::length)));
        System.out.println("Длинная строка " + (maxString));
        System.out.println("Короткая строка " + minString);
        System.out.println((findLongString(names).length()) - (findShortString(names).length()) + " Это разница длины строк\n");


        System.out.println("// 7. Сделать калькулятор для трех чисел: пользователь вводит первое, потом \n" +
                "оператор, второе, оператор, третье. Посчитать первое на второе, потом" +
                "результат с третьим. Пример");
        int value = scanner.nextInt();
        Random rand = new Random();
        int value1 = rand.nextInt(4);
        int value2 = rand.nextInt(20);
        System.out.println("Пользоватль -> " + value);
        System.out.println("Оператор1 -> " + value1);
        System.out.println("Оператор2 -> " + value2);
        System.out.println((value + value1) * value2);

        System.out.println(" //8. Решить предыдущую задачу, но операции считать по приоритету " +
      "  умножение и деление выше сложения вычитания. Предыдущий пример даст " +
       " ответ 11 + 80 равно 91");
        int value11 = scanner.nextInt();
        Random rand2 = new Random();
        int value12 = rand2.nextInt(4);
        int value22 = rand2.nextInt(20);
        System.out.println("Пользоватль -> " + value11);
        System.out.println("Оператор1 -> " + value12);
        System.out.println("Оператор2 -> " + value22);



        System.out.println(" // 9. Вывести английский алфавит");
        int letterCodeStart = 97;
        int count = 0;
        for (int i = 97; i < 123; i++) {
            char letterStart = (char) letterCodeStart++;
            count++;
            System.out.println("Алфавит: буква " + count + " char " + letterCodeStart + " соответствует " + letterStart);
        }


        System.out.println(" // 11. Вывести случайную букву английского алфавита.");
        Random random = new Random();
        int intStartCode = 99;
        int intEndCode = 123;
        int randomNumber = random.nextInt(intStartCode, intEndCode);
            char letterStartC = (char) randomNumber;
            System.out.println("Случайная буква " + letterStartC);

        System.out.println("// 12. Вывести случайное число");
        int rand1 = rand.nextInt(11,22);
        System.out.println(rand1);
    }

    public static String findLongString(String[] names) {
        return Arrays.stream(names).max(Comparator.comparing(String::length)).get();
    }

    public static String findShortString(String[] names) {
        return Arrays.stream(names).min(Comparator.comparing(String::length)).get();
    }
}