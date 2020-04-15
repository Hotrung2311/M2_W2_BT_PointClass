package point;

import java.util.Arrays;

public class Point2D {
    protected float x = 0.0f;
    protected float y = 0.0f;
    private float[] XY = new float[2];

    public  Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return Arrays.toString(this.XY);
    }
}

class TestPoint2D{
    public static void main(String[] args) {

        Point2D a = new Point2D();
        a.setXY(5,6);
        a.setY(6);
        System.out.println(a.toString());
    }
}
