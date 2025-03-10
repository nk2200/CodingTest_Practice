class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multip = 1;
        int sum = 0;
        for(int n : num_list){
            multip = multip * n;
            sum += n;
        }
        if(multip<Math.pow(sum,2)){
            answer = 1;
        }
        System.out.println(multip+", "+Math.pow(sum,2));
        return answer;
    }
}