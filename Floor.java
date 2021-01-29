public class Floor
{
    private double width;
    private double length;
    public Floor(double width, double lenght) {
        this.width = width;
        this.length=lenght;
        if(width<0){
            width=0;
        }if(lenght<0) {
            lenght=0;
        }

        }
    public double getArea(){
        double area= width*length;
        return area;
    }
}
