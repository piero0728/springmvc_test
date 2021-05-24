package cn.k0508.service;

import cn.k0508.pojo.Emp;

import java.util.List;
import java.util.Map;

public interface DemoService {
    //删除一个员工并新增一个员工
    public String DelEmpAndInsertEmp(Integer eid, Emp emp);

    public List<Map<String,Object>> findEmpAndDept();

    public List<Emp> findEmpAndDeptLazy();
}
