import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfArr = sc.nextInt();
        int[] arr = new int[numOfArr];
        for(int i=0; i<numOfArr;i++)
            arr[i] = sc.nextInt();
        int min=arr[0],max=arr[0];

        for(int i=1;i<numOfArr;i++) {
            if (min > arr[i]) {
                min=arr[i];
            }
        }
        for(int i=1;i<numOfArr;i++) {
            if (max < arr[i]) {
                max=arr[i];
            }
        }
        System.out.print(min+" "+max);
        sc.close();
    }
}