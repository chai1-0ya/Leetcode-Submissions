class Solution {
    public String getHint(String secret, String guess) {
        int b = 0;
        int c = 0;
        int[] num = new int[10];
        for (int i = 0; i<secret.length(); i++) {
            int s = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            if (s == g) b++;
            else {
                if (num[s] < 0) c++;
                if (num[g] > 0) c++;
                num[s] ++;
                num[g] --;
            }
        }
        return b + "A" + c + "B";
    }
}