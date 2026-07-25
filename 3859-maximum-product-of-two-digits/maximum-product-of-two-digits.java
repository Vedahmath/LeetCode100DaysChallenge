class Solution {
     public static int maxProduct(int n) {
        int[] a = new int[10];
        int c = 0, max = 0, k = 0;
        while (n > 0) {
            int r = n % 10;
            a[c] = a[c] + r;
            c++;
            n = n / 10;
        }
        Arrays.sort(a);
        return a[a.length-1] * a[a.length-2];
     }
}