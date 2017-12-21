package com.demo.persistence.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class DemoDaoImpl implements DemoDao {

	public List<String> getDemo() {
		String [] lista = {"bbbb","ccc","aaa"};
		return Arrays.asList(lista);
	}

}
