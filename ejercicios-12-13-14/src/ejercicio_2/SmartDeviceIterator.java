package ejercicio_2;

//Esta interface tiene en ella las funciones del patron iterator que utilizaremos para recorrer el array
public interface SmartDeviceIterator {

    boolean haymas();

    void reinicia();

    SmartDevice siguiente();
}
