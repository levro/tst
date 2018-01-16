import java.util.*;

public class AngreeProf {

    static String angryProfessor(int k, int[] a) {
        int stPresent = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) stPresent++;
        }
        return (stPresent < k) ? "YES" : "NO ";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = angryProfessor(k, a);
            System.out.println(result);
        }
        in.close();
    }
}