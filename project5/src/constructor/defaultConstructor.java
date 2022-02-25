package constructor;
class EmpInfo{
	int id;
	double sal;
void display() {
	System.out.println(id+" "+sal);
	}
}
public class defaultConstructor {
	public static void main(String args[]) {

		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();
		EmpInfo emp3=new EmpInfo();
		emp1.id=45;
		emp2.id=46;
		emp3.id=47;
		emp1.sal=4567.19;
		emp2.sal=5720.04;
		emp3.sal=7594.20;
		
		emp1.display();
		emp2.display();
		emp3.display();
		}

		}



