class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String p = String.valueOf(a) + String.valueOf(b);
        int x = Integer.parseInt(p);
        int y = 2*a*b;
        if(x>y){
            answer = x;
        }else if(x==y){
            answer = x;
        }else{
            answer = y;
        }
        return answer;
        }
}