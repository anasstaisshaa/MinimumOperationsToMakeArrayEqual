class Solution {
    public static void main(String[] args) {
        System.out.println(minOperations(3));
    }
    public static int minOperations(int n) {
        int answer = 0;
        for (int i = 0; i < n / 2; i++) {
            int x = 2 * i + 1;
            answer += (n - x);
        }
        return answer;
    }
}