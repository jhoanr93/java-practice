package archivos;

import java.io.*;
import java.util.*;

public class Archivos {

    public static void main(String[] args) {
        // TODO code application logic here

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        char arrayCaracteres[] = {'a', 'e', 'i', 'o', 'u'};
        List<String> nombres = new ArrayList<>();

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            //archivo = new File("C:\\archivo.txt");
            archivo = new File("C:\\Cursos\\Spring\\archivo.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            //Creacion de ArrayList que guarda los strings
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {

                nombres.add(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        int j = 0;

        System.out.println("->" + nombres.size());

        for (int i = 0; i < nombres.size(); i++) {

            for (j = 0; j < nombres.get(i).length(); j++) {

                switch (nombres.get(i).charAt(j)) {
                    case 'a':
                        contA++;
                        break;
                    //System.out.println("->"+ nombres.get(i).charAt(j));
                    case 'e':
                        contE++;
                        break;
                    case 'i':
                        contI++;
                        break;
                    case 'o':
                        contO++;
                        break;
                    case 'u':
                        contU++;
                        break;
                    default:
                        break;
                }

            }
            System.out.println("Nombre posicion #: " + i);
            j = 0;
            System.out.println("Cantidad A: " + contA);
            System.out.println("Cantidad E: " + contE);
            System.out.println("Cantidad I: " + contI);
            System.out.println("Cantidad O: " + contO);
            System.out.println("Cantidad U: " + contU);
            contA = 0;
            contE = 0;
            contI = 0;
            contO = 0;
            contU = 0;
        }

    }

}
