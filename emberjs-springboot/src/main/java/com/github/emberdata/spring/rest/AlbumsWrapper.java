package com.github.emberdata.spring.rest;

import com.github.emberdata.spring.domain.Album;

import java.util.List;

class AlbumsWrapper {

  private List<Album> albums;

  public AlbumsWrapper(List<Album> albums) {
    this.albums = albums;
  }

  public List<Album> getAlbums() {
    return albums;
  }
}
