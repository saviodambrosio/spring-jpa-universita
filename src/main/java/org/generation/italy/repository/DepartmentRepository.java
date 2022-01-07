package org.generation.italy.repository;

import org.generation.italy.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
//richiamiamo la classe department e long che è associato al tipo di dato dell id
	
}
