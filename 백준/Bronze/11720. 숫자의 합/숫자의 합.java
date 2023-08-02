import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        int sum=0;

        for(int i=0;i<num;i++) {
            sum+=a.charAt(i)-'0';
        }
        System.out.println(sum);
        sc.close();
    }
}