// import java.util.HashMap;
// class Solution {
//     public int strStr(String haystack, String needle) {
//         Map<String, Integer> wordList = new HashMap<String, Integer>();
//         String substr;

//         for (int i = 0; i + needle.length() < haystack.length() + 1; i++) {
//             substr = haystack.substring(i, i+needle.length());
//             if (wordList.get(substr) == null) {wordList.put(substr, i);}
//         }
//         int result = (wordList.get(needle) == null) ? -1 : wordList.get(needle);
//         return result;
//     }
// }

class Solution {
    public int strStr(String haystack, String needle) {
        String substr;

        for (int i = 0; i + needle.length() < haystack.length() + 1; i++) {
            substr = haystack.substring(i, i+needle.length());
            if (substr.equals(needle)) {return i;}
        }
        return -1;
    }
}