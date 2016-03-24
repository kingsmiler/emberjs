package com.github.emberdata.spring.rest;

import com.github.emberdata.spring.domain.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/artists")
public class ArtistController {

  @Autowired
  ArtistRepository repository;

  @RequestMapping(method = RequestMethod.GET)
  ArtistsWrapper index() {
    return new ArtistsWrapper(repository.findAll());
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  ArtistWrapper get(@PathVariable("id") long id) {
    return new ArtistWrapper(repository.findOne(id));

  }
}
