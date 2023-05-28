package homewrok_week4;

public class Program16_Point {


    public static void main(String[] args) {
        Program16_Point first = new Program16_Point(6, 5);
        Program16_Point second = new Program16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Program16_Point point = new Program16_Point();
        System.out.println("distance()= " + point.distance());
    }

    private int x;
    private int y;

    public Program16_Point() {
    }

    public Program16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Program16_Point another) {
        return distance(another.getX(), another.getY());
    }

    public double distance(int x, int y) {
        return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}