import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Principal {

    public static void main(String[] args) {
        
        File archivo = new File("C:\\Users\\Scast\\OneDrive\\Documentos\\prueba");
        archivo.mkdir();
        try {
            archivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File archivo2 = new File("C:\\Users\\Scast\\OneDrive\\Documentos\\prueba\\prueba.txt");
        try {
            archivo2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter escritor = new FileWriter(archivo2, true)) {
            escritor.write("Hola mundo");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }

    }
}