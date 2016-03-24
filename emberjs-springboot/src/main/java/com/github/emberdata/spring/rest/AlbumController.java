package com.github.emberdata.spring.rest;

import com.github.emberdata.spring.domain.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/albums")
public class AlbumController {

  @Autowired
  private AlbumRepository repository;

  @RequestMapping(method = RequestMethod.GET)
  AlbumsWrapper index() {
    return new AlbumsWrapper(repository.findAll());
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  AlbumWrapper get(@PathVariable("id") long id) {
    return new AlbumWrapper(repository.findOne(id));

  }
}
