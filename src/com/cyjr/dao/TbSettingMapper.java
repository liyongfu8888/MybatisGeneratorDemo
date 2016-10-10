package com.cyjr.dao;

import com.cyjr.model.TbSetting;
import com.cyjr.model.TbSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSettingMapper {
    long countByExample(TbSettingExample example);

    int deleteByExample(TbSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSetting record);

    int insertSelective(TbSetting record);

    List<TbSetting> selectByExample(TbSettingExample example);

    TbSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSetting record, @Param("example") TbSettingExample example);

    int updateByExample(@Param("record") TbSetting record, @Param("example") TbSettingExample example);

    int updateByPrimaryKeySelective(TbSetting record);

    int updateByPrimaryKey(TbSetting record);
}