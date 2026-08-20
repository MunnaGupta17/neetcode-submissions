class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = 0, j = matrix.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            int startingNum = matrix[mid][0], lastNum = matrix[mid][matrix[mid].length-1];
            if(target >= startingNum && target<= lastNum){
                int arrayLength = matrix[mid].length;
                int left = 0, right = arrayLength-1;
                while(left <= right){
                    int midNum = (left+right)/2;
                    if(matrix[mid][midNum] == target){
                        return true;
                    }else if(matrix[mid][midNum] > target){
                        right = midNum-1;
                    }else{
                        left = midNum+1;
                    }
                }
                return false;
            }else if(target < startingNum){
                j = mid-1;
            }else{
                i = mid+1;
            }
        }
        return false;



    }
}

