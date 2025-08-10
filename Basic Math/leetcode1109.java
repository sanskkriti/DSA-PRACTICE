//https://leetcode.com/problems/corporate-flight-bookings/

class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n + 1]; // difference array

        for (int i = 0; i < bookings.length; i++) {
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seats = bookings[i][2];

            diff[first - 1] += seats;  // shift to 0-index
            if (last < n) {
                diff[last] -= seats;   // remove after last flight
            }
        }

        int[] answer = new int[n];
        answer[0] = diff[0];
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + diff[i];
        }

        return answer;
    }
}
