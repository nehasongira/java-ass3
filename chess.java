import java.util.*;
class chess{
    public static void main(String[] args)
    {
        String[][] chess=new String[8][8];
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {  
                if(i%2==0)
                {
                    if(j%2==0)
                    System.out.print("WW|");
                    else
                    System.out.print("BB|");
                }
                else
                {
                    if(j%2==0)
                    System.out.print("BB|");
                    else
                    System.out.print("WW|");
                }
            }
            System.out.println(" ");  
        }
          
    }
  
}
