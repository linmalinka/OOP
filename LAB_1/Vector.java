public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector getVector(){
        return new Vector(x, y, z);
    }

    public void setX(double newX){
        this.x = newX;
    }
    public void setY(double newY){
        this.y = newY;
    }
    public void setZ(double newZ){
        this.z = newZ;
    }
    public void setVector(Vector other) {
        this.x = other.x;
        this.y = other.y;
        this.z = other.z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double dotProduct(Vector other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector add(Vector other) {
        return new Vector(
            x + other.x,
            y + other.y,
            z + other.z
        );
    }

    public Vector subtract(Vector other) {
        return new Vector(
            x - other.x,
            y - other.y,
            z - other.z
        );
    }

    public double multiply(Vector other) {
        return x * other.x
             + y * other.y
             + z * other.z;
    }

    public Vector crossProduct(Vector other) {
    return new Vector(
        y * other.z - z * other.y,
        z * other.x - x * other.z,
        x * other.y - y * other.x
    );
    }
}

