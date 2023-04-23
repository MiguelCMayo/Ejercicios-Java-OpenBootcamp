package ejercicio_2;

/**
 * Esta es una clase que extiende la clase SmartDevice y que le añade dos propiedades mas
 */

public class SmartWatch extends SmartDevice{

    Boolean correaCuero;

    Boolean frecuenciaCardiaca;

    public SmartWatch(){
    }

    public SmartWatch(Boolean correaCuero, Boolean frecuenciaCardiaca){

        this.correaCuero = correaCuero;
        this.frecuenciaCardiaca = frecuenciaCardiaca;

    }

    /**
     * Estas son las propiedades que tiene el objeto SmartWatch
     * @param fabricante
     * @param color
     * @param peso
     * @param altura
     * @param ancho
     * @param correaCuero
     * @param frecuenciaCardiaca
     */
    public SmartWatch(String fabricante, String color, Double peso, Double altura, Double ancho, Boolean correaCuero, Boolean frecuenciaCardiaca){

        super(fabricante, color, peso, altura, ancho);
        this.correaCuero = correaCuero;
        this.frecuenciaCardiaca=frecuenciaCardiaca;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "correaCuero=" + correaCuero +
                ", frecuenciaCardiaca=" + frecuenciaCardiaca +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", ancho=" + ancho +
                '}';
    }
}
