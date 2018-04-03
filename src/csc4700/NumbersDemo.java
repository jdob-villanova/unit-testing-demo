package csc4700;


public class NumbersDemo {

    public int sum(int[] nums) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        return total;
    }

    public int parseAndSum(String nums) {
        if (nums == null) {
            throw new IllegalArgumentException();
        }

        String[] pieces = nums.split(",");
        int total = 0;
        for (String p : pieces) {

            int addMe = Integer.parseInt(p);
            total += addMe;
        }

        return total;
    }

    public float average(int[] nums) {
        int total = this.sum(nums);
        float avg = (float)total / nums.length;
        return avg;
    }

}
