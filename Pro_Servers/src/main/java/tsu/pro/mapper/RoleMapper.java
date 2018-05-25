package tsu.pro.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import tsu.pro.bean.Role;
import tsu.pro.bean.User_Role;

@Mapper
public interface RoleMapper {
	@Insert("insert into role(rolename,message) values(#{roleName},#{Message})")
      int addRole(Role role);
    @Select("select * from role")
	ArrayList<Role> queryAll();
    @Delete("delete from role where id=#{id}")
	int deleteRole(int id);
    @Insert("insert into user_role(user_id,role_id) values(#{User_Id},#{Roled_id})")
	int userAddRole(User_Role ur);

}
