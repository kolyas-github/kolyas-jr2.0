package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int digit = Integer.parseInt(reader.readLine());
        if (digit == 1) System.out.println("понедельник");
        if (digit == 2) System.out.println("вторник");
        if (digit == 3) System.out.println("среда");
        if (digit == 4) System.out.println("четверг");
        if (digit == 5) System.out.println("пятница");
        if (digit == 6) System.out.println("суббота");
        if (digit == 7) System.out.println("воскресенье");
        if ((digit < 1) | (digit > 7)) System.out.println("такого дня недели не существует");
    }

}