import java.util.*;

    class car{
        String name;
        int noOfSeats;
        float cost;
    }
    class Demo{
        public static void main (String[] args) 
	{
        car a = new car();
        a.name ="Maruthi";
        a.noOfSeats = 5;
        a.cost = 8.66f;
        System.out.println(a.name);
	    System.out.println(a.noOfSeats);
	    System.out.println(a.cost);
	    car b;
	    b=a;
	    System.out.println(b.name);
	    b.name="KIA";
	    b.noOfSeats=7;
	    b.cost=15.76f;
	    System.out.println(b.name);
	    System.out.println(b.noOfSeats);
	    System.out.println(b.cost);
	    System.out.println(a.name);
	    System.out.println(a.noOfSeats);
	    System.out.println(a.cost);
	    
        }
	
	}

