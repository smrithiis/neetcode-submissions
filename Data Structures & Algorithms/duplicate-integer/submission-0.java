class Solution {
    public boolean hasDuplicate(int[] nums) {
        int temp = 0;
        boolean found = false;
        for (int i = 0; i < nums.length ; i++){
            temp = nums[i];
            for (int j = 0; j < nums.length; j++){
                if (i != j && temp == nums[j]){
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        return found;
    }

}