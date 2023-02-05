
import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner; //Import the scanner to read the file
import java.util.ArrayList; //Import Arraylist
import java.awt.Desktop;
public class archivo {
    private ArrayList<String> lineas;
    private String path;
    private File archivito;
    public archivo()
    {
        lineas = new ArrayList<String>();
        path="";

    }
  public void create_file() {
    try {
      archivito = new File("numeros_3000.txt");
      if (archivito.createNewFile()) {
        System.out.println("File created: " + archivito.getName());
        String path=archivito.getAbsolutePath();
      } else {
        Desktop.getDesktop().open(archivito);
        System.out.println("Archivo ya existe y por lo tanto procede a abrirse");
        String path=archivito.getAbsolutePath();
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public void write_file(String texto) {
    try {
      FileWriter myWriter = new FileWriter("numeros_3000.txt");
      myWriter.write(texto);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("Ocurrio un error en la escritura, porfavor volver a intentarlo");
      e.printStackTrace();
    }
  }
  public void read_file() {
    File file = new File(path);
        try {
            Scanner obj = new Scanner(file);
            while (obj.hasNextLine()){
                String linea=obj.nextLine();
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
  }

}
