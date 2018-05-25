package tsu.pro.bean;

import java.util.List;

public class PerInfo<T> {
	private String status;
	private String message;
	private List<T> infos;
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<T> getInfos() {
		return infos;
	}
	public void setInfos(List<T> infos) {
		this.infos = infos;
	}
}
