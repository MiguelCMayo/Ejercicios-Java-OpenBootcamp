package ejercicio_2;

/**
 * Esta clase crea un objeto con las propiedades basicas que tendran los SmartPhones y SmartWatchs
 */
public class SmartDevice {

    String fabricante;
    String color;
    Double peso;
    Double altura;
    Double ancho;

    public SmartDevice(){

    }

    /**
     * Estas son las propiedades que tiene el objeto SmartDevice
     * @param fabricante
     * @param color
     * @param peso
     * @param altura
     * @param ancho
     */
    public SmartDevice(String fabricante, String color, Double peso, Double altura, Double ancho){

        this.fabricante = fabricante;
        this.color = color;
        this.peso = peso;
        this.altura = altura;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "fabricante='" + fabricante + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", ancho=" + ancho +
                '}';
    }

    public String getFabricante() {
        return fabricante;
    }
}
