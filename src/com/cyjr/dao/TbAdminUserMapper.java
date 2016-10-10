package com.cyjr.dao;

import com.cyjr.model.TbAdminUser;
import com.cyjr.model.TbAdminUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdminUserMapper {
    long countByExample(TbAdminUserExample example);

    int deleteByExample(TbAdminUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAdminUser record);

    int insertSelective(TbAdminUser record);

    List<TbAdminUser> selectByExample(TbAdminUserExample example);

    TbAdminUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAdminUser record, @Param("example") TbAdminUserExample example);

    int updateByExample(@Param("record") TbAdminUser record, @Param("example") TbAdminUserExample example);

    int updateByPrimaryKeySelective(TbAdminUser record);

    int updateByPrimaryKey(TbAdminUser record);
}