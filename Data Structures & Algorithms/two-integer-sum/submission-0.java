class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        for (int k = 0; k < nums.length - 1; k++){
            for (int y = k+1; y < nums.length; y++){
                if (nums[k] + nums[y] == target && k != y){
                    i = k;
                    j = y;
                    break;
                }
            }
        }
        int[] arr = new int[2];
        arr[0]= i;
        arr[1]= j;
    return arr;
    }
}
