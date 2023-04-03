import java.util.Arrays;

@FunctionalInterface
interface SFilter {
    boolean test(String str);

    static String[] filter(String[] arr, SFilter filt) {
        int arrCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (filt.test(arr[i]) == true) {
                arrCounter++;
            }
        }
        String[] arrAnother = new String[arrCounter];
        arrCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (filt.test(arr[i]) == true) {
                arrAnother[arrCounter] = arr[i];
                arrCounter++;
            }
        }
        return arrAnother;
    }
}

class LenFilter implements SFilter {
    int minLen;

    public LenFilter(int minLen) {
        this.minLen = minLen;
    }

    @Override
    public boolean test(String str) {
        return str.length() >= minLen;
    }
}

public class StringFilter {
    static SFilter anon = new SFilter() {
        @Override
        public boolean test(String str) {
            if((((int) str.charAt(0)) < 68) && (((int) str.charAt(0)) >= 65)){
                return true;
            }
            else return false;
        }
    };

    public static void main(String[] args) {

        String[] arr = {"Alice", "Sue", "Janet", "Bea"};
        System.out.println(Arrays.toString(arr));

        String[] a1 = SFilter.filter(arr, new LenFilter(4));
        System.out.println(Arrays.toString(a1));

        String[] a2 = SFilter.filter(arr, anon);
        System.out.println(Arrays.toString(a2));

        String[] a3 = SFilter.filter(arr, (str -> (((int) str.charAt(0)) > 72) && (((int) str.charAt(0)) <= 90)));
        System.out.println(Arrays.toString(a3));
    }
}
