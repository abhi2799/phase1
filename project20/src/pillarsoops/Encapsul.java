package pillarsoops;

class Encapsulate
{
	String Name;
	int id,age;
	int age()
	{
		return age;
	}
	String Name()
	{
		return Name;
	}
	int id()
	{
		return id;
	}
	public void setage(int newAge)
	{
		age = newAge;
	}
	public void setid(int newId)
	{
		id = newId;
	}
	public void setName(String newName)
	{
		Name = newName;
	}
	
}
public class Encapsul
{
	public static void main(String args[])
	{
		Encapsulate obj = new Encapsulate();
		obj.setage(23);
		obj.setName("Abhi");
		obj.setid(14);
		System.out.println("age:"+obj.age());
		System.out.println("Name:"+obj.Name());
		System.out.println("id:"+obj.id());
		
	}
}
	

