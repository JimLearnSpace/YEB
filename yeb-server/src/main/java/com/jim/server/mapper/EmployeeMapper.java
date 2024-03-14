package com.jim.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jim.server.pojo.Employee;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jim
 * @since 2022-05-11
 */
public interface EmployeeMapper extends BaseMapper<Employee> {




    /**
     * @Author: Jim
     * @Description: 获取所有员工（分页）
     * @param page
     * @param employee
     * @param beginDateScope
     */
    IPage<Employee> getEmployeeByPage(Page<Employee> page, Employee employee, LocalDate[] beginDateScope);


    List<Employee> getEmployee(Integer id);

    /**
     * @Author: Jim
     * @Description: 获取所有员工账套
     * @param page
     */
    IPage<Employee> getEmployeeWithSalary(Page<Employee> page);
}
