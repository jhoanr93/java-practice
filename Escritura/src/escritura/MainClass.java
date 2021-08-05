package escritura;

import java.io.*;

public class MainClass {

    public static void main(String[] args) {

        File archivo = null;
        FileWriter escritura = null;
        FileReader leer = null;
        archivo = new File("C:\\Cursos\\Spring\\archivoESC.txt");

        ManejoArchivos prueba = new ManejoArchivos(archivo);
        ManejoArchivos esc = new ManejoArchivos(escritura);

        try {
            escritura = new FileWriter(archivo);
            leer = new FileReader(archivo);
            esc.escribir("Hola mundo", escritura);            
            prueba.leer(leer, archivo);

        } catch (Exception e) {
        }
    }
}
