package pillarsoops;

abstract class Animal
{
	public abstract void animalSound();
	public void sleep()
	{
		System.out.println("Bbbb");
	}
}
class Dog extends Animal
{
	public void animalSound()
	{
		System.out.println("The Dog says: boo booo");
	}
}
public class abstr 
{
	public static void main(String args[])
	{
		Dog myDog = new Dog();
		myDog.animalSound();
		myDog.sleep();
	}
}
