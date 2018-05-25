package tsu.pro.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import tsu.pro.bean.Owner;
import tsu.pro.bean.User;

@Mapper
public interface ownerMapper {
    @Insert("insert into Owners(ownerName,ownerTel,ownerInfo,ownerDel,ownerCart,update_Tm) values(#{ownerName},#{ownerTel},#{ownerInfo},#{ownerDel},#{ownerCart},#{update_Tm})")
	int insert(Owner owner);
    @Select("select * from Owners")
    List<Owner> selectlist();
    @Select("select * from Owners where ownerName like #{ownerName}")
    List<Owner> selectlike(String name);
    @Select("select * from Owners where ownerID=#{ownerID}")
    Owner selectId(int id);
    @Delete("delete from Owners where ownerID=#{ownerID}")
    int delete(int id);
    @Update("update Owners set ownerName=#{ownerName},ownerTel=#{ownerTel},ownerInfo=#{ownerInfo},ownerDel=#{ownerDel},ownerCart=#{ownerCart},update_Tm=#{update_Tm}where ownerID=#{ownerID}")
    int update( Owner owner);

}
