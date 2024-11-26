class Solution {
    public String toHex(int num) {
        char[] chars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        if (num == 0) return "0";

        long n = num > 0 ? num : (1L << 32) + num;

        StringBuilder hex = new StringBuilder();
        while (n != 0) {
            hex.append(chars[(int)(n % 16)]);
            n /= 16;
        }
        return hex.reverse().toString();
    }
}