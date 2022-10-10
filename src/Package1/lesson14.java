package Package1;

import java.sql.SQLOutput;

public class lesson14 {
    public static void main(String[] args) {
        int a;//инициализация
        a = 10;//присваивание
        a = 20;
        System.out.println(a);

        int b = a;//значение одной переменой присваиванием другой
        System.out.println(b);
        int c, d;
        c = d = b;//присваивание одновременно нескольким
        System.out.println(c + " " + d);

        a = 13;
        b = 5;
        System.out.println();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);//выводит целое, т.к. делим целые

        double e = 15;
        double f = 7;
        System.out.println(e / f);//будет вещ, т.к. делим вещ
        System.out.println(a % b);// остаток от деления

        a = b + c * d;
        System.out.println(a);
        a = (b + c) * d;
        System.out.println(a);

        a = 15;
        b = 10;
        System.out.println();
        System.out.println(a>b);//сравнения возвращают булеан
        System.out.println(a<b);
        System.out.println(a - 5 >=b);
        System.out.println(a - 5 <=b);
        System.out.println(a == b);// равно? сравнение на равенство. С одним = это присваивание
        System.out.println(a != b); // не равно? сравнение на не равенство
        System.out.println(a + 10 <= b + 15);//сначала арифметика, потом сравнение
        System.out.println(!(a + 10 <= b + 15));
        System.out.println(!(false));//операция отрицания, инвертируем

        int i = 0;
        i++;// i = i + 1; инкремент
        System.out.println();
        System.out.println(i);
        i--;// i = i - 1; декремент
        System.out.println(i);

        i = 5;
        System.out.println(i++);// постфиксная форма записи, сначала и, затем плюсует
        System.out.println(i);//на самом деле и уже 6
        i = 3;
        a = i++;
        System.out.println(a);
        i = 3;
        a = ++i;//префиксная запись инкремента, сначала плюсует
        System.out.println(a);

        a = 10;
        b = 20;
        System.out.println();//boolean type
        System.out.println(a > b || a < b);// || = OR если хотя бы одно верно, то все верно
        System.out.println(a > b || b > 30);
        System.out.println(a > b && a < b);// && = AND для верно обе части должны быть верны
        System.out.println(a > 9 && b == 20);

        System.out.println(!(a + 10 > 15 || b - 5 > 10 && a < b));//сначала арифм, затем >, AND goes before OR
        System.out.println(!((a + 10 > 15 || b - 5 > 10) && a < b));//скобки
        System.out.println();

        a = 9;
        System.out.println(Math.sqrt(a));//Math - это класс, sqrt - название функции
        System.out.println(Math.pow(a, 3));//возведение в степень

        a = 10;
        a = a + 5;
        System.out.println(a);
        a = 10;//комбинированные операции, сразу присваиваем новое значение
        a += 5;// a = a + 5
        System.out.println(a);
        a -= 5;// a = a - 5
        System.out.println(a);
        a *= 2;// a = a * 2
        System.out.println(a);
        a /= 2;// a = a / 2
        System.out.println(a);
        a %= 3;// a = a % 3 остаток от деления
        System.out.println(a);
















    }
}
