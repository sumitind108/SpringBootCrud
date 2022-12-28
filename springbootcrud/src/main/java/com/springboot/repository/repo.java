package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.bean.sub;

public interface repo extends CrudRepository<sub, String> {

}
