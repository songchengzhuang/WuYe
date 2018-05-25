package tsu.pro.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;

import tsu.pro.bean.Permission;
import tsu.pro.bean.Role;
import tsu.pro.bean.User;
import tsu.pro.utils.mysqlconnection;


@Component
public   class UserDao extends  mysqlconnection {

public List<Permission> selectPermission(User user){
	String sql="select  p.id,p.per_name,p.per_url,p.per_massage from Users u inner join user_role ur on u.id=ur.user_id inner join role_permission rp on ur.role_id=rp.role_id inner join permission p on rp.permission_id=p.id where u.id="+user.getId()+"";

	 ArrayList<Permission> list=new ArrayList<Permission>();
		 try {
			stat = connection.prepareStatement(sql);
			resultset=stat.executeQuery();
			
			
			 while(resultset!=null&&resultset.next()){
				 Permission per=new Permission();
	              per.setId(resultset.getInt(1)); 
	              per.setPer_Name(resultset.getString(2));
	              per.setPer_Url(resultset.getString(3));
	              per.setPer_meassage(resultset.getString(4));
	              list.add(per);
	}
			 return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	


}

public ArrayList selectrolebyID(int id) {
	String sql="SELECT user_role.id, role.id ,role.rolename From users inner join user_role on users.ID=user_role.user_id inner join role on user_role.role_id=role.id where users.ID="+id+"";
	 ArrayList<Role> list=new ArrayList<Role>();
	 try {
		stat = connection.prepareStatement(sql);
		resultset=stat.executeQuery();
		
		
		 while(resultset!=null&&resultset.next()){
			 Role role=new Role();
			      role.setUserroleID(resultset.getInt(1));
			      role.setId(resultset.getInt(2));
			      role.setRoleName(resultset.getString(3));
			      list.add(role);
}
		 return list;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;
}

public ArrayList selectByIDTOper(int id) {
	String sql="select permission.id,permission.per_name from role inner join role_permission on role.id=role_permission.role_id inner join permission on role_permission.permission_id=permission.id where role.id="+id+"";
	 ArrayList<Permission> list=new ArrayList<Permission>();
	 try {
		stat = connection.prepareStatement(sql);
		resultset=stat.executeQuery();
		
		
		 while(resultset!=null&&resultset.next()){
			 Permission permission=new Permission();
			 permission.setId(resultset.getInt(1));
			 permission.setPer_Name(resultset.getString(2));
			      list.add(permission);
}
		 return list;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return list;

	

}
}