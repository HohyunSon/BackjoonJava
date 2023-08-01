import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a != b && b != c && a != c) //모두 다를 경우
        {
            int max = 0;
            if (a > b) {
                max = a;
                if (c > a)
                    max = c;
            } else if (b > a) {
                max = b;
                if (c > b)
                    max = c;
            }
            System.out.println(max * 100);
        }
        else if (a == b && b == c)
            System.out.println(10000 + a * 1000);//같은 눈 세개

        else {
            int same = 0;

            if (a == b && a!=c)
                same=a;
            if (c == b && c!=a)
                same=c;
            if (a == c && a!=b)
                same=a;

            System.out.println(1000 + same * 100);//같은 눈 두개
        }

    }
}