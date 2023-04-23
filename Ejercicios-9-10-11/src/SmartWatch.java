public class SmartWatch extends SmartDevice{

    Boolean correaCuero;

    Boolean frecuenciaCardiaca;

    public SmartWatch(){
    }

    public SmartWatch(Boolean correaCuero, Boolean frecuenciaCardiaca){

        this.correaCuero = correaCuero;
        this.frecuenciaCardiaca = frecuenciaCardiaca;

    }

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
