package tsu.pro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsu.pro.bean.PerInfo;
import tsu.pro.bean.Permission;
import tsu.pro.bean.Role;
import tsu.pro.bean.Role_Permission;

import tsu.pro.mapper.PerMapper;


@Service
public class PerService {
	@Autowired
private PerMapper perMapper;
   /**
    * 
    * @方法名: findlist
    * @描述:查询权限
    * @作者:lhs
    * @return
    * @日期 2018年4月8日 下午10:13:05
    * @返回值: PerInfo<Permission>
    * @修改人:
    * @修改时间:
    */
	public PerInfo<Permission> findlist() {
		PerInfo perinfo=new PerInfo();
		ArrayList<Permission> per=new ArrayList<Permission>();
		per=perMapper.queryAll();
		if(per.size()>=1){
			perinfo.setStatus("ok");
			perinfo.setMessage("查询成功");
			perinfo.setInfos(per);
			return perinfo;
		}
		else{
			perinfo.setStatus("err");
			perinfo.setMessage("查询失败");
		return perinfo;
	
		}
	}
   /**
    * 
    * @方法名: roleAddPer
    * @描述:角色权限
    * @作者:lhs
    * @param role_id
    * @param per_id
    * @return
    * @日期 2018年4月8日 下午10:13:39
    * @返回值: PerInfo
    * @修改人:
    * @修改时间:
    */
	public PerInfo<Permission> roleAddPer(String role_id, String per_id) {
		PerInfo<Permission> info=new PerInfo<Permission>();
		Role_Permission rp=new Role_Permission();
	
	     
		rp.setPermission_id(per_id);
		rp.setRole_id(role_id);
		   int i=perMapper.roleAddper(rp);
		   if(i==1){
		    	info.setStatus("ok");
		    	info.setMessage("添加成功");
		    	
		    	return info;
		    }
		    else{
		    	info.setStatus("error");
		    	info.setMessage("添加失败");
		    	return info;
		    }
	}

}
