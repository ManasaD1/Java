
public class test37 {
    private final int[] pref;

    public test37(int[] arr) {
        int n = arr.length;
        this.pref = new int[n + 1];
        for (int i = 0; i < n; i++) {
            this.pref[i + 1] = this.pref[i] + arr[i];
        }
    }

    public int rangeQuery(int left, int right) {
        return this.pref[right + 1] - this.pref[left];
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 1, 5, 9 };
        test37 ps = new test37(nums);
        System.out.println(ps.rangeQuery(1, 4));
        System.out.println(ps.rangeQuery(0, 2));
    }
}
