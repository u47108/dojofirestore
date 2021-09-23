package cl.dojo.sample.samplefirestore.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.dojo.sample.samplefirestore.entity.Metadata;
import cl.dojo.sample.samplefirestore.repository.MetadataRepository;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/sample/v1")
public class SampleController {

  @Autowired
  MetadataRepository metadataRepository;

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Metadata> saveMetadata(@Validated @RequestBody Metadata entity) {
    log.info("init saveMetadata ");
    Metadata result = metadataRepository.save(entity);
    if (result.getId() != null) {
      return new ResponseEntity<>(result, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(result, HttpStatus.CONFLICT);
    }
  }

  @GetMapping("/getbyId/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Metadata> consultMetadata(@Validated @PathVariable String id) {
    log.info("init consultMetadata ");
    Optional<Metadata> result = metadataRepository.findById(Long.valueOf(id));
    if (result.isPresent()) {
      return new ResponseEntity<>(result.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
  }

  @DeleteMapping("/deletebyId/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Metadata> delMetadata(@Validated @PathVariable String id) {
    log.info("init delMetadata ");
    metadataRepository.deleteById(Long.valueOf(id));
    Optional<Metadata> result = metadataRepository.findById(Long.valueOf(id));
    if (result.isPresent()) {
      return new ResponseEntity<>(result.get(), HttpStatus.CONFLICT);
    } else {
      return new ResponseEntity<>(null, HttpStatus.OK);
    }
  }

  @PutMapping("/updatebyId/{id}")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<Metadata> updateMetadata(@Validated @PathVariable String id,
      @Validated @RequestBody Metadata entity) {
    log.info("init updateMetadata ");

    Optional<Metadata> result = metadataRepository.findById(Long.valueOf(id));
    if (result.isPresent()) {
      entity.setId(result.get().getId());
      return new ResponseEntity<>(metadataRepository.save(entity), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
  }
}
