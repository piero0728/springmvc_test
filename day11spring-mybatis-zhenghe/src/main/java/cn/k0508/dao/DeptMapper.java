package cn.k0508.dao;

import cn.k0508.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);

    //根据部门编号查询部门信息
    Dept selDeptByDeptNo(@Param("did") Integer did);
}