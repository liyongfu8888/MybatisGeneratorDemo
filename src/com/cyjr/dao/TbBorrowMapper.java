package com.cyjr.dao;

import com.cyjr.model.TbBorrow;
import com.cyjr.model.TbBorrowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBorrowMapper {
    long countByExample(TbBorrowExample example);

    int deleteByExample(TbBorrowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBorrow record);

    int insertSelective(TbBorrow record);

    List<TbBorrow> selectByExampleWithBLOBs(TbBorrowExample example);

    List<TbBorrow> selectByExample(TbBorrowExample example);

    TbBorrow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBorrow record, @Param("example") TbBorrowExample example);

    int updateByExampleWithBLOBs(@Param("record") TbBorrow record, @Param("example") TbBorrowExample example);

    int updateByExample(@Param("record") TbBorrow record, @Param("example") TbBorrowExample example);

    int updateByPrimaryKeySelective(TbBorrow record);

    int updateByPrimaryKeyWithBLOBs(TbBorrow record);

    int updateByPrimaryKey(TbBorrow record);
}