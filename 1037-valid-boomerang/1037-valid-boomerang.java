class Solution {
    public boolean isBoomerang(int[][] points) {
        long r1=(points[1][0]-points[0][0])*(points[2][1]-points[0][1]);
        long r2=(points[1][1]-points[0][1])*(points[2][0]-points[0][0]);
        return r1!=r2;
    }
}
