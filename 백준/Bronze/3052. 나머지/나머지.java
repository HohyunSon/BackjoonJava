import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int[] mod = new int[42];
        int cnt=0;
        for(int i=0;i<num.length;i++) {
            num[i] = sc.nextInt();
            num[i] = num[i]%42;
        }
        for(int i=0;i<num.length;i++){
            mod[num[i]]++;
        }
        for(int i=0;i<mod.length;i++)
            if(mod[i]!=0)
                ++cnt;
        System.out.println(cnt);
        sc.close();
    }
}