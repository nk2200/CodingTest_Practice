import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        //alphabet 배열 생성
        char [] alphabet = new char[26];
        for(int i=0;i<alphabet.length;i++){
            alphabet[i] = (char) ('a' + i);
        }
        //skip을 제외한 new_alphabet 배열 List로 생성
        List<Character> new_alphabet = new ArrayList<>();
        for(int i=0;i<alphabet.length;i++){
            if(skip.indexOf(alphabet[i])==-1){
                new_alphabet.add(alphabet[i]);
            }
        }
        //s 문자열 변환
        for(int i=0;i<s.length();i++){
            for(int j=0;j<new_alphabet.size();j++){
                if(s.charAt(i)==new_alphabet.get(j)){
                    answer += new_alphabet.get((j+index)%new_alphabet.size());
                }
            }
        }
        
        System.out.println(new_alphabet);
        
        return answer;
    }
}