package point;

public class Point2D {
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
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY() {
        float[] arrayXY = {x, y};
        return arrayXY;
    }
}
