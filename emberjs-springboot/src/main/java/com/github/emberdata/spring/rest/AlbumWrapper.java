package com.github.emberdata.spring.rest;

import com.github.emberdata.spring.domain.Album;

class AlbumWrapper {

  private Album album;

  public AlbumWrapper(Album album) {
    this.album = album;
  }

  public Album getAlbum() {
    return album;
  }
}
