package tsu.pro.bean;

public class Owner {
	 private int ownerID;
	 private String ownerName ;
	 private String ownerTel ;
	 private String ownerInfo;
	 private String ownerDel ;
	 private String ownerCart ;
	 private String update_Tm;
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerTel() {
		return ownerTel;
	}
	public void setOwnerTel(String ownerTel) {
		this.ownerTel = ownerTel;
	}
	public String getOwnerInfo() {
		return ownerInfo;
	}
	public void setOwnerInfo(String ownerInfo) {
		this.ownerInfo = ownerInfo;
	}
	public String getOwnerDel() {
		return ownerDel;
	}
	public void setOwnerDel(String ownerDel) {
		this.ownerDel = ownerDel;
	}

	public String getOwnerCart() {
		return ownerCart;
	}
	public void setOwnerCart(String ownerCart) {
		this.ownerCart = ownerCart;
	}
	public String getUpdate_Tm() {
		return update_Tm;
	}
	public void setUpdate_Tm(String update_Tm) {
		this.update_Tm = update_Tm;
	}
	@Override
	public String toString() {
		return "Owner [ownerID=" + ownerID + ", ownerName=" + ownerName + ", ownerTel=" + ownerTel + ", ownerInfo="
				+ ownerInfo + ", ownerDel=" + ownerDel + ", ownerCart=" + ownerCart + ", update_Tm=" + update_Tm + "]";
	}
	

	
}
