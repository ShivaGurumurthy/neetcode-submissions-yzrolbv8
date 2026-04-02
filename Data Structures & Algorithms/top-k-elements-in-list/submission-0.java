class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];
        int x = 0;
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        while(k > 0){
            int max = 0;
            for(int i : map.values()){
                if(i > max) max = i;
            }

            final int targetValue = max;
            
           Integer key = map.entrySet().stream()
               .filter(entry -> entry.getValue() == targetValue)
               .map(Map.Entry::getKey)
               .findFirst()
               .orElse(null);


            if(key != null){
                arr[x++] = key;
                map.remove(key);
                k--;
            }
            
        }

        return arr;
    }
}
