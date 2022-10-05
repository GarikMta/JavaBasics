package Package1;

public class Variables {
    public static void main(String[] args) {
        byte a = 5; // -128 127 - 8 бит
        short b = -100; // -32768 32767 - 16 бит
        int c = 1000000;//-2,147,483,647 to 2,147,483,647 - 32 бита
        long d = -122335544;//-2 в степени 63 and a maximum value of 2 в степени 63-1 - 64 бита

        System.out.println(a);//целочисленные типы
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        //вещественные типы
        double double1 = 133.155;//64 бита плав точка(до 15 десятичных цифр)
        System.out.println();
        System.out.println("double double1: " +double1);
        float float1 = 150.32f;//32 бита плав точка(6-7 десят цифр)
        System.out.println(float1);

        System.out.println();
        boolean boolean1 = true;//условный тип
        boolean boolean2 = false;

        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println();
        System.out.println(boolean3);
        System.out.println(boolean4);

        String str = "Hello";//строки
        String str1 = "World";
        String str2 = str + " " + str1;
        System.out.println();
        System.out.println(str2);

        char char1 = 'q';//тип на 1 символ, кавычки одинарные. 16 бит unicode, 0-65535
        System.out.println(char1);

        String personName = "Ingvarr I";
        int age = 50;

        System.out.println(personName);
        System.out.println(age);
        //Названия переменных начинаются с большой буквы, в отличие от названий классов??
        //если в названии переменной несколько слов - первое с маленькой, остальные с большой
        //переменные лучше называть со смыслом, информативно
    }
}
