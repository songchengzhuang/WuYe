package tsu.pro.bean;

import java.util.List;

public class Info<T> {
   private String status;
   private String mesage;
	private List<T> infos;
    private T t;
    
  
	


	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public String getMesage() {
		return mesage;
	}
	public void setMesage(String mesage) {
		this.mesage = mesage;
	}
	public List<T> getInfos() {
		return infos;
	}
	public void setInfos(List<T> infos) {
		this.infos = infos;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
