package point;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    private float[] XYZ = new float[3];

    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        this.XYZ[0] = super.x;
        this.XYZ[1] = super.y;
        this.XYZ[2] = this.z;
        return XYZ;
    }

    public void setXYZ(float x, float y, float z) {
        super.x = x;
        super.y = y;
        this.z = z;
    }
    @Override
    public String toString(){
        return Arrays.toString(this.XYZ);
    }
}
class TestPoint3D{
    public static void main(String[] args) {
        Point3D b = new Point3D();
        b.setXYZ(5,6,6);
        b.setY(8);
        System.out.println(b.toString());
    }
}
