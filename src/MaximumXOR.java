import java.util.*;

public class MaximumXOR {

    static int maxXor(int l, int r) {
        int maxXOR = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                int xor = i ^ j;
                if (xor > maxXOR) maxXOR = xor;
            }
        }
        return maxXOR;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());

        int _r;
        _r = Integer.parseInt(in.nextLine());

        res = maxXor(_l, _r);
        System.out.println(res);

    }
}
