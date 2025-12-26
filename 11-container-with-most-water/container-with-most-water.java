class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int contains = 0;
        while (left<right){
             int width = right - left;
             int current_area = width * Math.min(height[left],height[right]);
             contains = Math.max(current_area,contains);
             if(height[left]<height[right]){
                left++;
             }
             else{
                right--;
             }
        }
        return contains;
    }
}
