package tsu.pro.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import tsu.pro.bean.Repair;

@Mapper
public interface RepairMapper {
     @Select("select * from repairS")
	List<Repair> selectlist();
     @Select("select * from repairS where ownerID=#{ownerID} ")
	List<Repair> selectlike(int ownerID);
    @Delete("delete from repairS where repariID=#{repariID}")
	int delete(int repairID);
    @Update("update repairS set repairTime=#{repairTime},repairInfo=#{repairInfo},ownerID=#{ownerID},repairDel=#{repairDel},repairIdentify=#{repairIdentify},update_Tm=#{update_Tm}where repariID=#{repariID}")
	int update(Repair repair);
    @Select("select * from repairS where repariID=#{repariID}")
   Repair selectId(int repairID);
    @Insert("insert into repairS(repairTime,repairInfo,ownerID,repairDel,repairIdentify,update_Tm) values(#{repairTime},#{repairInfo},#{ownerID},#{repairDel},#{repairIdentify},#{update_Tm})")
	int insert(Repair repair);

}
