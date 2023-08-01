import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int t=0;;t++)
        {
            int i = sc.nextInt();
            int j = sc.nextInt();
            if (i+j==0&&i-j==0)
                break;
            System.out.println(i+j);
        }
    }
}