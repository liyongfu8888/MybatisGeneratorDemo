package com.cyjr.dao;

import com.cyjr.model.TbHoms;
import com.cyjr.model.TbHomsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbHomsMapper {
    long countByExample(TbHomsExample example);

    int deleteByExample(TbHomsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbHoms record);

    int insertSelective(TbHoms record);

    List<TbHoms> selectByExample(TbHomsExample example);

    TbHoms selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbHoms record, @Param("example") TbHomsExample example);

    int updateByExample(@Param("record") TbHoms record, @Param("example") TbHomsExample example);

    int updateByPrimaryKeySelective(TbHoms record);

    int updateByPrimaryKey(TbHoms record);
}