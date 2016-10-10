package com.cyjr.dao;

import com.cyjr.model.TbLoanOrder;
import com.cyjr.model.TbLoanOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLoanOrderMapper {
    long countByExample(TbLoanOrderExample example);

    int deleteByExample(TbLoanOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLoanOrder record);

    int insertSelective(TbLoanOrder record);

    List<TbLoanOrder> selectByExample(TbLoanOrderExample example);

    TbLoanOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLoanOrder record, @Param("example") TbLoanOrderExample example);

    int updateByExample(@Param("record") TbLoanOrder record, @Param("example") TbLoanOrderExample example);

    int updateByPrimaryKeySelective(TbLoanOrder record);

    int updateByPrimaryKey(TbLoanOrder record);
}