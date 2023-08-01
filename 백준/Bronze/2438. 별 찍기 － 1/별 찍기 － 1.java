import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =0, j=0;
        int line = sc.nextInt();
        for(i=1;i<=line;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}