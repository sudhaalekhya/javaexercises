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
public class SingleInher {

	public static void main(String[] args) {
		Chair c = new Chair();
		c.seaters();
		c.legs();
		//c.types()//not accessible-private
		c.isFoldable();

	}

}
