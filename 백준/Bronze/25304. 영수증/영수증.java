import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum=sc.nextInt(),n=sc.nextInt();
        int mtp=0,bsum=0;
        for(int i=1;i<=n;i++)
        {
            int bp=sc.nextInt(),bn=sc.nextInt();
            mtp = bp*bn;
            bsum += mtp;
        }
        if(bsum == sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}