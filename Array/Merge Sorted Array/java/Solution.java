class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //int l=0;
        System.out.println(Arrays.toString(nums1));
        for(int i=0,l=0;i<nums1.length &&l<n ;i++)
        {
            if(nums1[i]==0)
            {
                nums1[i]=nums2[l];
                l++;
            }
        }
        Arrays.sort(nums1);
    }
}