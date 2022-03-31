package FullCourse;

import java.util.HashSet;
import java.util.Set;

public class InFlightEntertainmentSystem {
    public boolean moviePair (int[] movieTimes , int flightLength) {
        Set<Integer> moviesSeen = new HashSet<>();
        for (int firstMovie : movieTimes) {
            int secondMovie = flightLength - firstMovie;
            if(moviesSeen.contains(secondMovie)) {
                return true;
            }
            moviesSeen.add(firstMovie);
        }
        return false;
    }

//    public static void main(String[] args) {
//        InFlightEntertainmentSystem ifes = new InFlightEntertainmentSystem();
//        System.out.println(ifes.moviePair());
//    }
}
