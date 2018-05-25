package tsu.pro.bean;

public class Role {
   private int userroleID;
	public int getUserroleID() {
	return userroleID;
}
public void setUserroleID(int userroleID) {
	this.userroleID = userroleID;
}
	private int Id;
	private String roleName;
	private String Message;
	public int getId() {
		return Id;
	}
	public void setId(int i) {
		Id = i;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@Override
	public String toString() {
		return "Role [Id=" + Id + ", roleName=" + roleName + ", Message=" + Message + ", getId()=" + getId()
				+ ", getRoleName()=" + getRoleName() + ", getMessage()=" + getMessage() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
