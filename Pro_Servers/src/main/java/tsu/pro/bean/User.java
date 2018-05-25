package tsu.pro.bean;

import java.util.Collection;
import java.util.List;

public class User<T> {
	private int Id;
	private String Name;
	private String Password;
	private String Email;
	private String Phone;
	private List<T> Per;
	private String status;
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public List<T> getPer() {
		return Per;
	}

	public void setPer(List<T> per) {
		Per = per;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public static Collection<? extends User> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", Password=" + Password + ", Email=" + Email + ", Phone=" + Phone
				+ ", Per=" + Per + ", status=" + status + "]";
	}



}
