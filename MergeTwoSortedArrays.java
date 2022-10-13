// Brute force approach
//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        long[] arr = new long[n+m];
        for (int i=0; i<n; i++) {
            arr[i] = arr1[i];
        }
        for (int i=0, j=n; (i<m && j<n+m); j++,i++) {
            arr[j] = arr2[i];
        }
        for (int i = 0; i < n+m; i++) {
            for (int j = i+1; j<n+m; j++) {
                if (arr[i] > arr[j]) {
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i<n) {
                arr1[i] = arr[i];
            }
            else if (i<n+m) {
                arr2[i-n] = arr[i];
            }
        }
        
    }
}
