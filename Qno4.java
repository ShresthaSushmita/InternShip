public class Multiple
{
    public static void main(String[] args)
    {
        int j, sum=0;
        for ( j = 0; j <1000; j++) {               
            if((j%5==0)||(j%3==0))
            {   
                sum = sum + j;    
            }               
        }         
        System.out.println(sum);            
    }   
}
