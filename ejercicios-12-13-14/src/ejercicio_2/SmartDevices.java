package ejercicio_2;

import java.util.ArrayList;

/**
 * Esta es la clase que implementa las funciones de la interfaz SmartDeviceIterator
 */
public class SmartDevices implements SmartDeviceIterator {

    private ArrayList<SmartDevice> smartDevices = new ArrayList<>();
    private int posicion = 0;

    public void crear(SmartDevice smartDevice) {
        smartDevices.add(smartDevice);

    }

    @Override
    public boolean haymas() {
        return posicion < smartDevices.size();
    }

    @Override
    public void reinicia() {
        posicion = 0;
    }

    @Override
    public SmartDevice siguiente() {
        SmartDevice smartDevice = smartDevices.get(posicion);
        posicion = posicion + 1;
        return smartDevice;
    }
}