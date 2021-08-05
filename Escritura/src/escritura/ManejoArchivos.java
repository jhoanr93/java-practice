package escritura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos {

    private File archivo;
    private FileWriter escribir;
    private FileReader leer;
    private String mensaje;

    public ManejoArchivos(File archivo) {
        this.archivo = archivo;
    }
    
    public ManejoArchivos(FileWriter escribir) {
        this.escribir = escribir;
    }

    public void escribir(String mensaje, FileWriter escribir) {

        try {
            PrintWriter pw = null;
            pw = new PrintWriter(escribir);
            pw.println(mensaje);
            escribir.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void leer(FileReader leer, File archivo) throws FileNotFoundException, IOException {

        BufferedReader br = null;

        leer = new FileReader(archivo);
        br = new BufferedReader(leer);

        String linea;
        while ((linea = br.readLine()) != null) {

            System.out.println(linea);
        }
    }

}
