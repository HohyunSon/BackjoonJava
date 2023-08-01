import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int numOfArr = sc.nextInt();
        int[] arr = new int[numOfArr];
        int findNum = sc.nextInt();
        for(int i=0; i<numOfArr;i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<numOfArr;i++)
            if(arr[i]<findNum)
                System.out.print(arr[i]+" ");
        sc.close();
    }
}