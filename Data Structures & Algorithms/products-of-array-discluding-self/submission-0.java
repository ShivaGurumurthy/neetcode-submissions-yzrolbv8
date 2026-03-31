class Solution {
    public int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int removed = list.get(i);
            list.remove(i);

            int prod = 1;
            for (int val : list) {
                prod *= val;
            }

            result[i] = prod;
            list.add(i, removed); 
        }

        return result;
    }
}