package kory.karl.reflection.task01;

//Do not change!
public class Utils {
    private int fieldToGet;

    public Utils(int fieldToGet) {
        this.fieldToGet = fieldToGet;
    }

    private int methodToInvoke(){
        return (int) Math.pow(fieldToGet, 2);
    }
}