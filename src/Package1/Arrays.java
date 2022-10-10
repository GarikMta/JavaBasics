package Package1;

public class Arrays {
    public static void main(String[] args) {
        //String name1
        //String name2 - they go to one array
        String[] names;//Массив - объект со множеством ячеек, в каждую можем положить значения одного типа
        names = new String[3];//long version

        String[] name = new String[3];//short version

        name[0] = "Bonney"; //индексация начинается с 0 (это индекс), элементы массива
        name[1] = "and";
        name[2] = "Klyde";

        System.out.println(name[0]);
        System.out.println(name[2]);

        int [] arr = new int[10];
        arr[3] = 15;
        arr[3] = 10;// we can rewrite
        System.out.println(arr[3]);

        int[] array = {15, 10, 100, 9, 44};// сразу описываем массив значениями
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println();
        for (int i = 0; i < 5; i++){
            System.out.println(array[i]);//5 раз выведем на экран элементы 0-4
        }
        int[] arr2 = new int[15];// new array
        System.out.println();
        for (int j = 0; j < 15; j++){  // cycle to count
            arr2[j] = j * 10; //filling in
            System.out.println(arr2[j]);
        }
        System.out.println();
        System.out.println(arr2.length);//размер массива
        System.out.println(arr2[arr2.length - 1]);//последний элемент




    }
}
