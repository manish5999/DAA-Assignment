//q1)704-binary search
class Solution {
    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}

//q2)35 – Search Insert Position
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length -1; 
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if (nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}


//q3)74 – Search a 2D Matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
		int n = matrix[0].length;

		int low = 0;
		int high = m * n - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int row = mid / n;
			int col = mid % n;
			int newmid = matrix[row][col];

			if (target == newmid) {
				return true;
			} else if (newmid > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
return false;
    }
}


//q4)33 – Search in Rotated Sorted Array
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } 
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
//q5)162 – Find Peak Element
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
