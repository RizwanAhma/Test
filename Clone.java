class Ozair implements Shubham{
	int roll_no;
	String Name;
	
	Ozair(int roll_no, String Name){
		this.roll_no= roll_no;
		this.Name= Name; 
	}
	public object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[]args){
		try{
			Ozair Oz= new Ozair(101, "Khan");
			Ozair oz1= (Ozair)Oz.clone();
			
			System.out.println(Oz.roll_no+"  "+Oz.Name);
			System.out.println(Oz1.roll_no+"  "+Oz1.Name);
		}
		catch(CloneNotSupportedException e){
			
		}
	}
}