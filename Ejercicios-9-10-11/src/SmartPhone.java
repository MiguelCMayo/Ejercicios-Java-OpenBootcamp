/**
 *
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
