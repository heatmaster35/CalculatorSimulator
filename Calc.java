//###########################
//# Name: Leo Gomez         #
//# CruzID: legomez         #
//# Class: CMPS-12M         #
//# Date: Oct 27, 2014      #
//# filename: Calc.java     #
//# Details:Holds methods to#
//#  use as a RPN calcu...  #
//###########################
//

public class Calc
{
	private int size;
	private int top;
	private double[] stack;

	public Calc()
	{
		size = 100;
		stack = new double[size];
		top = -1;
	}
	
	public void push(double num)
	{
		top++;
		stack[top] = num;
	}

	public double pop()
	{
		if(top < 0)
			throw new RuntimeException();
		else
		{
		double temp = stack[top];
		top--;
		return temp;
		}
	}

	public double peek()
	{
		if(top < 0)
			throw new RuntimeException();
                else
			return stack[top];
	}

	public void add()
	{
              if(top < 0)
                        throw new RuntimeException();
                else
		{
		stack[top - 1] = stack[top - 1] + stack[top];
		top--;
		}
	}

	public void subtract()
	{
              if(top < 0)
                        throw new RuntimeException();
                else
		{
		stack[top - 1] = stack[top - 1] - stack[top];
		top--;
		}
	}

	public void multiply()
	{
              if(top < 0)
                        throw new RuntimeException();
                else
		{
		stack[top - 1] = stack[top - 1]*stack[top];
		top--;
		}
	}

	public void divide()
	{
              if(top < 0)
                        throw new RuntimeException();
                else
		{
		stack[top - 1] = stack[top - 1]/stack[top];
		top--;
		}
	}

	public int depth()
	{
		return top + 1;
	}

	public void reciprocal()
	{
             if(top < 0)
                        throw new RuntimeException();
                else
		{
		double temp =1/stack[top];
		stack[top] = temp;
		}
	}
}
