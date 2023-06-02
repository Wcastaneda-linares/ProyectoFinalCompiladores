
package traductor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Romilio
 */
public class Traducir {
    Interfaz in=new Interfaz();
   public static String traducio="", afirmati="";
   
    public void tobeafirmacion(String palabra) throws IOException{
    String afir="";  
    String analizar[]=palabra.split(" "); 
    String linea;  
    String escribir="";
    BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Otros\\verbos.csv"));
    if(analizar[0].equals("i"))
    {
        while ((linea=reader.readLine()) !=null)
        {  
            String[] arreglo_datos = linea.split(";");
            if(analizar[2].equals(arreglo_datos[0]))
            {
                traducio="Yo "+arreglo_datos[1]+"\n";
                afirmati+=traducio;
            }
        }
    }
    
    if(analizar[0].equals("you"))
    {
        while ((linea=reader.readLine()) !=null)
        {  
            String[] arreglo_datos = linea.split(";");
            
            if(analizar[2].equals(arreglo_datos[0]))
            {
             //System.out.print("Tu "+arreglo_datos[2]+"\n");
             //in.TxtCod3.setText("tu "+arreglo_datos[2]+"\n");
             traducio="Tú "+arreglo_datos[5]+"\n";
             afirmati+=traducio;
            }
        }
    }
    
    if(analizar[0].equals("we"))
    {
        while ((linea=reader.readLine()) !=null)
        {  
            String[] arreglo_datos = linea.split(";");
            if(analizar[2].equals(arreglo_datos[0]))
            {
             //System.out.print("Nosotros "+arreglo_datos[3]+"\n");
                // in.TxtCod3.setText("Nosotros "+arreglo_datos[3]+"\n"); 
                 traducio="Nosotros "+arreglo_datos[2]+"\n";
                 afirmati+=traducio;
            }
        }
    }
    
    if(analizar[0].equals("they"))
    {
        while ((linea=reader.readLine()) !=null)
        {  
            String[] arreglo_datos = linea.split(";");
            if(analizar[2].equals(arreglo_datos[0]))
            {
             //System.out.print("Ellos "+arreglo_datos[3]+"\n");
                 //in.TxtCod3.setText("Ellos "+arreglo_datos[4]+"\n"); 
                 traducio="Ellos "+arreglo_datos[3]+"\n";
                 afirmati+=traducio;
            }
        }
    }
    
    if(analizar[0].equals("she"))
    {
        while ((linea=reader.readLine()) !=null)
        {  
            String[] arreglo_datos = linea.split(";");
            if(analizar[2].equals(arreglo_datos[0]))
            {
           //  System.out.print("Ella "+arreglo_datos[4]+"\n");
                 //in.TxtCod3.setText("Ella "+arreglo_datos[5]+"\n");
                 traducio="Ella "+arreglo_datos[4]+"\n";
                 afirmati+=traducio;
            }
        }
    }
    
    if(analizar[0].equals("he"))
    {
        while ((linea=reader.readLine()) !=null)
        {  
            String[] arreglo_datos = linea.split(";");
            if(analizar[2].equals(arreglo_datos[0]))
            {
            // System.out.print("El "+arreglo_datos[4]+"\n");
                 //in.TxtCod3.setText("El "+arreglo_datos[5]+"\n");
                 traducio="Él "+arreglo_datos[4]+"\n";
                 afirmati+=traducio;
            }
        }
    }
    
    if(analizar[0].equals("it"))
    {
        while ((linea=reader.readLine()) !=null)
        {  
            String[] arreglo_datos = linea.split(";");
            
            if(analizar[2].equals(arreglo_datos[0]))
            {
             //System.out.print("Esto "+arreglo_datos[4]+"\n");
                 //in.TxtCod3.setText("Esto "+arreglo_datos[5]+"\n");
                 traducio="Esto "+arreglo_datos[4]+"\n";
                 afirmati+=traducio;
            }
        }
    }
    }

    
//fin tobe afirmacionn
    
    
     public void tobenegacion(String palabra) throws IOException
     {
         String analizar[]=palabra.split(" "); 
         String linea, neg;  
         String escribir="";
         BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Otros\\verbos.csv"));
         if(analizar[0].equals("i"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[3].equals(arreglo_datos[0]))
                 { //System.out.print("Yo no "+arreglo_datos[1]+"\n");
                     neg="Yo no "+arreglo_datos[1]+"\n";
                     afirmati+=neg;
                 //in.TxtCod3.setText("Yo no "+arreglo_datos[1]+"\n");
                 }
             }
         }
         
         if(analizar[0].equals("you"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[3].equals(arreglo_datos[0]))
                 {//System.out.print("Tu no "+arreglo_datos[2]+"\n");
                     neg="Tú no "+arreglo_datos[5]+"\n";
                     afirmati+=neg;
// in.TxtCod3.setText("Tu no "+arreglo_datos[2]+"\n");
                 }
             }
         }
         
         if(analizar[0].equals("we"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[3].equals(arreglo_datos[0]))
                 {//in.TxtCod3.setText("Nosotros no "+arreglo_datos[3]+"\n");// System.out.print("Nosotros no "+arreglo_datos[3]+"\n");
                     neg="Nosotros no "+arreglo_datos[2]+"\n";
                     afirmati+=neg;
                 }
             }
         }
         
         if(analizar[0].equals("they"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[3].equals(arreglo_datos[0]))
                 { //in.TxtCod3.setText("Ellos no "+arreglo_datos[3]+"\n");
                     neg="Ellos no "+arreglo_datos[3]+"\n";
                     afirmati+=neg;
                     //System.out.print("Ellos no "+arreglo_datos[3]+"\n");
                 }
             }
         }
         
         if(analizar[0].equals("she"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[3].equals(arreglo_datos[0]))
                 {//in.TxtCod3.setText("Ella no "+arreglo_datos[5]+"\n");System.out.print("Ella no "+arreglo_datos[5]+"\n");
                     neg="Ella no "+arreglo_datos[4]+"\n";
                     afirmati+=neg;
                 }
             }
         }
         
         if(analizar[0].equals("he"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[3].equals(arreglo_datos[0]))
                 {//in.TxtCod3.setText("El no "+arreglo_datos[5]+"\n");// System.out.print("El no "+arreglo_datos[5]+"\n
                     neg="Él no "+arreglo_datos[4]+"\n";
                     afirmati+=neg;
                 }
             }
         }
         
         if(analizar[0].equals("it"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[3].equals(arreglo_datos[0]))
                 {//in.TxtCod3.setText("Esto no "+arreglo_datos[5]+"\n");// System.out.print("Esto no "+arreglo_datos[5]+"\n");
                     neg="Esto no "+arreglo_datos[4]+"\n";
                     afirmati+=neg;
                 }
             }
         }
     }//fin tobeneagacion 
     
     public void tobepregunta(String palabra) throws IOException
     {
         String qu="";
         String analizar[]=palabra.split(" "); 
         String linea;  
         String escribir="";
         BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Otros\\verbos.csv"));
         if(analizar[1].equals("i"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[2].equals(arreglo_datos[0]))
                 {//System.out.print("¿Yo "+arreglo_datos[1]+"?\n");
                     qu="¿Yo "+arreglo_datos[1]+"?\n";
                     afirmati+=qu;
// in.TxtCod3.setText("¿Yo "+arreglo_datos[1]+"?\n");
                 }
             }
         }
         
         if(analizar[1].equals("you"))
         {
             while ((linea=reader.readLine()) !=null)
             {
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[2].equals(arreglo_datos[0]))
                 {//in.TxtCod3.setText("¿Tu "+arreglo_datos[2]+"?\n");
                     qu="¿Tú "+arreglo_datos[2]+"?\n";
                     afirmati+=qu;
//System.out.print("¿Tu "+arreglo_datos[2]+"?\n");
                 }
             }
         }
         
         if(analizar[1].equals("we"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[2].equals(arreglo_datos[0]))
                 {//in.TxtCod3.setText("¿Nosotros "+arreglo_datos[3]+"?\n");//System.out.print("¿Nosotros "+arreglo_datos[3]+"?\n");
                     qu="¿Nosotros "+arreglo_datos[3]+"?\n";
                     afirmati+=qu;
                 }
             }
         }
         
         if(analizar[1].equals("they"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[2].equals(arreglo_datos[0]))
                 {//in.TxtCod3.setText("¿Ellos "+arreglo_datos[4]+"?\n");//System.out.print("¿Ellos "+arreglo_datos[4]+"?\n");
                     qu="¿Ellos "+arreglo_datos[4]+"?\n";
                     afirmati+=qu;
                 }
             }
         }
         
         if(analizar[1].equals("she"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[2].equals(arreglo_datos[0]))
                 {// in.TxtCod3.setText("¿Ella "+arreglo_datos[5]+"?\n");//System.out.print("¿Ella "+arreglo_datos[5]+"?\n");
                     qu="¿Ella "+arreglo_datos[5]+"?\n";
                     afirmati+=qu;
                 }
             }
         }
         
         if(analizar[1].equals("he"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[2].equals(arreglo_datos[0]))
                 {//in.TxtCod3.setText("¿El "+arreglo_datos[5]+"?\n");//System.out.print("¿El "+arreglo_datos[5]+"?\n");
                     qu="¿Él "+arreglo_datos[5]+"?\n";
                     afirmati+=qu;
                 }
             }
         }
         
         if(analizar[1].equals("it"))
         {
             while ((linea=reader.readLine()) !=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 
                 if(analizar[2].equals(arreglo_datos[0]))
                 { //System.out.print("¿Esto "+arreglo_datos[5]+"?\n");
                     qu="¿Esto "+arreglo_datos[5]+"?\n";
                     afirmati+=qu;
                 }
             }
         }
     }//fin tobepregunta 
     
     public void simpleafir(String palabra) throws IOException
     {
         String si=""; 
         String analizar[]=palabra.split(" "); 
         String linea;  
         String linea2;
         String escribir="";
         BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Otros\\verbos.csv"));
         BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Otros\\adv.csv"));
        
         if(analizar[0].equals("i"))
         { while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
         {  
             String[] arreglo_datos = linea.split(";");
             String[] verbios = linea2.split(";");//adverbios de tiempo
             if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
             {
                 si="Yo "+arreglo_datos[1]+ " "+verbios[1]+"\n";
                 afirmati+=si;
             }
         }
         }
         
         if(analizar[1].equals("you"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 {
                     System.out.print("Tú "+arreglo_datos[2]+ " "+verbios[1]+"\n");
                     si="Tú "+arreglo_datos[2]+ " "+verbios[1]+"\n";
                     afirmati+=si; 
                 }
             }
         }
         
         if(analizar[1].equals("we"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 {
                     System.out.print("Nosotros "+arreglo_datos[3]+ " "+verbios[1]+"\n");
                     si="Nosotros "+arreglo_datos[3]+ " "+verbios[1]+"\n";
                     afirmati+=si;
                 }
             }
         }
         
         if(analizar[1].equals("they"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 {//System.out.print("Ellos "+arreglo_datos[4]+ " "+verbios[1]+"\n");
                     si="Ellos "+arreglo_datos[4]+ " "+verbios[1]+"\n";
                     afirmati+=si;
                 }
             }
         } 
         
         if(analizar[1].equals("she"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 { //System.out.print("Ella "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                     si="Ella "+arreglo_datos[5]+ " "+verbios[1]+"\n";
                     afirmati+=si;
                 }
             }
         }
         
         if(analizar[1].equals("he"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 { //System.out.print("El "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                     si="Él "+arreglo_datos[5]+ " "+verbios[1]+"\n";
                     afirmati+=si;
                 }
             }
         }
         
         if(analizar[1].equals("it"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 { //System.out.print("Eso "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                     si="Eso "+arreglo_datos[5]+ " "+verbios[1]+"\n";
                     afirmati+=si;
                 }
             }
         }
     }//fin tobesimpleafir
     
     public void simplenega(String palabra) throws IOException
     {
         String sn="";
         String analizar[]=palabra.split(" "); 
         String linea;  
         String linea2;
         String escribir="";
         BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Otros\\verbos.csv"));
         BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Otros\\adv.csv"));
         
         if(analizar[0].equals("i"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
                 {//System.out.print("Yo no "+arreglo_datos[1]+ " "+verbios[1]+"\n");
                     sn="Yo no "+arreglo_datos[1]+ " "+verbios[1]+"\n";
                     afirmati+=sn;
                 }
             }
         }
         
         if(analizar[1].equals("you"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
                 {//System.out.print("Tu no "+arreglo_datos[2]+ " "+verbios[1]+"\n");
                     sn="Tú no "+arreglo_datos[2]+ " "+verbios[1]+"\n";
                     afirmati+=sn;
                 }
             }
         }
         
         if(analizar[1].equals("we"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
                 { //System.out.print("Nosotros no "+arreglo_datos[3]+ " "+verbios[1]+"\n");
                     sn="Nosotros no "+arreglo_datos[3]+ " "+verbios[1]+"\n";
                     afirmati+=sn;
                 }
             }
         }
         
         if(analizar[1].equals("they"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
                 {//System.out.print("Ellos no "+arreglo_datos[4]+ " "+verbios[1]+"\n");
                     sn="Ellos no "+arreglo_datos[4]+ " "+verbios[1]+"\n";
                     afirmati+=sn;
                 }
             }
         }
         
         if(analizar[1].equals("she"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
                 { // System.out.print("Ella no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                     sn="Ella no "+arreglo_datos[5]+ " "+verbios[1]+"\n";
                     afirmati+=sn;
                 }
             }
         }
         
         if(analizar[1].equals("he"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             { 
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]))
                 {// System.out.print("El no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                     sn="Él no "+arreglo_datos[5]+ " "+verbios[1]+"\n";
                     afirmati+=sn;
                 }
             }
         }
         
         if(analizar[1].equals("it"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             { 
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[3].equals(arreglo_datos[0]) && analizar[4].equals(verbios[0]) )
                 {//System.out.print("Eso no "+arreglo_datos[5]+ " "+verbios[1]+"\n");
                     sn="Eso no "+arreglo_datos[5]+ " "+verbios[1]+"\n";
                     afirmati+=sn;
                 }
             }
         }
     }
     
     public void simplepregunta(String palabra) throws IOException
     {
         String si="";    
         String analizar[]=palabra.split(" "); 
         String linea;  
         String linea2;
         String escribir="";
         BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Otros\\verbos.csv"));
         BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\wlinares\\Downloads\\ProyectoFinalCompiladores\\src\\Otros\\adv.csv"));
         if(analizar[1].equals("i"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";"); 
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 {//System.out.print("¿Yo "+arreglo_datos[1]+ " "+verbios[1]+"?"+"\n");
                     si="¿Yo "+arreglo_datos[1]+ " "+verbios[1]+"?"+"\n";
                     afirmati+=si;
                 }
             }
         }
         
         if(analizar[1].equals("you"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 {//System.out.print("¿Tu "+arreglo_datos[2]+ " "+verbios[1]+"?"+"\n");
                     si="¿Tú "+arreglo_datos[2]+ " "+verbios[1]+"?"+"\n";
                     afirmati+=si;
                 }
             }
         }
         
         if(analizar[1].equals("we"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 {//System.out.print("¿Nosotros"+arreglo_datos[3]+ " "+verbios[1]+"?"+"\n");
                     si="¿Nosotros "+arreglo_datos[3]+ " "+verbios[1]+"?"+"\n";
                     afirmati+=si;
                 }
             }
         }
         
         if(analizar[1].equals("they"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 {//System.out.print("¿Ellos "+arreglo_datos[4]+ " "+verbios[1]+"?"+"\n");
                     si="¿Ellos "+arreglo_datos[4]+ " "+verbios[1]+"?"+"\n";
                     afirmati+=si;
                 }
             }
         }
         
         if(analizar[1].equals("she"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             { 
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 {//System.out.print("¿Ella "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
                     si="¿Ella "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n";
                 }
             }
         }
         
         if(analizar[1].equals("he"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             { 
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 {//System.out.print("¿El "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
                     si="¿Él "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n";
                     afirmati+=si;
                 }
             }
         }
         
         if(analizar[1].equals("it"))
         {
             while ((linea=reader.readLine()) !=null && (linea2=r.readLine())!=null)
             {  
                 String[] arreglo_datos = linea.split(";");
                 String[] verbios = linea2.split(";");//adverbios de tiempo
                 
                 if(analizar[2].equals(arreglo_datos[0]) && analizar[3].equals(verbios[0]) )
                 {//System.out.print("¿Eso "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n");
                     si="¿Eso "+arreglo_datos[5]+ " "+verbios[1]+"?"+"\n";
                     afirmati+=si; //TxtCod2.setText(escribir);
                 }
             }
         }
     }
}
