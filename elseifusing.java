import java.util.Scanner;

public class elseifusing 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the wether condition sunny or cloudy");
        String check=sc.nextLine();
        if(check.equals("sunny"))
        {
            System.out.println(check +"equal is sunny");
        }
        else if(check.equals("cloudy"))
        {
            System.err.println(check+" is equal to cloudy");
        }
    }
}
