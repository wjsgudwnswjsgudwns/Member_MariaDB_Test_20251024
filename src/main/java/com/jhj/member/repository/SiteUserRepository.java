package com.jhj.member.repository;

import com.jhj.member.entity.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteUserRepository extends JpaRepository<SiteUser, Long> {
}
