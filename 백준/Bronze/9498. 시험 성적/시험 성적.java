import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        num1 = sc.nextInt();

        if (num1>=90)
            System.out.println("A");
        else if(90>num1&&num1>=80)
            System.out.println("B");
        else if(80>num1&&num1>=70)
            System.out.println("C");
        else if(70>num1&&num1>=60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}