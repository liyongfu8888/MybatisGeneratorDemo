package com.cyjr.dao;

import com.cyjr.model.TbBank;
import com.cyjr.model.TbBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBankMapper {
    long countByExample(TbBankExample example);

    int deleteByExample(TbBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBank record);

    int insertSelective(TbBank record);

    List<TbBank> selectByExample(TbBankExample example);

    TbBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBank record, @Param("example") TbBankExample example);

    int updateByExample(@Param("record") TbBank record, @Param("example") TbBankExample example);

    int updateByPrimaryKeySelective(TbBank record);

    int updateByPrimaryKey(TbBank record);
}