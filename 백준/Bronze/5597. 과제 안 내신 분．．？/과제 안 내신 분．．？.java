import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[30];
        int[] answer = new int [30];
        for(int i=0;i<student.length;i++)
            student[i]=i+1;
        for(int i=0;i<student.length-2;i++)
        {
            int chk = sc.nextInt();
            for(int j=0;j<student.length;j++) {
                if (chk == student[j]) {
                    answer[j] = student[j];
                }
            }
        }
        for(int i=0;i<answer.length;i++)
            if(answer[i]==0)
                System.out.println(i+1);
        sc.close();
    }
}