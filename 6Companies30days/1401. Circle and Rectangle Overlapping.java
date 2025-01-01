class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xaxis=Math.max(x1,Math.min(x2,xCenter));
        int yaxis=Math.max(y1,Math.min(y2,yCenter));
        int xdistance=xCenter-xaxis;
        int ydistance=yCenter-yaxis;
        if(xdistance*xdistance+ydistance*ydistance<=radius*radius)
        {
            return true;
        }
        return false;
    }
}
