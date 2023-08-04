import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++) {
            int re = sc.nextInt();
            String input = sc.nextLine().trim();
            String repeat="";
            for(int k=0;k<input.length();k++) {
                for (int j = 0; j < re; j++) {
                    char[] ch = new char[1];
                    ch[0] = input.charAt(k);
                    repeat += ch[0];
                }
            }
            System.out.println(repeat);
        }
        sc.close();
    }
}
