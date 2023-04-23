public class DemoHolaAdios {
    public static void main(String[] args) {

        //cambiando el nombre de los argumentos saldra uno u otro (arriba a la derecha en edit configuration)
        if (args[0].equalsIgnoreCase("uno")){
            System.out.println("hola");
        }else if(args[0].equalsIgnoreCase("dos")){
            System.out.println("adios");
        }
    }
}
