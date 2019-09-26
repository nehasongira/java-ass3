import java.util.*;
class TypeException{
    public static void main(String[] args)
    {
        int size=-2;
        int[] arr1=new int[5];
        try{
            int[] arr=new int[size];
            //int num=arr1[6];

        }
        catch(NegativeArraySizeException e){
           System.out.println("it is NegativeArraySizeException");
        }
        try{
            int num=arr1[6];
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("it is IndexOutOfBoundsException");
        }
        try{
            String str=null;
		System.out.println (str.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("it is NullPointerException e");
        }
    }
}
