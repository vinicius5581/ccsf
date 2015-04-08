public class FullName {
    String fname;
    String lname;
    char mname;
    public FullName(String fname, char mname, String lname){
    	this.fname = fname;
    	this.mname = mname;
    	this.lname = lname;
    }
    public FullName(){
    	this("",' ',"");
    } 
	public void setFirst(String fname){
		this.fname = fname;
	}
	public void setLast(String lname){
		this.lname = lname;
	}
	public void setMiddle(char cname){
		this.mname = cname;
	}
	public String toString(){
		return fname +" "+ mname +" "+ lname;
	}
	public String monogram(){
		return this.fname.charAt(0)+"."+this.mname+"."+this.lname.charAt(0)+".";
	}
	public boolean isEqual(FullName fullname){
		return true;
	}
}
