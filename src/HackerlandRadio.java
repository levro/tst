import java.util.*;

public class HackerlandRadio {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }

        Arrays.sort( x );
        String city = ".";
        String cityN = "";

        List<Integer> rad = new ArrayList<>();

        int house = 0;
        int radio = 1;
        do {

            for ( int i = radio; i < x.length && x[i]-k <= x[house]; i++ ) {
                radio = i;
            }
            rad.add( x[radio] );
            if (x[radio] + k >= x[x.length - 1]) break;
            for ( int i = radio + 1; i < x.length && x[i - 1]-k <= x[radio]; i++ ) {
                house = i;
            }

            if (radio < house) radio = house;

        } while ( x[radio] + k <= x[x.length - 1] );

        if (x[radio] != rad.get( rad.size() - 1 ) && radio <= x.length - 1){
            rad.add( x[radio] );
        }


        System.out.println(rad.size());

    }
}