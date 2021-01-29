public class Wall
{
    private double width;
    private double height;
    private double Area;

    public Wall() {
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if (width<0){
            setWidth(0);
        }
        if (height<0){
            setHeight(0);
        }
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        Area=getHeight()*getWidth();
        return Area;
    }
}

