package be.pxl.generics.opdracht4;

import java.util.ArrayList;

public class IntegerLijst<T extends Comparable> {

    private static ArrayList<Integer> integerLijst;
    private  ArrayList<T> lijst;



    public IntegerLijst(){
        integerLijst = new ArrayList<>();
        lijst = new ArrayList<>();
    }
    public static ArrayList<Integer> maakIntegerLijst(int getal){
        ArrayList<Integer> integerLijst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integerLijst.add(getal);
        }
        return integerLijst;
    }

    public static void printIntegerLijst(ArrayList<Integer> integerLijst){
        for (int i : integerLijst
             ) {
            System.out.println(i);
        }
    }

    public void maakLijst(T object){
        for (int i = 0; i < 10; i++) {
            lijst.add(object);
        }
    }

    public void printLijst(){
        for (T object: lijst
             ) {
            System.out.print(object + " ");
        }
    }

    public void maakLangeLijst(T object1, T object2, T object3, T object4){
            lijst.add(object1);
            lijst.add(object2);
            lijst.add(object3);
            lijst.add(object4);
    }


    // Uitbreiding 1
    public void reverseList(){
        for (int i = lijst.size(); i > 0; i--) {
            System.out.print(lijst.get(i-1) + " ");
        }
    }

}
