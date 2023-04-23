public class SmartDeviceMain {

    public static void main(String[] args) {

        /*SmartDevice obj1 = new SmartDevice();
        SmartDevice obj2 = new SmartDevice("Samsung","Negro",120.0,150.2,52.3);
        System.out.println(obj1 + "\n" + obj2);
        System.out.println();

        SmartPhone obj3 = new SmartPhone(false,false);
        SmartPhone obj4 = new SmartPhone("Apple","Blanco",115.2,130.6,45.9,true,false);
        System.out.println(obj3 + "\n" + obj4);
        System.out.println();

        SmartWatch obj5 = new SmartWatch(true,true);
        SmartWatch obj6 = new SmartWatch("Huawei","Azul",105.2,160.6,47.9,false,true);
        System.out.println(obj5 + "\n" + obj6);
        System.out.println();

        SmartDevice obj7 = new SmartPhone("LG","Rojo",145.2,110.6,45.5,false,false);
        SmartDevice obj8 = new SmartWatch("Huawei","Azul",105.2,160.6,47.9,true,true);
        System.out.println(obj7 + "\n" + obj8);*/


        //Aqui utilizamos el patron Iterator
        System.out.println("Aqui utilizamos el patron Iterator");

        SmartDevices smartDevices = new SmartDevices();

        smartDevices.crear(new SmartDevice("Samsung","Negro",120.0,150.2,52.3));
        smartDevices.crear(new SmartPhone("Apple","Blanco",115.2,130.6,45.9,true,false));
        smartDevices.crear(new SmartWatch("Huawei","Azul",105.2,160.6,47.9,false,true));
        smartDevices.crear(new SmartPhone("LG","Rojo",145.2,110.6,45.5,false,false));


        System.out.println("haymas() + siguiente():");
        while (smartDevices.haymas()){
            SmartDevice smartDevice = smartDevices.siguiente();
            System.out.println("smartDevice es: " + smartDevice.toString());
        }

        System.out.println("crear() + siguiente():");
        smartDevices.crear(new SmartDevice("LG","Negro",145.2,110.6,45.5));
        SmartDevice smartDevice = smartDevices.siguiente();
        System.out.println("smartDevice es: " + smartDevice.toString());

        System.out.println("reinicia() + haymas():");
        smartDevices.reinicia();

        while (smartDevices.haymas()){
            smartDevice = smartDevices.siguiente();
            System.out.println("smartDevice es: " + smartDevice.toString());
        }







    }
}
