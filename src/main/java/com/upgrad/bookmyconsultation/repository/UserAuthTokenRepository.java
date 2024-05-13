package com.upgrad.bookmyconsultation.repository;

import com.upgrad.bookmyconsultation.entity.UserAuthToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.validation.constraints.NotNull;

@Repository
public interface UserAuthTokenRepository extends CrudRepository<UserAuthToken, String> {

	List<UserAuthToken> findByUserEmailId(@NotNull String userId);

	UserAuthToken findByAccessToken(String token);

}
