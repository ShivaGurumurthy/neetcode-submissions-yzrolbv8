class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] arr = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            int prefixProd = 1;
            int suffixProd = 1;

            for(int j = 0; j < i; j++){
                prefixProd *= nums[j];
            }

            for(int j = i + 1; j < nums.length; j++){
                suffixProd *= nums[j];
            }

            arr[i] = prefixProd * suffixProd;
        }

        return arr;
    }
}