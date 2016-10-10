package com.cyjr.dao;

import com.cyjr.model.TbMigration;
import com.cyjr.model.TbMigrationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMigrationMapper {
    long countByExample(TbMigrationExample example);

    int deleteByExample(TbMigrationExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("version") String version);

    int insert(TbMigration record);

    int insertSelective(TbMigration record);

    List<TbMigration> selectByExample(TbMigrationExample example);

    TbMigration selectByPrimaryKey(@Param("id") Integer id, @Param("version") String version);

    int updateByExampleSelective(@Param("record") TbMigration record, @Param("example") TbMigrationExample example);

    int updateByExample(@Param("record") TbMigration record, @Param("example") TbMigrationExample example);

    int updateByPrimaryKeySelective(TbMigration record);

    int updateByPrimaryKey(TbMigration record);
}