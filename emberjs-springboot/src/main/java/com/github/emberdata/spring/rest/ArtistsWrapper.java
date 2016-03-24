package com.github.emberdata.spring.rest;

import com.github.emberdata.spring.domain.Artist;

import java.util.List;

public class ArtistsWrapper {

  private List<Artist> artists;

  public ArtistsWrapper(List<Artist> artists) {
    this.artists = artists;
  }

  public List<Artist> getArtists() {
    return artists;
  }
}
