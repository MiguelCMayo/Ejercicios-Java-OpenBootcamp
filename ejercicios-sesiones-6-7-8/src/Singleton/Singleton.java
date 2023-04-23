package Singleton;

public class Singleton {

    private static Singleton instance;
    int contador;

    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    public int getContador(){
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
