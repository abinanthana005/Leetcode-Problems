class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length;
        boolean[] isFriend = new boolean[n + 1];
        for (int friendId : friends) {
            isFriend[friendId] = true;
        }
        int[] result = new int[friends.length];
        int index = 0;
        for (int id : order) {
            if (isFriend[id]) {
                result[index++] = id;
            }
        }
        
        return result;
    }
}
