public class Won2Dollar extends Converter
{
    int dallor;

    public Won2Dollar(int dallor)
    {
        this.dallor = dallor;
    }
    @Override
    protected double convert(double src)
    {
        return src/this.dallor;
    }

    @Override
    protected String getDestString()
    {
        return "달러";
    }

    @Override
    protected String getSrcString()
    {

        return "원";
    }
}
