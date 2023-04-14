package com.dxc.cab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dxc.cab.model.UserDetails;

@Repository
@Transactional
public interface UserDetailsDao extends JpaRepository<UserDetails, String> {

}
