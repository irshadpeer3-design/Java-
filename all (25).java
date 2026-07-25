class Demo
{
    public static void main(String[]args)
    {
        String s2="sachin";
        String s1 ="saurav";
        int res =s1.compareTo(s2);
        System.out.println(res);
        
        if(res==0)
        {
            System.out.println("Ref are equal");
        }
        else if(res>0){
            
            
            System.out.println("s1>s2") ;
        }else{
            
            
            System.out.println("s1<s2") ;
        }
    }
}