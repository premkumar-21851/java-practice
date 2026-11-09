class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int total = 0;
        int clockwise = 0;

        for(int i = 0; i < distance.length; i++)
        {
            total += distance[i];
        }

        int min = Math.min(start, destination);
        int max = Math.max(start, destination);

        for(int i = min; i < max; i++)
        {
            clockwise += distance[i];
        }

        int counterClockwise = total - clockwise;

        return Math.min(clockwise, counterClockwise);
    }
}