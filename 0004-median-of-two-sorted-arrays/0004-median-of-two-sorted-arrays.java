class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];
        int k = 0;
        int i=0,j=0;
        
        if(nums1.length==0){
            for(;j<nums2.length;j++){
                array[k++] = nums2[j];
            }
        }
        else if(nums2.length==0){
            for(;i<nums1.length;i++){
                array[k++] = nums1[i];
            }
        }
        
        else{
            for(;i<nums1.length && j<nums2.length;){
                if(nums1[i]<nums2[j]){
                    array[k++] = nums1[i];
                    i++;
                }else{
                    array[k++] = nums2[j];
                    j++;
                }
            }
            
            while(i!=nums1.length){
                array[k++] = nums1[i++];
            }
            
            while(j!=nums2.length){
                System.out.println(nums2[j]);
                array[k++] = nums2[j];
                j++;
            }
        }

        System.out.println(Arrays.toString(array));
        if(array.length%2==1){
            return (double) array[array.length/2];
        }
        else{
            int n1 = array[array.length/2];
            int n2 = array[(array.length/2)-1];
            System.out.println(n1 + "" + n2);
            return ((double) (n1+n2)/2.0);
        }
    }
}

//combine the two arrays into 1
// find the median