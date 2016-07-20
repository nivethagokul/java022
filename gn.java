public class largestno {

	public static void main(String[] args) {
		int x;
		int y;
		int z;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		z=Integer.parseInt(args[2]);
		if(x>y&&x>z)
		{
			System.out.println("x is larger");
		}
		
	else if(y>z)
	{
		System.out.println("y is larger");

}
	else
	{
		System.out.println("z is larger");
}
	}
}