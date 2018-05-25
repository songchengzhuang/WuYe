package tsu.pro.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import tsu.pro.bean.User;

@Mapper
public interface UserMapper {
	
@Select("select * from User where Phone=#{phone}")
User findUserByPhone(@Param("phone") String phone);
@Insert("insert into User(Name,Password,Email,Phone) values(#{name},#{password},#{email},#{phone})")
int insert(@Param("name") String name,@Param("password") String password,@Param("email") String email,@Param("phone") String phone);

@Insert("insert into Users(Name,Password,Email,Phone) values(#{name},#{password},#{email},#{phone})")
int insertUser(User user);

@Select("select * from Users where Id=#{id}")
User findTag(int id);
@Select("select * from Users")
ArrayList<User> queryAll();

@Select("select * from Users where Name=#{name} and Password=#{password}")
User finduserByName(@Param("name") String name,@Param("password") String password);

@Update("update Users set Name=#{Name},Password=#{password},Email=#{email},Phone=#{phone} where Id=#{Id}")
int updateUser( User user);
@Delete("delete from Users where Id=#{id}")
int deleteUser(int id);
@Delete("delete from user_role where Id=#{id}")
int deleteUserrole(int id); 


}
