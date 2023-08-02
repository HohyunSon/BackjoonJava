import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] score = new double[n];

        for(int i=0;i<score.length;i++)
            score[i] = sc.nextInt();

        double max=score[0];
        double sum=0;

        for(int i=0;i<score.length;i++) //최대점수 찾기
        {
            if(max<score[i])
                max=score[i];
        }

        for(int i=0;i<score.length;i++)//점수 올리기
        {
            score[i]=Math.round((score[i]/max*100)*100)/100.0;
            sum += score[i];
        }
        System.out.println(sum/n);
        sc.close();
    }
}