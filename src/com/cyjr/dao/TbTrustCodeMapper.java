package com.cyjr.dao;

import com.cyjr.model.TbTrustCode;
import com.cyjr.model.TbTrustCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTrustCodeMapper {
    long countByExample(TbTrustCodeExample example);

    int deleteByExample(TbTrustCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbTrustCode record);

    int insertSelective(TbTrustCode record);

    List<TbTrustCode> selectByExampleWithBLOBs(TbTrustCodeExample example);

    List<TbTrustCode> selectByExample(TbTrustCodeExample example);

    TbTrustCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbTrustCode record, @Param("example") TbTrustCodeExample example);

    int updateByExampleWithBLOBs(@Param("record") TbTrustCode record, @Param("example") TbTrustCodeExample example);

    int updateByExample(@Param("record") TbTrustCode record, @Param("example") TbTrustCodeExample example);

    int updateByPrimaryKeySelective(TbTrustCode record);

    int updateByPrimaryKeyWithBLOBs(TbTrustCode record);

    int updateByPrimaryKey(TbTrustCode record);
}