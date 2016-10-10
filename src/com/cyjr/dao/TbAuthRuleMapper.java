package com.cyjr.dao;

import com.cyjr.model.TbAuthRule;
import com.cyjr.model.TbAuthRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAuthRuleMapper {
    long countByExample(TbAuthRuleExample example);

    int deleteByExample(TbAuthRuleExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("name") String name);

    int insert(TbAuthRule record);

    int insertSelective(TbAuthRule record);

    List<TbAuthRule> selectByExampleWithBLOBs(TbAuthRuleExample example);

    List<TbAuthRule> selectByExample(TbAuthRuleExample example);

    TbAuthRule selectByPrimaryKey(@Param("id") Integer id, @Param("name") String name);

    int updateByExampleSelective(@Param("record") TbAuthRule record, @Param("example") TbAuthRuleExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAuthRule record, @Param("example") TbAuthRuleExample example);

    int updateByExample(@Param("record") TbAuthRule record, @Param("example") TbAuthRuleExample example);

    int updateByPrimaryKeySelective(TbAuthRule record);

    int updateByPrimaryKeyWithBLOBs(TbAuthRule record);

    int updateByPrimaryKey(TbAuthRule record);
}