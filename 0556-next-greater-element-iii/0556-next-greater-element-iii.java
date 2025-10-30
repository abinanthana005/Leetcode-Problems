class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = Integer.toString(n).toCharArray();
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) return -1; 

        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        int left = i + 1, right = arr.length - 1;
        while (left < right) {
            char t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;
            left++;
            right--;
        }

        long ans = Long.parseLong(new String(arr));
        return (ans > Integer.MAX_VALUE) ? -1 : (int) ans;
    }
}