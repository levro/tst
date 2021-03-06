import java.util.*;

public class GamingArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int winner = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                int number = in.nextInt();
                if (max < number) {
                    max = number;
                    winner ^= 1;
                }
            }
            System.out.println(winner == 0 ? "ANDY" : "BOB");
        }
    }
}