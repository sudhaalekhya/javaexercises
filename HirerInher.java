package inheritance;
class House
{
	public void type() 
	{
		System.out.println("Appartment/villa");
	}
}
class Appartment extends House
{
	public void lift() {
		System.out.println("Available");
	}
}
class Villa extends House
{
	public void sqft() {
		System.out.println("yes");
	}
}
public class HirerInher {

	public static void main(String[] args) {
		Appartment a=new Appartment();
	       a.type();
	       a.lift();
	       Villa v=new Villa();
	       v.type();
	       v.sqft();
	}

}
