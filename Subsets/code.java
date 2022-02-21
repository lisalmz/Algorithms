class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList());
        
        for(int num:nums){
            List<List<Integer>> newSub = new ArrayList();
            
            for(List<Integer> curr:output){
                List<Integer> temp = new ArrayList(curr);
                temp.add(num);
                newSub.add(temp);
            }
            
            for(List<Integer> curr:newSub){
                output.add(curr);
            }
        }
        return output;
    }
}