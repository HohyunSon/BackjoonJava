import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int numOfArr = sc.nextInt();
        int[] arr = new int[numOfArr];
        for(int i=0; i<numOfArr;i++)
            arr[i] = sc.nextInt();
        int findNum = sc.nextInt();
        for(int i=0;i<numOfArr;i++)
            if(arr[i]==findNum)
                cnt++;
        System.out.print(cnt);
        sc.close();
    }
}