//solution1
class Solution {
    public String reverseLeftWords(String s, int n) {
        int move = n % s.length();
        StringBuffer left = new StringBuffer();
        StringBuffer right = new StringBuffer();

        for(int i = 0; i < move; i++) {
            left.append(s.charAt(i));
        }
        for(int i = move; i < s.length(); i++) {
            right.append(s.charAt(i));
        }
        right.append(left);
        return right.toString();

    }
}

//solution2
class Solution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length()) + s.substring(0,n);

    }
}

//solution3
class Solution {
    public String reverseLeftWords(String s, int n) {
        int move = n % s.length();
        StringBuffer sb = new StringBuffer();
        for(int i = move; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for(int i = 0; i < move; i++) {
            sb.append(s.charAt(i));
        }

        return sb.toString();

    }
}
