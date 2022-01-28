/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
     
        List<List<Integer>> answer = new ArrayList<>();
        
        Queue<Node> queue = new LinkedList<>();
        
        if(root == null){
            return answer;
        }
        
        queue.add(root);
    
        while(!queue.isEmpty()){
            
            int currentSize = queue.size();
            List<Integer> currentAns = new ArrayList<>();
            
            while(currentSize > 0){
                Node currentNode = queue.remove();
                currentAns.add(currentNode.val);
                
                for(Node node:currentNode.children){
                    queue.add(node);
                }
                    currentSize--;
            }
            
            answer.add(currentAns);
            
        }
        
        return answer;
        
        
    }
}
