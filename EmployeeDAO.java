package com.cg.anurag.b4.bvs.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.anurag.b4.bvs.dto.Employee;
public interface EmployeeDAO  extends JpaRepository<Employee,Integer>
{

}
