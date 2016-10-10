package com.cyjr.dao;

import com.cyjr.model.TbMessage;
import com.cyjr.model.TbMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMessageMapper {
    long countByExample(TbMessageExample example);

    int deleteByExample(TbMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbMessage record);

    int insertSelective(TbMessage record);

    List<TbMessage> selectByExampleWithBLOBs(TbMessageExample example);

    List<TbMessage> selectByExample(TbMessageExample example);

    TbMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbMessage record, @Param("example") TbMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") TbMessage record, @Param("example") TbMessageExample example);

    int updateByExample(@Param("record") TbMessage record, @Param("example") TbMessageExample example);

    int updateByPrimaryKeySelective(TbMessage record);

    int updateByPrimaryKeyWithBLOBs(TbMessage record);

    int updateByPrimaryKey(TbMessage record);
}