package wtn;
class Patient
{
	String patientname;
	double weight,height;
	Patient(String patientname,double weight,double height)
	{
		this.patientname=patientname;
		this.weight=weight;
		this.height=height;
	}
	double computBmi()
	{
		double k=weight%(height*height);
		System.out.print(patientname);
		return k;
	}
}
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p=new Patient("P.Ajay Babu",58.5,6.5);
		System.out.println(" computeBmi is "+p.computBmi());
	}

}
