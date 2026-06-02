
class Solution {
    public String removeOccurrences(String s, String part) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            stack.push(ch);

            if (stack.size() >= part.length()) {

                boolean match = true;

                for (int i = 0; i < part.length(); i++) {
                    if (stack.get(stack.size() - part.length() + i)
                            != part.charAt(i)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    for (int i = 0; i < part.length(); i++) {
                        stack.pop();
                    }
                }
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : stack) {
            ans.append(ch);
        }

        return ans.toString();
    }
}