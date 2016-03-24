package com.github.emberdata.spring.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

  @GeneratedValue
  @Id
  private Long id;

  public final Long getId() {
    return id;
  }
}
