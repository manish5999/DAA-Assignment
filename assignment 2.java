q1)	88 – Merge Sorted Array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i = m-1;
       int j= n-1;
       int k = n+m-1;

       while(i>=0 && j>=0){
          if(nums1[i]>nums2[j]){
             nums1[k--] = nums1[i--];
          }else{
              nums1[k--]=nums2[j--];
          }
       } 

       while(i>=0){
          nums1[k--] = nums1[i--];
       }

       while(j>=0){
          nums1[k--] = nums2[j--];
       }
    }
}
q2)912 – Sort an Array
q3)215 – Kth Largest Element in an Array
q4)53 – Maximum Subarray
q5)4 – Median of Two Sorted Arrays
