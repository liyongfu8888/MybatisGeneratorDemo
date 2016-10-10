package com.cyjr.dao;

import com.cyjr.model.TbHongbaoSetting;
import com.cyjr.model.TbHongbaoSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbHongbaoSettingMapper {
    long countByExample(TbHongbaoSettingExample example);

    int deleteByExample(TbHongbaoSettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbHongbaoSetting record);

    int insertSelective(TbHongbaoSetting record);

    List<TbHongbaoSetting> selectByExample(TbHongbaoSettingExample example);

    TbHongbaoSetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbHongbaoSetting record, @Param("example") TbHongbaoSettingExample example);

    int updateByExample(@Param("record") TbHongbaoSetting record, @Param("example") TbHongbaoSettingExample example);

    int updateByPrimaryKeySelective(TbHongbaoSetting record);

    int updateByPrimaryKey(TbHongbaoSetting record);
}