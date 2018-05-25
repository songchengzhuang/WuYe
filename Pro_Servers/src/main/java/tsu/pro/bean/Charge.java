package tsu.pro.bean;

public class Charge {
	private int chargeID ;
	private String chargeTime;
	private String chargeName ;
	private String chargeMoney;
	private String ownerID ;
	private String chargeDel ;
	private String Update_Tm;
	public String getUpdate_Tm() {
		return Update_Tm;
	}
	public void setUpdate_Tm(String update_Tm) {
		Update_Tm = update_Tm;
	}
	public int getChargeID() {
		return chargeID;
	}
	public void setChargeID(int chargeID) {
		this.chargeID = chargeID;
	}
	public String getChargeTime() {
		return chargeTime;
	}
	public void setChargeTime(String chargeTime) {
		this.chargeTime = chargeTime;
	}
	public String getChargeName() {
		return chargeName;
	}
	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}
	public String getChargeMoney() {
		return chargeMoney;
	}
	public void setChargeMoney(String chargeMoney) {
		this.chargeMoney = chargeMoney;
	}
	public String getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}
	public String getChargeDel() {
		return chargeDel;
	}
	public void setChargeDel(String chargeDel) {
		this.chargeDel = chargeDel;
	}
	
}
