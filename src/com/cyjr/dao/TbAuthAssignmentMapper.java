package com.cyjr.dao;

import com.cyjr.model.TbAuthAssignment;
import com.cyjr.model.TbAuthAssignmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAuthAssignmentMapper {
    long countByExample(TbAuthAssignmentExample example);

    int deleteByExample(TbAuthAssignmentExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("itemName") String itemName, @Param("userId") String userId);

    int insert(TbAuthAssignment record);

    int insertSelective(TbAuthAssignment record);

    List<TbAuthAssignment> selectByExample(TbAuthAssignmentExample example);

    TbAuthAssignment selectByPrimaryKey(@Param("id") Integer id, @Param("itemName") String itemName, @Param("userId") String userId);

    int updateByExampleSelective(@Param("record") TbAuthAssignment record, @Param("example") TbAuthAssignmentExample example);

    int updateByExample(@Param("record") TbAuthAssignment record, @Param("example") TbAuthAssignmentExample example);

    int updateByPrimaryKeySelective(TbAuthAssignment record);

    int updateByPrimaryKey(TbAuthAssignment record);
}