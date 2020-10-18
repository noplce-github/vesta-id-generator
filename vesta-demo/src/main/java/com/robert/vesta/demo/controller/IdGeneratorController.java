package com.robert.vesta.demo.controller;

import com.robert.vesta.service.bean.Id;
import com.robert.vesta.service.intf.IdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "")
public class IdGeneratorController {

    @Autowired
    IdService idService;

    @GetMapping("/genId")
    public Long genId(){
        return idService.genId();
    }

    @GetMapping("/expId")
    public Id expId(Long id){
        return idService.expId(id);
    }

}
