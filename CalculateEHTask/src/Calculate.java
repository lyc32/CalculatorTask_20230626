package corejava9.CalculateEHTask.src;

public class Calculate implements CalculateAbstract
{
    private int num1;
    private int num2;
    private String operator;

    public Calculate(int num1, int num2, String operator)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    @Override
    public void getAnswer()
    {
        switch (this.operator)
        {
            case "+": this.add();break;
            case "-": this.minus();break;
            case "*": this.times();break;
            case "/": this.div();break;
            case "%": this.mod();break;
        }
    }

    @Override
    public void add()
    {
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }

    @Override
    public void minus()
    {
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
    }

    @Override
    public void times()
    {
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
    }

    @Override
    public void div()
    {
        try
        {
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }

    @Override
    public void mod()
    {
        try
        {
            System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
