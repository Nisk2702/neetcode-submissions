class Solution {
    public int[] twoSum(int[] nums, int target) {

        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int nums2 = target - nums[i]; //4 //3
            if(map.get(nums[i]) != null){ //
                return new int[]{map.get(nums[i]), i};
            }
            map.put(nums2, i); //0, 4

        }

        return new int[2];
        
    }
}
