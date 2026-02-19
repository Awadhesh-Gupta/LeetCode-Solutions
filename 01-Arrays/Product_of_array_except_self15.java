class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] PrefixProduct = new int[nums.length];
        int[] SuffixProduct = new int[nums.length];
        int[] result = new int[nums.length];

        PrefixProduct[0] = 1;
        for(int i=1;i<nums.length;i++){
            PrefixProduct[i] = PrefixProduct[i-1]*nums[i-1];
        }

        SuffixProduct[nums.length-1] = 1;
        for(int i= nums.length-2;i>=0;i--){
            SuffixProduct[i] = SuffixProduct[i+1] *nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            result[i] = PrefixProduct[i] * SuffixProduct[i];
        }

        return result;
    }

}