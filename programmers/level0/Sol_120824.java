package programmers.level0;

public class Sol_120824 {
    public int[] solution(int[] num_list) {

        int[] answer = new int[2];

        for (int num : num_list) {
            if (num % 2 == 0) answer[0]++;
            else answer[1]++;
        }

        return answer;
    }
}