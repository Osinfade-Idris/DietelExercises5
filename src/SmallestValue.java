import java.util.Scanner;
public class SmallestValue
{
    public static void main(String[] args)
    {
        int lowest;
        Scanner input = new Scanner(System.in);
        //input = in.nextLine();
        System.out.printf("Enter the number of integers you are going to enter: ");
        int num = input.nextInt();
        input.nextLine();

        int numbers[] = new int[num];
        for(int c = 0; c < num; c++)
        {
            System.out.printf("Enter the "+(c+1)+" of "+num+" number: ");
            numbers[c]=input.nextInt();
            input.nextLine();
        }
        lowest=numbers[0];
        for(int c = 1; c < num; c++)
        {
            if(lowest>numbers[c])
                lowest=numbers[c];
        }
        System.out.printf("The lowest number is "+lowest);
    }
}