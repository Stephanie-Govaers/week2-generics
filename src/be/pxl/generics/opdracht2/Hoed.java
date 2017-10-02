package be.pxl.generics.opdracht2;

public class Hoed<T extends Dier> {

    private T dier;

    public Hoed(T dier){
        this.dier = dier;
    }

    public T kijk(){
        return dier;
    }
}
