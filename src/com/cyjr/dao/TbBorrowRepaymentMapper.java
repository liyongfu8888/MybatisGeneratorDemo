package com.cyjr.dao;

import com.cyjr.model.TbBorrowRepayment;
import com.cyjr.model.TbBorrowRepaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBorrowRepaymentMapper {
    long countByExample(TbBorrowRepaymentExample example);

    int deleteByExample(TbBorrowRepaymentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBorrowRepayment record);

    int insertSelective(TbBorrowRepayment record);

    List<TbBorrowRepayment> selectByExample(TbBorrowRepaymentExample example);

    TbBorrowRepayment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBorrowRepayment record, @Param("example") TbBorrowRepaymentExample example);

    int updateByExample(@Param("record") TbBorrowRepayment record, @Param("example") TbBorrowRepaymentExample example);

    int updateByPrimaryKeySelective(TbBorrowRepayment record);

    int updateByPrimaryKey(TbBorrowRepayment record);
}