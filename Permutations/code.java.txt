class Solution {
    List<List<Integer>> output = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> dt = new LinkedList<>();
        for(int num:nums){
            dt.add(num);
        }
        dfs(new LinkedList<>(),dt);
        return output;
    }
    
    private void dfs(List<Integer> permutation, List<Integer> dt){
        if(dt.size() == 0){
            output.add(permutation);
            return;
        }
        for(Integer num:dt){
            List<Integer> tempP = new LinkedList<> (permutation);
            List<Integer> tempDt = new LinkedList<> (dt);
            tempP.add(num);
            tempDt.remove(num);
            dfs(tempP,tempDt);
        }
    }
}