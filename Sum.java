class Sum 
{
    public static void main(String[] args) 
    {
        int num = 2341, sum=0 , mod  ;

        for(int i=0 ; i<4 ; i++)
        {
            mod=num%10 ;
            sum=sum+mod ;
            num=num/10 ;
        }

        System.out.print("The  sum of digits is "+sum);
        
    }
}