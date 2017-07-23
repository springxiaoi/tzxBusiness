package com.thinkgem.jeesite.modules.txzBusiness.dao;

import com.thinkgem.jeesite.modules.txzBusiness.entity.TzxHome;
import com.thinkgem.jeesite.modules.txzBusiness.entity.TzxHomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TzxHomeMapper {
    int countByExample(TzxHomeExample example);

    int deleteByExample(TzxHomeExample example);

    int deleteByPrimaryKey(String id);

    int insert(TzxHome record);

    int insertSelective(TzxHome record);

    List<TzxHome> selectByExample(TzxHomeExample example);

    TzxHome selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TzxHome record, @Param("example") TzxHomeExample example);

    int updateByExample(@Param("record") TzxHome record, @Param("example") TzxHomeExample example);

    int updateByPrimaryKeySelective(TzxHome record);

    int updateByPrimaryKey(TzxHome record);
}