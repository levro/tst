import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class Between {

    static int getTotalX(int[] a, int[] b) {
        int count = 0;
        boolean flag;
        for (int i = a[a.length - 1]; i <= b[0]; i++) {
            flag = true;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] != 0){
                    flag = false;
                    break;
                }
            }
            if (!flag) continue;
            for (int j = 0; j < b.length; j++) {
                if (b[j] % i != 0){
                    flag = false;
                    break;
                }
            }
            if (flag) count++;
        }
        return  count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
