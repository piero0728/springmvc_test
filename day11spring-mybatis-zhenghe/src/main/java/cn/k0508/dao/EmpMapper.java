package cn.k0508.dao;

import cn.k0508.pojo.Emp;

import java.util.List;
import java.util.Map;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    //查询所有的员工信息
    public List<Map<String,Object>> selEmpAndDept();

    //延迟加载查询所有的员工信息
    public List<Emp> selEmpAndDeptLazy();
}