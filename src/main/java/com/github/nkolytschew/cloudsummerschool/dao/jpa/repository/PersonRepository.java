package com.github.nkolytschew.cloudsummerschool.dao.jpa.repository;

import com.github.nkolytschew.cloudsummerschool.dao.jpa.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
 * only mandatory field is 'path'.
 */
@RepositoryRestResource(collectionResourceRel = "person", path = "persons")
public interface PersonRepository extends CrudRepository<Person, Long> {
}
