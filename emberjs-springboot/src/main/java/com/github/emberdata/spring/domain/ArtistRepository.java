package com.github.emberdata.spring.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

  public Artist findByName(String name);

}
