
package traductor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Romilio
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Interfaz i = new Interfaz();
        i.show();
//        try{
//            crea();
//        }
//        catch(Exception e){ System.out.println("Error");}

        
    }
    
    public static void crearLexico() throws IOException, Exception{
        
        
}
public static void crea() throws IOException, Exception
{

    File file= new File("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Lexico\\Lex.flex");
        JFlex.Main.generate(file);
        Path temp = Files.move(Paths.get("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Lexico\\Lexico.java"),
        Paths.get("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Clases\\Lexico.java"));
        if(temp != null)
        {
            System.out.println("File renamed and moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
    String[] asintactico = {"-parser", "Sintactico", "C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Sintactico\\parser.cup"};
    java_cup.Main.main(asintactico);
    Files.move(
        Paths.get("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\Sintactico.java"),
        Paths.get("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Clases\\Sintactico.java")
    );
    Files.move(
        Paths.get("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\sym.java"),
        Paths.get("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Clases\\sym.java")
    );
}
    
}
