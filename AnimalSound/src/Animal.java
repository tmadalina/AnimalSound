public class Animal 
{
	protected String name;
	
	public void makeSound() 
	{
		System.out.println("Animals makes sound");
	};

	public static void main(String[] args)
	{
		Animal[] animals = new Animal[4];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Cow();
		animals[3] = new Lion();

		for (int i = 0; i < animals.length; i++) 
		{
			animals[i].makeSound();
			System.out.println();
		}
	}
}
