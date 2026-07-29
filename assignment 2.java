//q1)	88 – Merge Sorted Array
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

//q2)912 – Sort an Array
class Solution {

    public int[] sortArray(int[] nums) {
        sorting(nums, 0, nums.length - 1);
        return nums;
    }

    public static void sorting(int[] arr, int l, int r) {
        if (l >= r) return;

        int mid = (l + r) / 2;

        sorting(arr, l, mid);
        sorting(arr, mid + 1, r);

        mearge(arr, l, mid, r);
    }

    public static void mearge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
//q3)215 – Kth Largest Element in an Array
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);  
        return nums[nums.length - k];
    }
}
//q4)53 – Maximum Subarray
class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currSum= nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxSum=Math.max(maxSum,currSum);
        }

        return maxSum;
    }
}
//q5)4 – Median of Two Sorted Arrays
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int result[] = new int[n + m];
        
        int i = 0, j = 0;
        for (int a = 0; a < n + m; a++) {
            if (i < n && (j >= m || nums1[i] < nums2[j])) {
                result[a] = nums1[i];
                i++;
            } else if (j < m) {
                result[a] = nums2[j];
                j++;
            }
        }
        
        if (result.length % 2 == 0) {
            return (result[result.length / 2 - 1] + result[result.length / 2]) / 2.0;
        }
        return result[result.length / 2];
    }
}
