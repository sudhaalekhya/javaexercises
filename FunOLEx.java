package polymorphism;
class Operations
{
	public void add(int a)
	{
		a++;
		System.out.println(a);
	}
	public int add(float a)
	{
		a++;
		return (int)a;
	}
	public void concat(char c,int a)
	{
		System.out.println(c+a);
	}
	public void concat(int a,char c)
	{
		System.out.println(c+a);
	}
}

public class FunOLEx {

	public static void main(String[] args) {
		Operations op=new Operations();
		op.add(9);
		System.out.println(op.add(8.9f));
		op.concat('a', 9);
		op.concat(8,'j');

	}

}
