package com.cyjr.dao;

import com.cyjr.model.TbLinks;
import com.cyjr.model.TbLinksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLinksMapper {
    long countByExample(TbLinksExample example);

    int deleteByExample(TbLinksExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLinks record);

    int insertSelective(TbLinks record);

    List<TbLinks> selectByExample(TbLinksExample example);

    TbLinks selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLinks record, @Param("example") TbLinksExample example);

    int updateByExample(@Param("record") TbLinks record, @Param("example") TbLinksExample example);

    int updateByPrimaryKeySelective(TbLinks record);

    int updateByPrimaryKey(TbLinks record);
}