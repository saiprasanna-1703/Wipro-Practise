package com.wipro.springrestcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wipro.springrestcrud.entity.Employee;

@Repository
public interface EmployeeRepositroy extends JpaRepository<Employee, Integer> {
	
  public Employee findByename(String ename);
  public List<Employee>  findBysalaryGreaterThan(double salary);
  public List<Employee> findBysalaryLessThan(double salary);
 @Query("select e from Employee e order by e.ename desc")
  public List<Employee> getallsort();
 @Query("select e from Employee e  where salary between ?1 and ?2")
 public List<Employee> findsalarybtw(double a,double b);

 public double getsum();
 @NativeQuery("select count(*) from practise_table")
 public int getcountbynative();
 public Employee selectbyeid(int eid);
 @Modifying
 @Query("update Employee e set e.salary=:s1 where e.eid=:eid")
 public void updatesalary(@Param("eid") int eid,@Param("s1") double salary);
 
}
