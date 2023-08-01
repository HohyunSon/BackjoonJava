import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        int time=sc.nextInt();

        m+=time;
        while(m>=60) {
            if (m >= 60) {
                m -= 60;
                h += 1;
            }
        }
        if(h>=24){
            h-=24;
        }

        System.out.println(h+" "+m);


    }
}