import java.util.*;
class Ap{
    public static void main(String[] args)
    {
        System.out .println("enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //System.out.println(str);
        String[] arr=str.split(" ");
       /* for(int i=0;i<arr.length;i++)
        {
            System.out .println(arr[i]);
        }*/
           int num=Integer.parseInt(arr[0]);
            int num1=Integer.parseInt(arr[1]);
            int diff=num-num1;
            //System.out.println(diff);
        int flag=1;
        for(int i=1;i<arr.length-1;i++)
        {
            int num2=Integer.parseInt(arr[i]);
            int num3=Integer.parseInt(arr[i+1]);

            int diff1=num2-num3;
            if(diff!=diff1)
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
        System.out.println("NOT A AP");
        else
        System.out.println("A AP");
        
       
       
    }
}

