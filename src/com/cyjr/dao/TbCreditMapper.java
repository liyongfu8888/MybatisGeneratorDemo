package com.cyjr.dao;

import com.cyjr.model.TbCredit;
import com.cyjr.model.TbCreditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCreditMapper {
    long countByExample(TbCreditExample example);

    int deleteByExample(TbCreditExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCredit record);

    int insertSelective(TbCredit record);

    List<TbCredit> selectByExample(TbCreditExample example);

    TbCredit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCredit record, @Param("example") TbCreditExample example);

    int updateByExample(@Param("record") TbCredit record, @Param("example") TbCreditExample example);

    int updateByPrimaryKeySelective(TbCredit record);

    int updateByPrimaryKey(TbCredit record);
}