package com.cyjr.dao;

import com.cyjr.model.TbDebtTransfer;
import com.cyjr.model.TbDebtTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDebtTransferMapper {
    long countByExample(TbDebtTransferExample example);

    int deleteByExample(TbDebtTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbDebtTransfer record);

    int insertSelective(TbDebtTransfer record);

    List<TbDebtTransfer> selectByExample(TbDebtTransferExample example);

    TbDebtTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbDebtTransfer record, @Param("example") TbDebtTransferExample example);

    int updateByExample(@Param("record") TbDebtTransfer record, @Param("example") TbDebtTransferExample example);

    int updateByPrimaryKeySelective(TbDebtTransfer record);

    int updateByPrimaryKey(TbDebtTransfer record);
}