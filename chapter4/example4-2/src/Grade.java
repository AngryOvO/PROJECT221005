public class Grade
{
    int grade_1;
    int grade_2;
    int grade_3;

    float avg;

    public Grade()
    {
    }

    public Grade(int x, int y, int z)
    {
        this.grade_1 = x;
        this.grade_2 = y;
        this.grade_3 = z;
    }

    public float average()
    {
        return this.avg = (float)(grade_1 + grade_3 + grade_2) / 3;
    }
}
