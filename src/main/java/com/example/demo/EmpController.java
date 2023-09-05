package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(value = "/emp")

public class EmpController {
    private final Logger LOG = LoggerFactory.getLogger(getClass());
    @Autowired
    private EmpRepository repository;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Emp add(@RequestBody Emp emp) {
        LOG.info("Saving  . " + emp.toString());
        Emp emp1 = new Emp();
        emp1.setName(emp.getName());
        emp1 = repository.save(emp1);
        return emp1;
    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Emp> get() {
        return repository.findAll();
    }
}