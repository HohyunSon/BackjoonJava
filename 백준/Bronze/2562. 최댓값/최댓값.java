import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int idx=1;
        for(int i=0; i<arr.length;i++)
            arr[i] = sc.nextInt();
        int max=arr[0];
        for(int i=1;i<arr.length;i++) {
            if (max < arr[i]) {
                max=arr[i];
                idx=i+1;
            }
        }
        System.out.print(max+"\n"+idx);
        sc.close();
    }
}