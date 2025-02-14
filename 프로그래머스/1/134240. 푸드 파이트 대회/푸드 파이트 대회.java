class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1;i<food.length;i++){
            int n = food[i] / 2;
            answer += String.valueOf(i).repeat(n);
        }
        StringBuffer nr = new StringBuffer(answer);
        String reverse = String.valueOf(nr.reverse());
        answer = answer + "0" + reverse;
        
        return answer;
    }
}