package Package1;

import org.w3c.dom.ls.LSOutput;

public class Strings {
    public static void main(String[] args) {
        String s = "Hello world!";//Методы для работы со строками. String - это класс
        System.out.println(s.equals("Hello world!"));
        System.out.println(s.equals("Hello"));

        String s2 = "Hello";
        System.out.println(s.equals(s2));

        s = "text";
        s2 = "TEXT";
        System.out.println();
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));

        System.out.println();
        s = "TeXt";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();
        System.out.println(s.charAt(1));//по индексу получить символ, 1й - 0, 2й -1
        System.out.println(s.indexOf("Xt"));//vice versa, what is the index

        s = "Hello, world!";
        System.out.println();
        System.out.println(s.contains("Hello"));//if there is such part
        System.out.println(s.contains("text"));

        System.out.println();
        System.out.println(s.length());//the total number of symbols
        System.out.println(s.startsWith("He"));
        System.out.println(s.startsWith("!"));
        System.out.println(s.endsWith("He"));
        System.out.println(s.endsWith("!"));

        s = "Hello,world";
        System.out.println();
        String[] array = s.split(",");
        System.out.println(array[0] + "!" + array[1] + "!");//1st element is with index 0
        System.out.println(array[0]);
        System.out.println(array[1]);

        String str = "My name is %s! I'm %d years old!";//%s - строка, $d - целое число
        int age = 30;
        String name = "Mike";
        System.out.println(String.format(str, name, age));
        System.out.println(String.format(str, "Ken", 10));

        System.out.println();
        String age2 = "33";
        int a = Integer.parseInt(age2);//извлечь из строки число
        System.out.println(a * 3);

        s = "Hello world";
        System.out.println();
        System.out.println(s.substring(1, 5));//выделить подстроку из строки по индексу
        System.out.println(s.substring(7));

        System.out.println(s.substring(7, s.length() - 2));

        System.out.println();
        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        String res;

        res = s1 + s2 + s3;
        System.out.println(res);//конкацинация строк - объединение
        res = s1.concat(s2).concat(s3);//the same, but faster
        System.out.println(res);












    }
}
