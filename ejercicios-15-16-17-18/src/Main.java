import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {


        //Ejemplo: ArithmeticException
        try {
            int number1 = 5;
            int number2 = 0;
            int resultado = number1 / number2;

            System.out.println(resultado);
        }
        catch( ArithmeticException e ) {
            System.out.println(e + "\n" + "No se puede dividir entre cero" + "\n");
        }



        // Ejemplo: ArrayIndexOutOfBoundsException
        try {
            int array[] = new int[] { 4, 1, 2, 6, 7, 4 };
            // accessing element at index 2
            System.out.println("El valor es: " + array[9]);

        }
        catch (Exception e) {
            System.out.println(e + "\n" + "No existe ese lugar en el array" + "\n");
        }


        // Ejemplo: FileNotFoundException
        try {
            FileInputStream fichero = new FileInputStream("ejemplo.txt");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

}

