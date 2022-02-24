package ruletaedd;
import java.io.*;

public class leerTXT {
    
    static String leerArchivo(String ruta) throws IOException {

        FileReader Fr = new FileReader("Estudiantes.txt");
        BufferedReader Br = new BufferedReader(Fr);

        String linea;
        linea = Br.readLine();//Método readLine que permite leer linealmente el archivo.
        String datos = linea;
        while ((linea = Br.readLine()) != null) {
            datos += "\n" + linea;
        }
        return datos;
    }
     
    static void escribirArchivo( String Msg, String Dato) throws IOException {
       
        FileWriter archivo = new FileWriter("Derrotados.txt", true);
        try (PrintWriter pw = new PrintWriter(archivo)) {
            pw.println(Dato);
            pw.println(Msg);
            pw.close();
        }
    }
}
