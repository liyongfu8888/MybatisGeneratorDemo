package com.cyjr.dao;

import com.cyjr.model.TbLuckydrawSetting;
import com.cyjr.model.TbLuckydrawSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLuckydrawSettingMapper {
    long countByExample(TbLuckydrawSettingExample example);

    int deleteByExample(TbLuckydrawSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLuckydrawSetting record);

    int insertSelective(TbLuckydrawSetting record);

    List<TbLuckydrawSetting> selectByExample(TbLuckydrawSettingExample example);

    TbLuckydrawSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLuckydrawSetting record, @Param("example") TbLuckydrawSettingExample example);

    int updateByExample(@Param("record") TbLuckydrawSetting record, @Param("example") TbLuckydrawSettingExample example);

    int updateByPrimaryKeySelective(TbLuckydrawSetting record);

    int updateByPrimaryKey(TbLuckydrawSetting record);
}