import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNum = sc.nextInt();
        int idx = sc.nextInt();
        int[] arr = new int[arrNum];
        for(int i=0;i<idx;i++)
        {
            int start,end,num;
            start=sc.nextInt()-1;
            end=sc.nextInt()-1;
            num=sc.nextInt();
            for(int p=start;p<=end;p++)
                arr[p]=num;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}