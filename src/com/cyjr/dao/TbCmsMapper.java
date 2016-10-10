package com.cyjr.dao;

import com.cyjr.model.TbCms;
import com.cyjr.model.TbCmsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCmsMapper {
    long countByExample(TbCmsExample example);

    int deleteByExample(TbCmsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCms record);

    int insertSelective(TbCms record);

    List<TbCms> selectByExampleWithBLOBs(TbCmsExample example);

    List<TbCms> selectByExample(TbCmsExample example);

    TbCms selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCms record, @Param("example") TbCmsExample example);

    int updateByExampleWithBLOBs(@Param("record") TbCms record, @Param("example") TbCmsExample example);

    int updateByExample(@Param("record") TbCms record, @Param("example") TbCmsExample example);

    int updateByPrimaryKeySelective(TbCms record);

    int updateByPrimaryKeyWithBLOBs(TbCms record);

    int updateByPrimaryKey(TbCms record);
}