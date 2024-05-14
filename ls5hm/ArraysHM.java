package org.example.lesson5.ls5hm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysHM {
    //    1. Напишите метод, который принимает список целых и возвращает список только из четных:
//    {1,2,6,8,15,3} -> {2,6,8}
    public static List<Integer> even(List<Integer> a) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer i : a) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }

        return evenNumbers;
    }

    //
//    2. Напишите функцию, возвращающую второй по величине элемент списка целых.
//    Например, {1,3,4,2} -> 3
    public static Integer secondBiggerNum(List<Integer> a) {
        if (a.size() < 2) {
            throw new IndexOutOfBoundsException();
        }

        Collections.sort(a);

        return a.get(a.size() - 2);
    }

    //    3. Напишите функцию, меняющую порядок следования элементов в списке на противоположный
//    например, {1,2,3} -> {3,2,1}
    public static List<Integer> reverse(List<Integer> a) {
        List<Integer> c = new ArrayList<>();
        int size = a.size();
        for (int i = size - 1; i >= 0; i--) {
            c.add(a.get(i));
        }

        return c;
    }

//    4. Напишите функцию, удаляющие дубликаты из передаваемого в нее списка строк.
//            Например {"Dima", "Sam", "Dima", "Alina"} -> {"Alina", "Dima", "Sam"}
    public static List<String> deleteDuplicate(List<String> a){
        List<String> b = new ArrayList<>();
        for (String i: a){
            if (!b.contains(i)){
                b.add(i);
            }
        }

        return b;
    }


    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(
                Arrays.asList(1, 2, 6, 8, 15, 3)
        );
        System.out.println("Напишите метод, который принимает список целых и возвращает список только из четных:");
        System.out.println(num + " -> " + even(num));
        System.out.println("----------------------------------------------------------------------------------------");

        List<Integer> num2 = new ArrayList<>(
                Arrays.asList(1, 3, 4, 2)
        );
        System.out.println("Напишите функцию, возвращающую второй по величине элемент списка целых:");
        System.out.println(num2 + " -> " + secondBiggerNum(num2));
        System.out.println("----------------------------------------------------------------------------------------");

        List<Integer> num3 = new ArrayList<>(
                Arrays.asList(1, 2, 3)
        );
        System.out.println("Напишите функцию, меняющую порядок следования элементов в списке на противоположный:");
        System.out.println(num3 + " -> " + reverse(num3));
        System.out.println("----------------------------------------------------------------------------------------");

        List<String> str = new ArrayList<>(
                Arrays.asList("Dima", "Sam", "Dima", "Alina")
        );
        System.out.println("Напишите функцию, удаляющие дубликаты из передаваемого в нее списка строк:");
        System.out.println(str + " -> " + deleteDuplicate(str));
    }
}
