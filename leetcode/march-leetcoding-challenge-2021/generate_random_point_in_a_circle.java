class Solution {
    
    double r;
    double centerX;
    double centerY;

    public Solution(double radius, double x_center, double y_center) {
        this.r = radius;
        this.centerX = x_center;
        this.centerY = y_center;
    }
    
    public double[] randPoint() {
        double angle = Math.random() * 2 * Math.PI, hyp = Math.sqrt(Math.random()) * r, adj = Math.cos(angle) * hyp, opp = Math.sin(angle) * hyp;
        return new double[]{centerX + adj, centerY + opp};
    }
}

// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/590/week-3-march-15th-march-21st/3675/

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */

/* Initial solution
class Solution {
    
    double r;
    double theta;
    double centerX;
    double centerY;

    public Solution(double radius, double x_center, double y_center) {
        this.r = radius * Math.sqrt(new Random().nextDouble());
        this.theta = new Random().nextDouble() * 2 * Math.PI;
        this.centerX = x_center;
        this.centerY = y_center;
    }
    
    public double[] randPoint() {
        double[] randPoint = new double[2];
        randPoint[0] = centerX + r * Math.cos(theta);
        randPoint[1] = centerY + r * Math.sin(theta);
        return randPoint;
    }
}
*/