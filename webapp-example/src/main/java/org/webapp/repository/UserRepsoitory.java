package org.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.webapp.bean.User;

@Repository
public interface UserRepsoitory extends JpaRepository<User, Long>{

}
