package analizaodres;
import java.io.*;
public class Analizaodres {
    public static String lectura(){
    String texto = "";
    FileReader archivo = null;
    String linea = "";
    try {
      archivo = new FileReader("E:\\fuente.txt");
      BufferedReader lector = new BufferedReader(archivo);
      while ((linea = lector.readLine()) != null) {
        texto += linea + "\n";
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException("Archivo no encontrado");
    } catch (IOException e) {
      throw new RuntimeException("Ocurrio un error de entrada/salida");
    } finally {
      if (archivo != null) {
        try {
          archivo.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return texto;
  }
    public static void main(String[] args) {
        System.out.println(lectura());
    }
}