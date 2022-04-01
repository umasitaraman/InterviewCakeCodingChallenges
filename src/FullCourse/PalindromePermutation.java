package FullCourse;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {
    public boolean isPalindromePermutation(String str) {
        Set<Character> isVisited = new HashSet<>();

        for(char c : str.toCharArray()) {
            if(isVisited.contains(c)) {
                isVisited.remove(c);
            } else {
                isVisited.add(c);
            }
        }
        return isVisited.size() <= 1;
    }

    public static void main(String[] args) {
        String str = "civil";
        PalindromePermutation pp = new PalindromePermutation();
        System.out.println(pp.isPalindromePermutation(str));
    }
}
