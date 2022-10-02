public class Rectangle
{
    int x;
    int y;
    int width;
    int height;
    int square;

    public Rectangle()
    {

    }

    public Rectangle(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square()
    {
        return this.square = width * height;
    }

    public void show()
    {
        System.out.printf("(%d,%d)에서 면적이 %dx%d인 사각형\n",this.x, this.y, this.width,this.height);
    }

    public boolean contains(Rectangle r)
    {
        if(x + width > r.x + r.width && y+height > r.y + r.height)
            return true;
        else
            return false;
    }
}
