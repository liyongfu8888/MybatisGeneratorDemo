package com.cyjr.dao;

import com.cyjr.model.TbUserSignin;
import com.cyjr.model.TbUserSigninExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserSigninMapper {
    long countByExample(TbUserSigninExample example);

    int deleteByExample(TbUserSigninExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserSignin record);

    int insertSelective(TbUserSignin record);

    List<TbUserSignin> selectByExample(TbUserSigninExample example);

    TbUserSignin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserSignin record, @Param("example") TbUserSigninExample example);

    int updateByExample(@Param("record") TbUserSignin record, @Param("example") TbUserSigninExample example);

    int updateByPrimaryKeySelective(TbUserSignin record);

    int updateByPrimaryKey(TbUserSignin record);
}