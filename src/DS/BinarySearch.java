package DS;

public class BinarySearch {
    public static int binarySearch(int[] a, int key){
        int l = 0 ;
        int r = a.length-1 ;

        while(l<=r){
            int mid = (l + r)/2;

            if(a[mid] == key){
                return mid;
            } else if (key> a[mid]) {
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int a[] = {1,2,5,7,8,9};
        int key = 2;
       System.out.println(binarySearch(a , key));
    }
}
