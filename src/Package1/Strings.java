package Package1;

public class Strings {
    public static void main(String[] args) {
        String s = "Hello world!";
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
        System.out.println(s.contains("Hello"));
        System.out.println(s.contains("text"));

        System.out.println();
        System.out.println(s.length());
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





    }
}
