package tsu.pro.bean;

public class Permission {
private int Id;
private String per_Name;
private String per_Url;
private String per_meassage;
public int getId() {
	return Id;
}
public void setId(int i) {
	Id = i;
}
public String getPer_Name() {
	return per_Name;
}
public void setPer_Name(String per_Name) {
	this.per_Name = per_Name;
}
public String getPer_Url() {
	return per_Url;
}
public void setPer_Url(String per_Url) {
	this.per_Url = per_Url;
}
public String getPer_meassage() {
	return per_meassage;
}
public void setPer_meassage(String per_meassage) {
	this.per_meassage = per_meassage;
}

}
