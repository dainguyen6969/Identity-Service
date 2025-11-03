package com.devteria.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devteria.identityservice.entity.Role;

public interface RoleRepository extends JpaRepository<Role, String> {}
