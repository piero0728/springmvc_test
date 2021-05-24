package cn.k0508.service.impl;

import cn.k0508.dao.EmpMapper;
import cn.k0508.pojo.Emp;
import cn.k0508.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;
import java.util.Map;

@Service("DemoService")
public class DemoServiceImpl implements DemoService {
    //DI依赖注入dao层对应的Mapper
    @Autowired
    public EmpMapper empMapper;

    //事务注解配置
    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public String DelEmpAndInsertEmp(Integer eid, Emp emp){
        try {
            //根据eid删除员工
            empMapper.deleteByPrimaryKey(eid);
            //增加一个异常
//            int i=1/0;
            //新增员工信息
            empMapper.insert(emp);
            return "成功";
        } catch (Exception e) {
            e.printStackTrace();
            //手动回滚事务
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return "失败";
    }

    @Override
    public List<Map<String, Object>> findEmpAndDept() {
        return empMapper.selEmpAndDept();
    }

    @Override
    public List<Emp> findEmpAndDeptLazy() {
        return empMapper.selEmpAndDeptLazy();
    }
}
