import java.util.*;
import java.io.File;
import java.nio.file.Paths;
import java.io.FilenameFilter;
import java.io.FileInputStream;

class FileFilter{


    private static byte[] readContentIntoByteArray(File file)
    {
       FileInputStream fileInputStream = null;
       byte[] bFile = new byte[(int) file.length()];
       try
       {
          //convert file into array of bytes
          fileInputStream = new FileInputStream(file);
          fileInputStream.read(bFile);
          fileInputStream.close();
          for (int i = 0; i < bFile.length; i++)
          {
             System.out.print((char) bFile[i]);
          }
       }
       catch (Exception e)
       {
          e.printStackTrace();
       }
       return bFile;
    }
 
    public static void main(String[] args)
    {
       // Scanner sc=new Scanner(System.in);
        //String str=sc.nextLine();
       /* try { 
  
            // Create a file object 
            File f = new File("/home/cgi/Desktop/allgood/java-pr3"); 
  
            // Get all the names of the files present 
            // in the given directory 
            File[] files = f.listFiles(); 
  
            System.out.println("Files are:"); 
  
            // Display the names of the files 
            for (int i = 0; i < files.length; i++) { 
                System.out.println(files[i].getName()); 
            } 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        }*/ 

       
            File folder = new File("/home/cgi/Desktop/allgood/java-pr3");
            File file = new File("/home/cgi/Desktop/allgood/java-pr3/trial1/trial");
            readContentIntoByteArray(file);
            //String Name = folder.getName(); 
            //System.out.println(Name);
            File[] listOfFiles = folder.listFiles();
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                System.out.println("File " + listOfFiles[i].getName());
                } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
                }
              }
              System.out.println(" ");
              for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile() && listOfFiles[i].getName().endsWith(".class")) 
                {
                   System.out.println("File " + listOfFiles[i].getName());
                } 
                //else if (listOfFiles[i].isDirectory()) {
                //System.out.println("Directory " + listOfFiles[i].getName());
                //}
              }
    }
}

