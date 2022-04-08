public class FindRotationPoint {
    public static int findRotationPoint(String[] words) {
        if(words.length == 1) {
            return 0;
        }

        if(words.length == 2) {
            return 1;
        }
        int current = 0;
        while(words[current].charAt(0) <= words[current + 1].charAt(0)) {
            current++;
        }
        return current + 1;
    }
}
