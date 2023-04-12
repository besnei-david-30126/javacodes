import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("How many numbers of the Fibonacci series would you like to see?");
        System.out.println("Please enter the value: ");
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        int number1=1,number2=0,result=0;
        for(int i=0;i<length;i++)
        {
            if(i>1)
            {
                result=number2+number1;
                number2=number1;
                number1=result;
            }
            else {
                result=i;
            }
            System.out.print(result+", ");
        }
    }
}
