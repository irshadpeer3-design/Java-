import java.util.*;

class calculator
{
        int c;
     int  add (int a,int b)
    {
        c=a+b;
        return c;
    }
}
 class Demo
{
    public static void main (String[] args) 
	{
       calculator calc = new calculator();
       int num1= 50;
       int num2 =40;
       int res= calc.add (num1,num2);
       System.out.println(res);
	}
}
    
