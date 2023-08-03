import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        int cnt = 0;
        str = sc.nextLine();
        sc.close();
        for(int i = 0; i < str.length(); i ++)
        {
            if(str.charAt(i) == ' '){
                cnt++;
            }
        }
        if(str.charAt(0) != ' ' && str.charAt(str.length()-1) != ' ')
            cnt = cnt + 1;

        if(str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' ')
            cnt = cnt - 1;
        System.out.println(cnt);
    }
}
