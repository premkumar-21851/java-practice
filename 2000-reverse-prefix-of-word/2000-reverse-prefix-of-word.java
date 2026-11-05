class Solution {
    public String reversePrefix(String word, char ch) {

        int index = -1;

        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == ch)
            {
                index = i;
                break;
            }
        }

        if(index == -1)
        {
            return word;
        }

        char[] rev = word.toCharArray();

        for(int i = 0; i <= index; i++)
        {
            rev[i] = word.charAt(index-i);
        }

        return new String(rev);
    }
}