package com.github.emberdata.spring.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Embeddable;

/*
 * Ember data requires object identity, even for embedded objects. I.e. for example that have composition relationship.
 * In this example domain, Tracks are an intrinsic part of an Album.
 */
@Embeddable
@JsonIdentityInfo(property = "id", generator = ObjectIdGenerators.UUIDGenerator.class)
public class Track {

  private int number;

  private String title;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  protected Track() {
  }

  public Track(String title) {
    this.title = title;
  }
}
