package FullCourse;

public class FindRotationPoint {

    public static int findRotationPoint(String[] words) {

        String firstWord = words[0];
        int l = 0, r = words.length - 1;
        int m = 0;
        while(l <= r) {
            m =  l + (r - l) / 2;
            System.out.println(words[m]);
            System.out.println(firstWord);
            System.out.println(words[m].compareTo(firstWord));
            if(words[m].compareTo(firstWord) >= 0) {
                l = m;
            } else {
                r = m;
            }
            if (l + 1 == r) {

                // between floor and ceiling is where we flipped to the beginning
                // so ceiling is alphabetically first
                break;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        String[] input = {
                "ptolemaic",
                "retrograde",
                "supplant",
                "undulate",
                "xenoepist",
                "asymptote",  // <-- rotates here!
                "babka",
                "banoffee",
                "engender",
                "karpatka",
                "othellolagkage"
        };
        System.out.println(findRotationPoint(input));
    }
}
