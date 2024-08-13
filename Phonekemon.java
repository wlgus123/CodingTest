import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length / 2;
        HashSet<Integer> pkm = new HashSet<>();

        for (int n : nums)
            pkm.add(n);

        if (pkm.size() >= size)
            answer = size;
        else
            answer = pkm.size();

        return answer;
    }
}

class Phonekemon {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3,1,2,3};
        System.out.println(s.solution(nums));   // 2
	}
}