package it.figuccia;
import java.util.*;

public class Start {
    public static void main(String[] args) {
        String[] aliceToDos = new String[]{"Coding", "Reading", "Learning"};
        String[] bobToDos = new String[]{"Reading", "Coding", "Learning", "Sleeping"};
        String[] timToDos = new String[]{"Reading", "Learning", "Coding"};

        System.out.println("Is Alice's array equal to Bob array? " + aliceToDos.equals(bobToDos));
        System.out.println("Is Alice's array equal to Tim array? " + aliceToDos.equals(timToDos));
        System.out.println("Is Alice's array having the same length of Bob's array? " + (aliceToDos.length == bobToDos.length));
        System.out.println("Is Alice's array having the same length of Tim's array? " + (aliceToDos.length == timToDos.length));
        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);
        System.out.println("Is Alice having the same tasks of Bob? " + (Arrays.compare(aliceToDos, bobToDos)==0));
        System.out.println("Is Alice having the same tasks of Tim? " + (Arrays.compare(aliceToDos, timToDos)==0));
    }
}
