package NewJava;

import java.time.LocalDate;

public class Declaration {
	private int phoneno;
	private String name;
	private String email;
	private LocalDate date;
	
	
	//---------------------------------------------------------------------------------
	// constructor calling 
	
	
	 Declaration(int phoneno, String name, String email, LocalDate date) {
		
		this.phoneno = phoneno;
		this.name = name;
		this.email = email;
		this.date = date;
	
	}
	
	//-----------------------------------------------------------------------------------
	// getters and setters calling 
	
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
//	public String getPassward() {
//		return passward;
//	}
//	public void setPassward(String passward) {
//		this.passward = passward;
//	}
//	
	//-----------------------------------------------------------------------------
// equals method callingh
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Declaration)
		{
			Declaration anotherDec=(Declaration)o;
			return this.name.equals(anotherDec.name)&&this.date.equals(anotherDec.date);
		}
		else {
		return false;
		}
	}
//--------------------------------------------------------------------------------
	//hash method calling
	
	public int HashCode()
	{
		int result=this.name.hashCode()+this.date.hashCode();
		return result;
	}
	
	
	
}
