import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        int num ,count=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digit");
         num = sc.nextInt();
          while (num != 0) {
                // num = num/10
                
                int digit=num%10;
                
                
                sum=sum+digit;
                num /= 10;

              }
          
              System.out.println("Number of digits: " + sum);
            }
          }
