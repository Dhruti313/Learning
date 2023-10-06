package Leetcodeproblems;

public class TwoSortedArrayMerge {

    public static void main(String args[]){
        int nums1[] = {1};
        int nums2[] = {};
        int index = nums1.length-1;
        int m =1;
        int n =0;
        int i = m -1;
        int j = n -1;
        while(j >=0) {
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[index--] = nums1[i--];
            }
            else{
                nums1[index--] = nums2[j--];
            }
        }
        for(int l = 0 ; l <nums1.length ; l++){
            System.out.print(nums1[l]+" ");
        }
    }
}
