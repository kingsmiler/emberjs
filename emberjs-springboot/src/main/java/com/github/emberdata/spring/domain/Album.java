package com.github.emberdata.spring.domain;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;


@Entity
@JsonRootName("album")
public class Album extends AbstractEntity {

  private int year;

  private String title;

  @ManyToOne
  private Artist artist;

  @ElementCollection
  private List<Track> tracks = new ArrayList<>();

  protected Album() {
  }

  public Album(Artist artist, String title, int year, List<Track> tracks) {
    setArtist(artist);
    setYear(year);
    setTitle(title);
    setTracks(new ArrayList<>(tracks));
  }

  public Artist getArtist() {
    return artist;
  }

  public void setArtist(Artist artist) {
    this.artist = artist;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public List<Track> getTracks() {
    return tracks;
  }

  public void setTracks(List<Track> tracks) {
    int number = 1;
    for (Track track : tracks) {
      track.setNumber(number++);
    }
    this.tracks = tracks;
  }

}
