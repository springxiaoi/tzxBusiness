package com.thinkgem.jeesite.modules.txzBusiness.dao;

import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.txzBusiness.entity.TzxCompany;
import com.thinkgem.jeesite.modules.txzBusiness.entity.TzxCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
@MyBatisDao
public interface TzxCompanyMapper {
    int countByExample(TzxCompanyExample example);

    int deleteByExample(TzxCompanyExample example);

    int deleteByPrimaryKey(String id);

    int insert(TzxCompany record);

    int insertSelective(TzxCompany record);

    List<TzxCompany> selectByExample(TzxCompanyExample example);

    TzxCompany selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TzxCompany record, @Param("example") TzxCompanyExample example);

    int updateByExample(@Param("record") TzxCompany record, @Param("example") TzxCompanyExample example);

    int updateByPrimaryKeySelective(TzxCompany record);

    int updateByPrimaryKey(TzxCompany record);
}