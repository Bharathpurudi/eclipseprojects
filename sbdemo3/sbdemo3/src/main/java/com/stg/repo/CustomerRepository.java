package com.stg.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stg.model.User;
@Repository
public interface CustomerRepository extends CrudRepository<User, Integer>{
	
	//@Query("SELECT u from User u WHERE u.userId = :userId AND u.userName=:userName")
	@Query(value="SELECT * from user  WHERE user_id = :userId AND user_name=:userName",nativeQuery = true)
	public Optional<User> findUserByIdAndName(@Param("userId") int userId, @Param("userName") String userName);

}
