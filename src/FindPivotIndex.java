public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println("Pivot Index " + pivotIndex2(nums));
    }

    public static int pivotIndex1(int[] nums) {
        int pivotIdx = 0;

        while (pivotIdx < nums.length) {
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < pivotIdx; i++) {
                sum1 += nums[i];
            }
            for (int i = pivotIdx + 1; i < nums.length; i++) {
                sum2 += nums[i];
            }

            if (sum1 == sum2) return pivotIdx;

            pivotIdx++;
        }

        return -1;
    }

    public static int pivotIndex2(int[] nums) {
        int suffix = 0;
        for (int i = 0; i < nums.length; i++) {
            suffix += nums[i];
        }
        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {


            suffix -= nums[i];
            System.out.println(suffix);
            if (prefix == suffix) {
                return i;
            }
            prefix += nums[i];
            System.out.println(prefix);
        }
        return -1;
    }
}
