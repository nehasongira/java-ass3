import java.util.*;

import javax.print.DocFlavor.STRING;
class VowelRemove{
    public static void main(String[] args)
    {
        System.out .println("enter the number of string");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        String[] arr=new String[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=scanner.next();
        }

        String inter=Arrays.toString(arr);
       
       inter= inter.replace("[", "");
       inter= inter.replace("]", "");
        System.out.println(inter);
        inter = inter.replaceAll("[aeiou]", "");
        //System.out.println(inter);
        arr=inter.split(",");

        /*Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
         List<Character> al = Arrays.asList(vowels); 

         for (int i = 0; i < arr.length; i++) { 
              for(int j=0;j<arr[i].length;j++)
              {
                    if(al.contains(arr[i].charAt(j))){ 
                    arr[i].replace(j, j+1) ; 
                    i--; 
                 }
            } 
       } */
        for(int i=0;i<arr.length;i++)
        {   
            System.out.print("Place Name without Vowels:"+i);
            System.out.println(arr[i]);
        }
    }
}