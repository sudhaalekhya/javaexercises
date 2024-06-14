package inheritance;
class Furniture
{
	public void legs()
	{
		System.out.println("fur has 4 or 3 legs");
	}
	protected void seaters()
	{
		System.out.println("3 or 2 seaters");
	}
	private void types()
	{
		System.out.println("Plastic or wooden");
	}
}
class Chair extends Furniture
{
	public void isFoldable()
	{
		System.out.println("yes");
	}
}
public class Single3 {

	public static void main(String[] args) {
		//Chair c = new Chair();
				//Furniture c=new Furniture();
				//Furniture c = new Chair();
				Chair c=(Chair)new Furniture();//stops compile time error
				c.seaters();
				c.legs();
				//c.types()//not accessible-private
				c.isFoldable();//not accessible by base class
	}

}
