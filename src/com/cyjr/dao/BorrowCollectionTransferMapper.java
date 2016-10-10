package com.cyjr.dao;

import com.cyjr.model.BorrowCollectionTransfer;
import com.cyjr.model.BorrowCollectionTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowCollectionTransferMapper {
    long countByExample(BorrowCollectionTransferExample example);

    int deleteByExample(BorrowCollectionTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BorrowCollectionTransfer record);

    int insertSelective(BorrowCollectionTransfer record);

    List<BorrowCollectionTransfer> selectByExample(BorrowCollectionTransferExample example);

    BorrowCollectionTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BorrowCollectionTransfer record, @Param("example") BorrowCollectionTransferExample example);

    int updateByExample(@Param("record") BorrowCollectionTransfer record, @Param("example") BorrowCollectionTransferExample example);

    int updateByPrimaryKeySelective(BorrowCollectionTransfer record);

    int updateByPrimaryKey(BorrowCollectionTransfer record);
}