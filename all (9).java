import java.util.*;

class calculator
{
        int c;
     void  add (int a,int b)
    {
        c=a+b;
        System.out.println(c);
    }
}
 class Demo
{
    public static void main (String[] args) 
	{
       calculator calc = new calculator();
       int num1= 50;
       int num2 =40;
       calc.add (num1,num2);
     
	}
}
    
