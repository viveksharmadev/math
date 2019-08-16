// https://leetcode.com/problems/armstrong-number/
class armstrong-number {
    // tc -> n, sc-> n
    public boolean isArmstrong(int N) {
        String str = String.valueOf(N);
        int len = str.length();
        int sum = 0;
        for(int i=0; i<len; i++){
            int num = str.charAt(i)-'0';
            sum += Math.pow(num,len);
        }
        return sum==N;
    }
}
