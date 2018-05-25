package tsu.pro.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import tsu.pro.bean.Charge;

@Mapper
public interface ChargeMapper {

@Insert("insert into charge(chargeTime,chargeName,chargeMoney,ownerID,chargeDel,update_Tm) values(#{chargeTime},#{chargeName},#{chargeMoney},#{ownerID},#{chargeDel},#{update_Tm})")	
int insert(Charge charge);
@Select("select * from charge where chargeID=#{chargeID}")
Charge selectId(int chargeID);
@Select("select * from charge")
List<Charge> selectlist();
@Select("select * from charge where chargeName like #{name}")
List<Charge> selectlike(int name);
@Delete("delete from charge where chargeID = #{chargeID}")
int delete(int chargeID);
@Update("update charge set chargeTime=#{chargeTime},chargeName=#{chargeName},chargeMoney=#{chargeMoney},ownerID=#{ownerID},chargeDel=#{chargeDel},update_Tm=#{update_Tm}where chargeID=#{chargeID}")
int update(Charge charge);

}
