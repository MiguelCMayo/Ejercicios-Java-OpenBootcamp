package ejercicio_2;

/**
 * Esta es la clase principal donde utilizaremos las demas clases y funciones
 */
public class SmartDeviceMain {

    public static void main(String[] args) {

        System.out.println("Aqui utilizamos el patron Iterator");

        SmartDevices smartDevices = new SmartDevices();

        //Aqui creamos varios objetos
        smartDevices.crear(new SmartDevice("Samsung","Negro",120.0,150.2,52.3));
        smartDevices.crear(new SmartPhone("Apple","Blanco",115.2,130.6,45.9,true,false));
        smartDevices.crear(new SmartWatch("Huawei","Azul",105.2,160.6,47.9,false,true));
        smartDevices.crear(new SmartPhone("LG","Rojo",145.2,110.6,45.5,false,false));

        //Aqui pedimos que nos muestre todos los objetos
        System.out.println("haymas() + siguiente():");
        while (smartDevices.haymas()){
            SmartDevice smartDevice = smartDevices.siguiente();
            System.out.println("smartDevice es: " + smartDevice.toString());
        }

        //Aqui creamos un nuevo objeto
        System.out.println("crear() + siguiente():");
        smartDevices.crear(new SmartDevice("LG","Negro",145.2,110.6,45.5));
        SmartDevice smartDevice = smartDevices.siguiente();
        System.out.println("smartDevice es: " + smartDevice.toString());

        //Aqui reiniciamos el recorrido del array y volvemos al principio
        System.out.println("reinicia() + haymas():");
        smartDevices.reinicia();

        //Aqui volvemos a recorrer el array y mostramos los objetos creados
        while (smartDevices.haymas()){
            smartDevice = smartDevices.siguiente();
            System.out.println("smartDevice es: " + smartDevice.toString());
        }







    }
}
