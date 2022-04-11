public class FloorOfaNo {
        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 9, 14, 16, 18};
            int target = 15;
            int ans = floor(arr,target);
            System.out.println(ans);
        }

        // return the index  //return -1 if it does not exist
        static int floor(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                //find middle element
//            int mid = (start + end ) /2; // might be possible that (start + end) mid exceed the range of integer
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    // ans found
                    return mid;
                }
            }
            return end;
        }
    }


