package com.exmaple.jenkinslearning;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author amitkumar
 */
@RestController
@RequestMapping("/test")
public class MyController {

  @GetMapping
  public ResponseEntity<String> get() {
    return ResponseEntity.ok("hello world");
  }

  @PostMapping
  public ResponseEntity<String> create(@RequestBody String payload) {
    return new ResponseEntity<>(payload, HttpStatus.CREATED);
  }

  @PutMapping
  public ResponseEntity<String> update(@RequestBody String payload) {
    return new ResponseEntity<>(payload, HttpStatus.CREATED);
  }

  @DeleteMapping
  public ResponseEntity<Void> delete() {
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
