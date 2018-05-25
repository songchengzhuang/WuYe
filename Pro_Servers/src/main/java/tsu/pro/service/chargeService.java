package tsu.pro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsu.pro.bean.Charge;
import tsu.pro.bean.Info;
import tsu.pro.bean.Charge;
import tsu.pro.bean.Stuts;
import tsu.pro.mapper.ChargeMapper;

@Service
public class chargeService {
@Autowired
  private  ChargeMapper chargeMapper;
	public Stuts insertCharge(Charge Charge) {
		Stuts st=new Stuts();
		int status=chargeMapper.insert(Charge);
		if(status==1){
			st.setStuts("ok");
			st.setMessage("插入成功");
			return st;
			
		}
		else{
			st.setStuts("error");
			st.setMessage("插入失败");
			return st;
		}
		
	
	}

	public Info<Charge> selectById(int ChargeID) {
		Info<Charge> info=new Info<Charge>();
		 Charge Charge=new Charge();
		 Charge=chargeMapper.selectId(ChargeID);
		 if(Charge!=null){
			info.setT(Charge);
			info.setMesage("查询成功");
			info.setStatus("ok");
			return info;
		 }
		 else{
			 info.setMesage("查询失败");
				info.setStatus("error");
				return info;
		 }
	
		
	}

	public Info<Charge> findList() {
		Info<Charge> info=new Info<Charge>();
		List<Charge> list=new ArrayList<Charge>();
		list=chargeMapper.selectlist();
		if(!list.isEmpty()){
			info.setInfos(list);
			info.setStatus("ok");
			info.setMesage("成功");
			return info;
		}
		else{
			info.setStatus("error");
			info.setMesage("失败");
			return info;
		}
	}

	public Info<Charge> findLike(int ownerID) {
		Info<Charge> info=new Info<Charge>();
		List<Charge> list=new ArrayList<Charge>();
		list=chargeMapper.selectlike(ownerID);
		if(list.isEmpty()){
			info.setInfos(list);
			info.setStatus("ok");
			info.setMesage("成功");
			return info;
		}
		else{
			info.setStatus("error");
			info.setMesage("失败");
			return info;
		}
	}

	public Stuts deleteByID(int ChargeID) {
		Stuts st=new Stuts();
		int status=chargeMapper.delete(ChargeID);
		if(status==1){
			st.setStuts("ok");
			st.setMessage("插入成功");
			return st;
			
		}
		else{
			st.setStuts("error");
			st.setMessage("插入失败");
			return st;
		}
		
	
	}

	public Stuts update(Charge Charge) {
		Stuts st=new Stuts();
		int status=chargeMapper.update(Charge);
		if(status==1){
			st.setStuts("ok");
			st.setMessage("更新成功");
			return st;
			
		}
		else{
			st.setStuts("error");
			st.setMessage("更新失败");
			return st;
		}
		
	}

}
