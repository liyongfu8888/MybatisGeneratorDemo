package com.cyjr.dao;

import com.cyjr.model.TbHongbaoBorrow;
import com.cyjr.model.TbHongbaoBorrowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbHongbaoBorrowMapper {
    long countByExample(TbHongbaoBorrowExample example);

    int deleteByExample(TbHongbaoBorrowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbHongbaoBorrow record);

    int insertSelective(TbHongbaoBorrow record);

    List<TbHongbaoBorrow> selectByExample(TbHongbaoBorrowExample example);

    TbHongbaoBorrow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbHongbaoBorrow record, @Param("example") TbHongbaoBorrowExample example);

    int updateByExample(@Param("record") TbHongbaoBorrow record, @Param("example") TbHongbaoBorrowExample example);

    int updateByPrimaryKeySelective(TbHongbaoBorrow record);

    int updateByPrimaryKey(TbHongbaoBorrow record);
}