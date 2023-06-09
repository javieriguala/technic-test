package com.aplazo.technictest.repository;

import com.aplazo.technictest.model.Request;
import com.aplazo.technictest.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {

}
