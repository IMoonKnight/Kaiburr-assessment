package com.Kaiburrassessment.Springboot.model;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v3/kaiburr")
@RequiredArgsConstructor
public class Controller {

    private final KaiburService service;
    @PostMapping
    public ResponseEntity<String> save(
            @RequestBody assessment a1
    ){
        return ResponseEntity.ok(service.save(a1));
    }

    @GetMapping
    public ResponseEntity<List<assessment>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{a-id}")
    public ResponseEntity<assessment> findById(
            @PathVariable("a-id") String a_id
    ){
        return ResponseEntity.ok(service.findById(a_id));
    }

    @DeleteMapping("/{a-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("a-id") String a_id
    ){
        service.delete(a_id);
        return ResponseEntity.accepted().build();
    }


}
