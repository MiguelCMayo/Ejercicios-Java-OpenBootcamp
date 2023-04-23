public class Main {
    public static void main(String[] args) {

        System.out.println("parametros recibidos: " + args.length);

        for(String arg: args){
            System.out.println("Argumneto es: " + arg);
        }

        for (int i = 0; i< args.length; i++){
            System.out.println("Argumento recibido " + args[i] + " esta en la posicion: " + i);
        }
    }
}