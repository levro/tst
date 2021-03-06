import java.util.*;

public class InsertionSortAdvancedAnalysis {

    public static void insertionSortPart3(int[] ar) {
        int len = ar.length;
        long count = 0;
        for (int len_sorted = 2; len_sorted <= len; len_sorted++) {
            int inserting = ar[len_sorted - 1];
            long subcount = 0;
            int up = 1;
            int step = len_sorted/2 + 1;;
            int j = 0;
            do {
                j = j + step * up;
                if (inserting > ar[j]) up = 1;
                else up = -1;
                step = step/2;


                if (j < len_sorted/2 && inserting < ar[len_sorted/2]){
                    j = len_sorted/2;
                }
                if (j != len_sorted && inserting < ar[len_sorted - j - 1]){
                    ar[len_sorted - j] = ar[len_sorted - j - 1];
                }
                else{
                    ar[len_sorted - j] = inserting;
                    subcount = j - 1;
                    j = len_sorted;
                }
                count += subcount;
            }while (ar[j] <= inserting && inserting <= ar[j+1]);

            subcount = len_sorted - j;

            ar[j] = inserting;


        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        int q = in.nextInt();
        for ( int j = 0; j < q; j++ ) {
            int s = in.nextInt();
            int[] ar = new int[s];
            for(int i=0;i<s;i++){
                ar[i]=in.nextInt();
            }
            long start = System.currentTimeMillis();
            insertionSortPart3(ar);
            System.out.println("программа выполнялась " + (System.currentTimeMillis() - start) + " миллисекунд");
        }
    }
}