/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    int countMax = 0;
    
    private int findSum(TreeNode node){
        if(node==null)
            return 0;
        
        int sum = node.val;
        
        if(node.left!=null)
            sum += findSum(node.left);
        
        if(node.right!=null)
            sum += findSum(node.right);
        
        int count = map.getOrDefault(sum,0)+1;
        map.put(sum,count);
        countMax = Math.max(count,countMax);
        
        return sum;
        
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root==null){
            return new int[]{};
        }
        
        findSum(root);
        ArrayList<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==countMax){
                l.add(entry.getKey());
            }
        }
        
        int[] res = new int[l.size()];
        for(int i = 0 ; i<l.size(); i++){
            res[i] = l.get(i);
        }
        
        return res;
    }
}

/*

Intuition:

store the subarray sums and their occurences in a Hashmap and update countMax

Traverse the map and for those keys having values == countMax add the keys to the array


*/