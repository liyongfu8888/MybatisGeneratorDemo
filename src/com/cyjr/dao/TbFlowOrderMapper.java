package com.cyjr.dao;

import com.cyjr.model.TbFlowOrder;
import com.cyjr.model.TbFlowOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFlowOrderMapper {
    long countByExample(TbFlowOrderExample example);

    int deleteByExample(TbFlowOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbFlowOrder record);

    int insertSelective(TbFlowOrder record);

    List<TbFlowOrder> selectByExample(TbFlowOrderExample example);

    TbFlowOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbFlowOrder record, @Param("example") TbFlowOrderExample example);

    int updateByExample(@Param("record") TbFlowOrder record, @Param("example") TbFlowOrderExample example);

    int updateByPrimaryKeySelective(TbFlowOrder record);

    int updateByPrimaryKey(TbFlowOrder record);
}