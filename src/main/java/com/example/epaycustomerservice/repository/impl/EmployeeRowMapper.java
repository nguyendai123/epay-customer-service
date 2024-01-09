package com.example.epaycustomerservice.repository.impl;

import com.example.epaycustomerservice.model.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public abstract class EmployeeRowMapper implements RowMapper<Employee> {
    // Mapping dữ liệu từ ResultSet vào đối tượng Employee
}
