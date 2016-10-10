package com.cyjr.dao;

import com.cyjr.model.TbMenuAuthitem;
import com.cyjr.model.TbMenuAuthitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMenuAuthitemMapper {
    long countByExample(TbMenuAuthitemExample example);

    int deleteByExample(TbMenuAuthitemExample example);

    int insert(TbMenuAuthitem record);

    int insertSelective(TbMenuAuthitem record);

    List<TbMenuAuthitem> selectByExample(TbMenuAuthitemExample example);

    int updateByExampleSelective(@Param("record") TbMenuAuthitem record, @Param("example") TbMenuAuthitemExample example);

    int updateByExample(@Param("record") TbMenuAuthitem record, @Param("example") TbMenuAuthitemExample example);
}