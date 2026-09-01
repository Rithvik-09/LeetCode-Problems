import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");

        String str[] = paragraph.split("\\s+");

        HashMap<String, Integer> hm = new HashMap<>();
        Set<String> ban = new HashSet<>();

        for (String b : banned) {
            ban.add(b.toLowerCase());
        }

        for (String s : str) {
            if (!ban.contains(s)) {
                hm.put(s, hm.getOrDefault(s, 0) + 1);
            }
        }

        String answer = "";

        for (String word : hm.keySet()) {
            if (answer.equals("") || hm.get(word) > hm.get(answer)) {
                answer = word;
            }
        }

        return answer;
    }
}