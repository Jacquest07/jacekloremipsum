package pl.akademiakodu.loremipsum.Generator;

/**
 * Created by Eriot on 2017-09-01.
 */
public class Form
{
    private int number;
    private int option;

    public Form(int number, int option)
    {
        this.number = number;
        this.option = option;
    }

    public Form()
    {
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getOption()
    {
        return option;
    }

    public void setOption(int option)
    {
        this.option = option;
    }
}
