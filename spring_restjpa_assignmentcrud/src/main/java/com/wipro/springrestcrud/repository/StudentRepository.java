package com.wipro.springrestcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.wipro.springrestcrud.entity.Student;

public interface StudentRepository extends  JpaRepository<Student, Integer> {
	  public Student findByename(String ename);
	  public List<Student>  findBysalaryGreaterThan(double salary);
	  public List<Student> findBysalaryLessThan(double salary);
	 @Query("select e from Student e order by e.ename desc")
	  public List<Student> getallsort();
	 @Query("select e from Student e  where salary between ?1 and ?2")
	 public List<Student> findsalarybtw(double a,double b);

 public double getsum();
//	@NativeQuery("select count(*) from student_practise")
	// public int getcountbynative();
	 public Student selectbyeid(int eid);
	 @Modifying
	 @Query("update Student e set e.salary=:s1 where e.eid=:s2")
	 public void updatesalary(@Param("s2") int eid,@Param("s1") double salary);


}
