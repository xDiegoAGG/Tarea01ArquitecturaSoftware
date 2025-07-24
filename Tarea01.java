import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Tarea01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File archivo = new File("Tutorial01.txt");
        PrintWriter output = null;
        
        System.out.print("Hola, Bienvenido a nuestro Tutorial 01 - Arquitectura de Software\nPor favor ingresa tu nombre: ");
        String nombre = scan.nextLine();

        try {
            output = new PrintWriter(archivo);
            output.println(nombre);
            System.out.println("Se ha guardado correctamente el nombre " + nombre + " en el archivo .txt");
        } catch (FileNotFoundException e){
            System.out.println("Ha ocurrido un error y no hemos podido guardar tu nombre.");
        } finally {
            if (output != null){
                output.close();
            }
        }
    }
}
