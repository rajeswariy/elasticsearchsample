/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface EmployeeRepository extends ElasticsearchRepository<Employee,String> {
    List<Employee> findEmployeesByAge(int age);    
    List<Employee> findEmployeesByName(String name);
    List<Employee> findEmployeesBySkillsIn(List<String> skills);
    Employee findEmployeesById(String id);
}
