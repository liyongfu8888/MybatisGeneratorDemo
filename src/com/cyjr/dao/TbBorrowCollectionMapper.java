package com.cyjr.dao;

import com.cyjr.model.TbBorrowCollection;
import com.cyjr.model.TbBorrowCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBorrowCollectionMapper {
    long countByExample(TbBorrowCollectionExample example);

    int deleteByExample(TbBorrowCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBorrowCollection record);

    int insertSelective(TbBorrowCollection record);

    List<TbBorrowCollection> selectByExample(TbBorrowCollectionExample example);

    TbBorrowCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBorrowCollection record, @Param("example") TbBorrowCollectionExample example);

    int updateByExample(@Param("record") TbBorrowCollection record, @Param("example") TbBorrowCollectionExample example);

    int updateByPrimaryKeySelective(TbBorrowCollection record);

    int updateByPrimaryKey(TbBorrowCollection record);
}