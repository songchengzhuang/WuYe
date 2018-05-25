package tsu.pro.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsu.pro.bean.Info;
import tsu.pro.bean.Owner;
import tsu.pro.bean.Stuts;
import tsu.pro.mapper.ownerMapper;
@Service
public class OwnerService {
     @Autowired
    private  ownerMapper ownermapper;
     
	public Stuts insertOwner(Owner owner) {
		System.out.println(owner.toString());
		Stuts st=new Stuts();
		int status=ownermapper.insert(owner);
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

	public Info<Owner> selectById(int ownerID) {
		Info<Owner> info=new Info<Owner>();
		 Owner owner=new Owner();
		 owner=ownermapper.selectId(ownerID);
		 if(owner!=null){
			info.setT(owner);
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

	public Info<Owner> findList() {
		Info<Owner> info=new Info<Owner>();
		List<Owner> list=new ArrayList<Owner>();
		list=ownermapper.selectlist();
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

	public Info<Owner> findLike(String name) {
		Info<Owner> info=new Info<Owner>();
		List<Owner> list=new ArrayList<Owner>();
		list=ownermapper.selectlike(name);
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

	public Stuts deleteByID(int ownerID) {
		Stuts st=new Stuts();
		int status=ownermapper.delete(ownerID);
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

	public Stuts update(Owner owner) {
		Stuts st=new Stuts();
		int status=ownermapper.update(owner);
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
	

}
