class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for (int i=0;i<code.length();i++){
            System.out.println(i+"/"+(i%q));
            if(i%q == r){
                answer = answer + code.charAt(i);    
            }
            
        }
        return answer;
    }
}