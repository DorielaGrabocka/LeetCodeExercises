package rectangleArea;
import java.lang.*;
public class RectangleArea {
    public static void main(String[] args) {
        System.out.println(computeArea(-2, -2, 2, 2, -1,-1, 1, 1));
    }

    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        int area1 = computeRectangleArea(ax1, ay1, ax2, ay2);
        int area2 = computeRectangleArea(bx1, by1, bx2, by2);
        int commonArea = computeCommonArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);

        return area1+area2-commonArea;
    }

    public static int computeRectangleArea(int ax1, int ay1, int ax2, int ay2){
        return (ax2-ax1)*(ay2-ay1);
    }
    public static int computeCommonArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int xComp = 0;
        int yComp = 0;

        //cases where there is no overlap vertically or horizontally
        if((ax1<bx1 && ax2<bx1) || (bx1<ax1 & bx2 <ax1)) return 0;
        if((ay1<by1 && ay2<by1) || (by1<ay1 & by2 <ay1)) return 0;

        //if(ax1==bx1 && ay1==by1 && ax2==bx2 && ay2==by2 ) return computeRectangleArea(ax1, ay1, ax2, ay2);

        // cases where there is overlap on the x-axis
        if ((ax1 <= bx1) && (ax2 >= bx1)){
            if ( ax2<=bx2)  xComp = Math.abs(ax2-bx1); // there is overlap
            else xComp = Math.abs(bx2 - bx1); // b is contained in a
        }
        else if ((bx1 <= ax1) && (bx2 >= ax1)){
            if(bx2<=ax2){ xComp = Math.abs(bx2-ax1);} //there is overlap
            else xComp = Math.abs(ax2- ax1); // a is contained in b
        }

        //cases where there is overlap on the y-axis
        if ((ay1 <= by1) && (ay2 >= by1)){
            if ( ay2<=by2)  yComp = Math.abs(ay2 - by1); // there is overlap
            else yComp = Math.abs(by2 - by1); // b is contained in a
        }
        else if ((by1 <= ay1) && (by2 >= ay1)){
            if(by2<=ay2){ yComp = Math.abs(by2 -ay1);} //there is overlap
            else yComp = Math.abs(ay2 - ay1); // a is contained in b
        }


        return xComp*yComp;
    }
}
