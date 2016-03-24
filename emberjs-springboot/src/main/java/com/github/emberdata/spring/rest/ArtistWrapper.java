package com.github.emberdata.spring.rest;

import com.github.emberdata.spring.domain.Artist;

class ArtistWrapper {

  private Artist artist;

  public ArtistWrapper(Artist artist) {
    this.artist = artist;
  }

  public Artist getArtist() {
    return artist;
  }
}
