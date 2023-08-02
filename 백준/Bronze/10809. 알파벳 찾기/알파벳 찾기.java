import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int[] form = new int[26];
        for(int i=0;i<form.length;i++)
            form[i]=-1;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(form[ch-'a']==-1)
                form[ch-'a']=i;
        }
        for(int i=0;i<form.length;i++)
            System.out.print(form[i]+" ");
    }
}
