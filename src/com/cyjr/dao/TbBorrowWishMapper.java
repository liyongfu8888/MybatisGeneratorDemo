package com.cyjr.dao;

import com.cyjr.model.TbBorrowWish;
import com.cyjr.model.TbBorrowWishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBorrowWishMapper {
    long countByExample(TbBorrowWishExample example);

    int deleteByExample(TbBorrowWishExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBorrowWish record);

    int insertSelective(TbBorrowWish record);

    List<TbBorrowWish> selectByExample(TbBorrowWishExample example);

    TbBorrowWish selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBorrowWish record, @Param("example") TbBorrowWishExample example);

    int updateByExample(@Param("record") TbBorrowWish record, @Param("example") TbBorrowWishExample example);

    int updateByPrimaryKeySelective(TbBorrowWish record);

    int updateByPrimaryKey(TbBorrowWish record);
}