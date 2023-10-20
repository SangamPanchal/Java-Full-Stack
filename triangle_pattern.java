public class triangle_pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=0 ; i<=5 ; i++)
        {
            for(j=0 ; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
        System.out.println("reverse triangle");
        for(i=0 ; i<=5 ; i++)
        {
            for(j=i ; j<=5 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
