package ejercicio_2;

/**
 * Esta es una clase que extiende la clase SmartDevice y que le añade dos propiedades mas
 */
public class SmartPhone extends SmartDevice{

    Boolean tarjetaSD;
    Boolean camara;

    public SmartPhone(){
    }

    public SmartPhone(Boolean tarjetaSD, Boolean camara){

        this.tarjetaSD = tarjetaSD;
        this.camara = camara;
    }

    /**
     * Estas son las propiedades que tiene el objeto SmartPhone
     * @param fabricante
     * @param color
     * @param peso
     * @param altura
     * @param ancho
     * @param tarjetaSD
     * @param camara
     */
    public SmartPhone(String fabricante, String color, Double peso, Double altura, Double ancho, Boolean tarjetaSD, Boolean camara){

        super(fabricante, color, peso, altura, ancho);
        this.tarjetaSD = tarjetaSD;
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tarjetaSD=" + tarjetaSD +
                ", camara=" + camara +
                ", fabricante='" + fabricante + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", ancho=" + ancho +
                '}';
    }
}
