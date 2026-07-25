class Demo
{
    public static void main(String[]args)
    {
        String s1 ="java";
        String s2 ="python";
        String s3=s1+s2;
        String s4=s1+s2;
       
        
        if(s3==s4)
        {
            System.out.println("Ref are equal");
        }
        else{
            
            
            System.out.println("Ref are unequal") ;
        }
    }
}