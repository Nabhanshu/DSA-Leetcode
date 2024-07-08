class Solution {

    public void func(int idx, int n, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {

        if (idx == n) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (target >= candidates[idx]) {

            ds.add(candidates[idx]);
            func(idx, n, candidates, target - candidates[idx], ans, ds);
            ds.remove(ds.size() - 1);
        }

        func(idx + 1, n, candidates, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        func(0, n, candidates, target, ans, new ArrayList<>());
        return ans;

    }
}