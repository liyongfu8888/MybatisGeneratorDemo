package com.cyjr.dao;

import com.cyjr.model.TbInterestSetting;
import com.cyjr.model.TbInterestSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInterestSettingMapper {
    long countByExample(TbInterestSettingExample example);

    int deleteByExample(TbInterestSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbInterestSetting record);

    int insertSelective(TbInterestSetting record);

    List<TbInterestSetting> selectByExample(TbInterestSettingExample example);

    TbInterestSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbInterestSetting record, @Param("example") TbInterestSettingExample example);

    int updateByExample(@Param("record") TbInterestSetting record, @Param("example") TbInterestSettingExample example);

    int updateByPrimaryKeySelective(TbInterestSetting record);

    int updateByPrimaryKey(TbInterestSetting record);
}