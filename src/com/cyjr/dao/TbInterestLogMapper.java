package com.cyjr.dao;

import com.cyjr.model.TbInterestLog;
import com.cyjr.model.TbInterestLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInterestLogMapper {
    long countByExample(TbInterestLogExample example);

    int deleteByExample(TbInterestLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbInterestLog record);

    int insertSelective(TbInterestLog record);

    List<TbInterestLog> selectByExample(TbInterestLogExample example);

    TbInterestLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbInterestLog record, @Param("example") TbInterestLogExample example);

    int updateByExample(@Param("record") TbInterestLog record, @Param("example") TbInterestLogExample example);

    int updateByPrimaryKeySelective(TbInterestLog record);

    int updateByPrimaryKey(TbInterestLog record);
}