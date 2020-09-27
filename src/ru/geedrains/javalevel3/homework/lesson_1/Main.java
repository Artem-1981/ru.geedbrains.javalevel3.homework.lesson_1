package ru.geedrains.javalevel3.homework.lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //1.Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    private static void replace(Object[] arr, int index1, int index2) {
        Object buf = arr[index1];
        arr[index1] = arr [index2];
        arr[index2] = buf;
    }

    //Написать метод, который преобразует массив в ArrayList;
    private static <T>ArrayList<T> toArrayList(T[] arr){
        return new ArrayList<T>(Arrays.asList(arr));
    }
    public static void main(String[] args) {
        // write your code here
        Integer[] mymass= new Integer[10];
        for(int i=0;i<mymass.length;i++)
            mymass[i]=i;
        System.out.println(Arrays.toString(mymass));
        replace(mymass,3,4);
        System.out.println(Arrays.toString(mymass));

        ArrayList<Integer> mylist =toArrayList(mymass);

        Apple a1=new Apple();
        Apple a2=new Apple();
        Apple a3=new Apple();

        Orange o1 = new Orange();
        Orange o2= new Orange();

        Box<Apple> box1 = new Box<Apple>();
        Box<Orange> box2 = new Box<Orange>();

        box1.putbox(a1);
        box1.putbox(a2);
        box1.putbox(a3);

    }
}