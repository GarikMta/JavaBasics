package Package1;

public class Conditions {
    public static void main(String[] args) {
        int i = 15;
        System.out.println("Start of program");
        if (i>10) { //в круглых скобках булеан условие, если True - то идем дальше
            System.out.println("i>5");
            i++;
            System.out.println(i);
        }
        else {//делает, если условие не выполнено
            System.out.println("i<=5");
            i--;
            System.out.println(i);
        }
        System.out.println("End of program");

        i = 10;

        if (i>10) {
            System.out.println("i>5");
            i++;
            System.out.println(i);
        }
        else if (i<10 && i>5) {
            System.out.println("i<10 and i>5");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("Nothing");
        }

        i = 95;

        if (i>50) {
            System.out.println("i>50");
            if (i>90) {
                System.out.println("i>90");
            }
            else {
                System.out.println("i<=90");
            }
        }
        else {
            System.out.println("i<=50");
        }

        i = 5;

        switch (i) {//сравниваем чему равна переменная
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            default://типа else, можно не использовать
                System.out.println("I don't know the number");
        }
    }

}
