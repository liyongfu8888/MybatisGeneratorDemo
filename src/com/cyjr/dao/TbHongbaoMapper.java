package com.cyjr.dao;

import com.cyjr.model.TbHongbao;
import com.cyjr.model.TbHongbaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbHongbaoMapper {
    long countByExample(TbHongbaoExample example);

    int deleteByExample(TbHongbaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbHongbao record);

    int insertSelective(TbHongbao record);

    List<TbHongbao> selectByExample(TbHongbaoExample example);

    TbHongbao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbHongbao record, @Param("example") TbHongbaoExample example);

    int updateByExample(@Param("record") TbHongbao record, @Param("example") TbHongbaoExample example);

    int updateByPrimaryKeySelective(TbHongbao record);

    int updateByPrimaryKey(TbHongbao record);
}