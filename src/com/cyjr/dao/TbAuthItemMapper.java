package com.cyjr.dao;

import com.cyjr.model.TbAuthItem;
import com.cyjr.model.TbAuthItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAuthItemMapper {
    long countByExample(TbAuthItemExample example);

    int deleteByExample(TbAuthItemExample example);

    int deleteByPrimaryKey(String name);

    int insert(TbAuthItem record);

    int insertSelective(TbAuthItem record);

    List<TbAuthItem> selectByExampleWithBLOBs(TbAuthItemExample example);

    List<TbAuthItem> selectByExample(TbAuthItemExample example);

    TbAuthItem selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") TbAuthItem record, @Param("example") TbAuthItemExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAuthItem record, @Param("example") TbAuthItemExample example);

    int updateByExample(@Param("record") TbAuthItem record, @Param("example") TbAuthItemExample example);

    int updateByPrimaryKeySelective(TbAuthItem record);

    int updateByPrimaryKeyWithBLOBs(TbAuthItem record);

    int updateByPrimaryKey(TbAuthItem record);
}