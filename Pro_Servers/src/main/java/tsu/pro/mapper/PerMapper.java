package tsu.pro.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import tsu.pro.bean.Permission;
import tsu.pro.bean.Role_Permission;

@Mapper
public interface PerMapper {
    @Select("select * from permission ")
	ArrayList<Permission> queryAll();
    @Insert("insert into role_permission(role_id,permission_id)  values(#{Role_id},#{Permission_id})")
	int roleAddper(Role_Permission rp);

}
