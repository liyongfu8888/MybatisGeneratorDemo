package com.cyjr.dao;

import com.cyjr.model.TbBanner;
import com.cyjr.model.TbBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBannerMapper {
    long countByExample(TbBannerExample example);

    int deleteByExample(TbBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBanner record);

    int insertSelective(TbBanner record);

    List<TbBanner> selectByExample(TbBannerExample example);

    TbBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBanner record, @Param("example") TbBannerExample example);

    int updateByExample(@Param("record") TbBanner record, @Param("example") TbBannerExample example);

    int updateByPrimaryKeySelective(TbBanner record);

    int updateByPrimaryKey(TbBanner record);
}