package com.cyjr.dao;

import com.cyjr.model.TbUserCaptcha;
import com.cyjr.model.TbUserCaptchaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserCaptchaMapper {
    long countByExample(TbUserCaptchaExample example);

    int deleteByExample(TbUserCaptchaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserCaptcha record);

    int insertSelective(TbUserCaptcha record);

    List<TbUserCaptcha> selectByExample(TbUserCaptchaExample example);

    TbUserCaptcha selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserCaptcha record, @Param("example") TbUserCaptchaExample example);

    int updateByExample(@Param("record") TbUserCaptcha record, @Param("example") TbUserCaptchaExample example);

    int updateByPrimaryKeySelective(TbUserCaptcha record);

    int updateByPrimaryKey(TbUserCaptcha record);
}