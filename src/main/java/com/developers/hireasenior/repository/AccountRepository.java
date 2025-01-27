package com.developers.hireasenior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.developers.hireasenior.model.Account;


public interface AccountRepository extends JpaRepository<Account, String>  {
    Account findByEmail(String email);
}
