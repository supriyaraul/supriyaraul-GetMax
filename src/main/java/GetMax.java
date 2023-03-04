public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int largest = 0;
        int k = 0;

        for (int i =0; i < arr.length; i++){
            k = i;
            if(arr.length == k+1){
                if (arr[k] > arr[k-1])
                largest = arr[i];
            }else{
                if (arr[k] > arr[k+1])
                largest = arr[i];
            }
            
            
        }   
        return largest;
    }
}
