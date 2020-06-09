package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Supplierinfo;
import com.qakj.crm.pojo.SupplierinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SupplierinfoMapper {
	List<Supplierinfo> selectSupp(@Param("start") int start,@Param("len") int len,@Param("number") String number);

    int countByExample(SupplierinfoExample example);

    int deleteByExample(SupplierinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Supplierinfo record);

    int insertSelective(Supplierinfo record);

    List<Supplierinfo> selectByExample(SupplierinfoExample example);

    Supplierinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Supplierinfo record, @Param("example") SupplierinfoExample example);

    int updateByExample(@Param("record") Supplierinfo record, @Param("example") SupplierinfoExample example);

    int updateByPrimaryKeySelective(Supplierinfo record);

    int updateByPrimaryKey(Supplierinfo record);
}