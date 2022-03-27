package FullCourse.MergeMeetingTimes;

import java.util.*;

public class MergeMeetingTimes {

    public List<Meeting> mergeRanges(List<Meeting> meetingTimes) {
        List<Meeting> sortedMeeting = new ArrayList<>();

        for (Meeting meeting : meetingTimes) {
            sortedMeeting.add(new Meeting(meeting.getStartTime(), meeting.getEndTime()));
        }

        Collections.sort(sortedMeeting, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        List<Meeting> mergedMeetingList = new ArrayList<>();
        mergedMeetingList.add(sortedMeeting.get(0));

        for (Meeting currentMeeting : sortedMeeting) {
            Meeting prevMeeting = mergedMeetingList.get(mergedMeetingList.size() - 1);
            if (currentMeeting.getStartTime() <= prevMeeting.getEndTime()) {
                prevMeeting.setEndTime(Math.max(currentMeeting.getEndTime(), prevMeeting.getEndTime()));
            }
            else {
                mergedMeetingList.add(currentMeeting);
            }
        }

        return mergedMeetingList;
    }

    public static void main(String[] args) {
        List<Meeting> m = new ArrayList<>();
        m.add(new Meeting(0, 1));
        m.add(new Meeting(3, 5));
        m.add(new Meeting(4, 8));
        m.add(new Meeting(10, 12));
        m.add(new Meeting(9, 10));

        MergeMeetingTimes mmt = new MergeMeetingTimes();
        System.out.println(mmt.mergeRanges(m));
    }
}

