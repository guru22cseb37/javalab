import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter X coordinate for Point2D: ");
            float x2D = scanner.nextFloat();
            System.out.print("Enter Y coordinate for Point2D: ");
            float y2D = scanner.nextFloat();
            Point2D point2D = new Point2D(x2D, y2D);
            System.out.println("Point2D: " + point2D);
            System.out.print("Enter X coordinate for Point3D: ");
            float x3D = scanner.nextFloat();
            System.out.print("Enter Y coordinate for Point3D: ");
            float y3D = scanner.nextFloat();
            System.out.print("Enter Z coordinate for Point3D: ");
            float z3D = scanner.nextFloat();
            Point3D point3D = new Point3D(x3D, y3D, z3D);
            System.out.println("Point3D: " + point3D);
        
    }
}  
class Point2D {
    private float x;
    private float y;
    public Point2D() {
    }
    public Point2D(float x, float y) {
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
        return new float[]{x, y};
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
class Point3D extends Point2D {
    private float z;

    public Point3D() {
        super();
        z = 0.0f;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    @Override
    public float[] getXY() {
        return new float[]{getX(), getY(), z};
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}