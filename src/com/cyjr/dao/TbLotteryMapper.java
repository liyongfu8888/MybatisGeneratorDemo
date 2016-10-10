package com.cyjr.dao;

import com.cyjr.model.TbLottery;
import com.cyjr.model.TbLotteryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLotteryMapper {
    long countByExample(TbLotteryExample example);

    int deleteByExample(TbLotteryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbLottery record);

    int insertSelective(TbLottery record);

    List<TbLottery> selectByExample(TbLotteryExample example);

    TbLottery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbLottery record, @Param("example") TbLotteryExample example);

    int updateByExample(@Param("record") TbLottery record, @Param("example") TbLotteryExample example);

    int updateByPrimaryKeySelective(TbLottery record);

    int updateByPrimaryKey(TbLottery record);
}