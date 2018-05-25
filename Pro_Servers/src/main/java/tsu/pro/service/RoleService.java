package tsu.pro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tsu.pro.bean.Info;
import tsu.pro.bean.Role;
import tsu.pro.bean.RoleInfo;
import tsu.pro.bean.User_Role;
import tsu.pro.dao.UserDao;
import tsu.pro.mapper.RoleMapper;


@Service
public class RoleService {
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private UserDao userdao;

	/**
	 * 
	 * @方法名: addRole
	 * @描述:添加权限
	 * @作者:lhs
	 * @param role
	 * @return
	 * @日期 2018年4月8日 下午8:37:53
	 * @返回值: String
	 * @修改人:
	 * @修改时间:
	 */
	public RoleInfo<Role> addRole(Role role) {
		RoleInfo<Role> info = new RoleInfo<Role>();
		
		int i = roleMapper.addRole(role);
		if (i == 1) {
			info.setStatus("ok");
			info.setMessage("添加成功");

			return info;
		} else {
			info.setStatus("error");
			info.setMessage("添加失败");
			return info;
		}
	}
/**
 * 
 * @方法名: findAll
 * @描述: 查询所有角色
 * @作者:lhs
 * @return
 * @日期 2018年4月8日 下午9:01:24
 * @返回值: roleInfo<Role>
 * @修改人:
 * @修改时间:
 */
	public RoleInfo<Role> findAll() {
		RoleInfo roleinfo=new RoleInfo();
		ArrayList<Role> roles=new ArrayList<Role>();
		roles=roleMapper.queryAll();
		if(roles.size()>=1){
			roleinfo.setStatus("ok");
			roleinfo.setMessage("查询成功");
			roleinfo.setInfos(roles);
			return roleinfo;
		}
		else{
			roleinfo.setStatus("err");
			roleinfo.setMessage("查询失败");
		return roleinfo;
	}
		}
	/**
	 * 
	 * @方法名: deleteRole
	 * @描述:根据ID删除
	 * @作者:lhs
	 * @param id
	 * @return
	 * @日期 2018年4月8日 下午9:13:26
	 * @返回值: RoleInfo<Role>
	 * @修改人:
	 * @修改时间:
	 */
public RoleInfo<Role> deleteRole(int id) {
	     RoleInfo<Role> info=new RoleInfo<Role>();
	      int i=roleMapper.deleteRole(id);
	      if(i==1){
		    	info.setStatus("ok");
		    	info.setMessage("删除成功");
		    	
		    	return info;
		    }
		    else{
		    	info.setStatus("error");
		    	info.setMessage("删除失败");
		    	return info;
		    }

}
/**
 * 
 * @方法名: userAddRole
 * @描述:给用户添加权限
 * @作者:lhs
 * @param userid
 * @param roleid
 * @return
 * @日期 2018年4月8日 下午9:29:20
 * @返回值: RoleInfo
 * @修改人:
 * @修改时间:
 */
	public RoleInfo userAddRole(int userid, int roleid) {
		  RoleInfo<Role> info=new RoleInfo<Role>();
		  User_Role ur=new User_Role();
		
		  ur.setUser_Id(userid);
		  ur.setRoled_id(roleid);
		   int i=roleMapper.userAddRole(ur);
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
public Info<Role> findidbyID(int id) {
	Info info=new Info();
       ArrayList list=new ArrayList();
       list=userdao.selectByIDTOper(id);
       if(list.size()!=0){
    	   info.setInfos(list);
    	   info.setMesage("success");
    	   info.setStatus("ok");
    	   return info;
       }
       else{
    	   info.setMesage("error");
    	   info.setStatus("error");
    	   return info;
       }
       
}
}
