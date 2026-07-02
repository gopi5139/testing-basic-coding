package basic_programs;

public class Student {
	public int rollNumber;
	public String name;
	public int eng;
	public int hin;
	public int mat;
	public int sci, soc,tel,total;
	public  int[] arr;
	public Student(int rollNumber,String name,int eng,int hin,int mat,int sci, int soc, int tel){
		this.rollNumber = rollNumber;
		this.name = name;
		this.eng = eng;
		this.hin = hin;
		this.mat = mat;
		this.sci = sci;
		this.soc = soc;
		this.tel = tel;
		//int total = eng+hin+mat+sci+soc+tel;
	}

	public static void calculateResult(int rollNumber){
		Student[] arr = new Student[3];
		arr[0] = new Student(01,"RAVI",40,50,60,45,56,76);
		arr[1] = new Student(02,"RAJU",50,80,80,65,46,26);
		arr[2] = new Student(03,"RANI",60,40,70,85,96,66);

		for(int i=0;i<arr.length;i++){
			if(arr[i].rollNumber==rollNumber){
				int total = arr[i].tel+arr[i].eng+arr[i].hin+arr[i].mat+arr[i].sci+arr[i].soc;
				System.out.println("RollNumber: "+arr[i].rollNumber+" "+"\t"+"Name: "+arr[i].name);
				System.out.println();
				if(arr[i].tel>=35){
					System.out.println("Telugu \t\t"+arr[i].tel+"  PASS");
				}else{
					System.out.println("Telugu \t\t"+arr[i].tel+"  FAIL");
				}

				if(arr[i].eng>=35){
					System.out.println("English \t"+arr[i].eng+"  PASS");
				}else{
					System.out.println("English \t"+arr[i].eng+"  FAIL");
				}

				if(arr[i].hin>=35){
					System.out.println("Hindi \t\t"+arr[i].hin+"  PASS");
				}else{
					System.out.println("Hindi \t\t"+arr[i].hin+"  FAIL");
				}

				if(arr[i].mat>=35){
					System.out.println("Maths \t\t"+arr[i].mat+"  PASS");
				}else{
					System.out.println("Maths \t\t"+arr[i].mat+"  FAIL");
				}

				if(arr[i].sci>=35){
					System.out.println("Science \t"+arr[i].sci+"  PASS");
				}else{
					System.out.println("Science \t"+arr[i].sci+"  FAIL");
				}

				if(arr[i].soc>=35){
					System.out.println("Social \t\t"+arr[i].soc+"  PASS");
				}else{
					System.out.println("Social \t\t"+arr[i].soc+"  FAIL");
				}

				if(arr[i].tel>=35&&arr[i].eng>=35&&arr[i].hin>=35&&arr[i].mat>=35&&arr[i].sci>=35&&arr[i].soc>=35&&total>=210){
					System.out.println("Total \t\t"+total+"  PASS");
				}else{
					System.out.println("Total \t\t"+total+"  FAIL");
				}
			}
		}
	}
}
