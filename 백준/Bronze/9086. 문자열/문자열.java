import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String a;
        for(int i=0;i<num;i++) {
            a = sc.nextLine();
            System.out.print(a.charAt(0));
            System.out.println(a.charAt(a.length()-1));
        }
        sc.close();
    }
}