package com.cyjr.dao;

import com.cyjr.model.TbInterestBorrow;
import com.cyjr.model.TbInterestBorrowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInterestBorrowMapper {
    long countByExample(TbInterestBorrowExample example);

    int deleteByExample(TbInterestBorrowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbInterestBorrow record);

    int insertSelective(TbInterestBorrow record);

    List<TbInterestBorrow> selectByExample(TbInterestBorrowExample example);

    TbInterestBorrow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbInterestBorrow record, @Param("example") TbInterestBorrowExample example);

    int updateByExample(@Param("record") TbInterestBorrow record, @Param("example") TbInterestBorrowExample example);

    int updateByPrimaryKeySelective(TbInterestBorrow record);

    int updateByPrimaryKey(TbInterestBorrow record);
}