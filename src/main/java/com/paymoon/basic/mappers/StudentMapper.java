package com.paymoon.basic.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.paymoon.basic.po.Student;

public interface StudentMapper {
	
	@Insert("INSERT INTO student(id,userName, password, firstName,"
			+ "lastName, dateOfBirth, emailAddress) VALUES"
			+ "(#{id},#{userName},#{password}, #{firstName}, #{lastName},"
			+ "#{dateOfBirth}, #{emailAddress})")
	@Options(useGeneratedKeys=true, keyProperty="id", flushCache=true, keyColumn="id")
	public void insertStudent(Student student);
		
	@Select("SELECT USERNAME as userName, PASSWORD as password, "
			+ "FIRSTNAME as firstName, LASTNAME as lastName, "
			+ "DATEOFBIRTH as dateOfBirth, EMAILADDRESS as emailAddress "
			+ "FROM student WHERE userName = #{userName}")
	public Student getStudentByUserName(String userName);
	
	@Select("SELECT * FROM student WHERE  1=1 AND userName = #{userName} ")
	@Results({ 
		@Result(column = "userName", property = "userName"),
		@Result(column = "password", property = "password"),
		@Result(column = "firstName", property = "firstName"),
		@Result(column = "lastName", property = "lastName"),
		@Result(column = "dateOfBirth", property = "dateOfBirth"),
		@Result(column = "emailAddress", property = "emailAddress")
		}) 
	/**
	 * 使用注解Result达到字段映射的目的（因为Student都一样，所以这里只是一个样子）
	 */
	public Student getStudentByUserNameViaResultsAnnotations(String userName);
	@Select("SELECT * FROM student WHERE  1=1 AND userName = #{userName} And id = #{id}")
	@Results({ 
		@Result(column = "userName", property = "userName"),
		@Result(column = "password", property = "password"),
		@Result(column = "firstName", property = "firstName"),
		@Result(column = "lastName", property = "lastName"),
		@Result(column = "dateOfBirth", property = "dateOfBirth"),
		@Result(column = "emailAddress", property = "emailAddress")
	}) 
	/**
	 * 使用注解Result达到字段映射的目的（因为Student都一样，所以这里只是一个样子）
	 */
	public Student getStudentByUserNameViaResultsAnnotationsMultipleParam(String userName,String id);


}
