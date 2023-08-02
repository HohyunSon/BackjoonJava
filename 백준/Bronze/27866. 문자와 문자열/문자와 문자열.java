import java.util.Scanner;
class Main{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int idx = sc.nextInt();
        System.out.println(a.charAt(idx-1));
        sc.close();
    }
}