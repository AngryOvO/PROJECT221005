public class Point3D extends Point
{
    int z;
    public Point3D(int x, int y, int z)
    {
        super(x,y);
        this.z = z;
    }
    public void move(int x, int y, int z)
    {
        move(x,y);
        this.z = z;
    }

    public void moveUp() { this.z += 1; }
    public void moveDown() { this.z -= 1; }

    public String toString()
    {
        return "(" + getX() + "," + getY() + "," + this.z + ")의 점";
    }
}
