import java.io.File;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Map.Entry;
import java.nio.file.Files;
import java.nio.file.Paths;
public class freq2 {
    public static void main(String[] args)throws IOException {
        File myFile= new File("trial");
        BufferedReader bf=new BufferedReader(new FileReader(myFile));
        String myString1= bf.readLine();
        String myString2=bf.readLine();
        String myString3=bf.readLine();
        String finalString=myString1+myString2+myString3;        String a[] = finalString.split(" |,");
        Map<String, Integer> words = new HashMap<>();
        for (String str : a) {
            if (words.containsKey(str)) {
                words.put(str, 1 + words.get(str));
            } else {
                words.put(str, 1);
            }
        }
        System.out.println(words);
    }
  }


