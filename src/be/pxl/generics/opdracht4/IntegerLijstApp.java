package be.pxl.generics.opdracht4;

public class IntegerLijstApp {

    public static void main(String[] args){

        IntegerLijst stringLijst = new IntegerLijst();
        stringLijst.maakLijst("abc");
        stringLijst.printLijst();

        System.out.println();

        IntegerLijst lijstToBeReversed = new IntegerLijst();
        lijstToBeReversed.maakLangeLijst("abc", "def", "ghi", "jkl");
        lijstToBeReversed.printLijst();
        System.out.println();
        lijstToBeReversed.reverseList();
    }
}
