import java.util.*;

class calculator
{
        int a=50;
        int b=60;
     int add ()
    {
        int c=a+b;
        return  c;
    }
}
 class Demo
{
    public static void main (String[] args) 
	{
       calculator calc = new calculator();
       int res= calc.add ();
	}
}
    
