package com.example.edt.resource;


import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/edt")
@ResponseBody
//@CrossOrigin("http://localhost")
public class EdtResource {
    @GetMapping("/trt")
    public List<String> getAll(){
        List<String> tes = new ArrayList<>();
        tes.add("aslan akbi");
        return tes;
    }
    @PostMapping
    public List<String> generate(@RequestBody List<String>  emp){
        List<String> tes = new ArrayList<>();
            tes.add("abdellatif");
        return emp;
    }
}
