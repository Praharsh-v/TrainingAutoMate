public class Point
{
    int x,y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public double distance() {
        double distance = Math.sqrt((this.x) * (this.x) + (this.y) * (this.y));
        return distance;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));

        return distance;
    }

    public int distance(Point second) {
        double distance = Math.sqrt((this.x - second.x) * (this.x - second.x) + (this.y - second.y) * (this.y - second.y));
        return (int) distance;
    }
}
