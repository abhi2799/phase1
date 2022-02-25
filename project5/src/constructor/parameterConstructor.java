package constructor;
class Student{
	int id;
	String name;

	Student(int i,String n)
	{
	id = i;
	name=n;
	}

	void display() {
	System.out.println( id + "->" +name);
	}
}
public class parameterConstructor {

	public static void main(String[] args) {

		Student std1=new Student(20,"Anhar");
		Student std2=new Student(45,"Madhu");
		std1.display();
		std2.display();
			}
	}



