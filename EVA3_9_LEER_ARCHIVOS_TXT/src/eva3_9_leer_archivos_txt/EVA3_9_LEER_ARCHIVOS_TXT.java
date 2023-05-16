/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_9_leer_archivos_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author invitado
 */
public class EVA3_9_LEER_ARCHIVOS_TXT {
    private static Path Paths;

    final static String Ruta="C:\\archivos\\doc.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try {
            readUsingFiles(Ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    Files lee todo el archivo y lo transfiere a la memoria principal
//    util archivos pequeños
    public static void readUsingFiles(String ruta) throws IOException{
        Path path=Paths.get(ruta);
        
        byte[] bytes=Files.readAllBytes(path);
        System.out.println(new String(bytes));
        
//        List<String> todasLasLineas=Files.readAllLines(path);
//        todasLasLineas.
//                
//        System.out.println("Resultado:");
//        System.out.println(todasLasLineas);
        
    }
    
}
