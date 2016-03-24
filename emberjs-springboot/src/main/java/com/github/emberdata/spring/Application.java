package com.github.emberdata.spring;

import com.github.emberdata.spring.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Autowired
  private AlbumRepository albumRepository;

  @Autowired
  private ArtistRepository artistRepository;

  @PostConstruct
  void createSampleData() {
    if (artistRepository.count() == 0) {
      artistRepository.save(artists());
    }
    if (albumRepository.count() == 0) {
      albumRepository.save(albums());
    }

  }

  private List<Artist> artists() {
    return Arrays.asList(new Artist("U2"));
  }

  List<Album> albums() {
    return Arrays.asList(achtungBaby());

  }

  private Album achtungBaby() {
    return new Album(artistRepository.findByName("U2"), "Achtung Baby", 1991,
        Arrays.asList(
            new Track("Zoo Station"),
            new Track("Even Better Than the Real Thing"),
            new Track("One"),
            new Track("Until the End of the World"),
            new Track("Who's Gonna Ride your Wild Horses"),
            new Track("So Cruel"),
            new Track("The Fly"),
            new Track("Mysterious Ways"),
            new Track("Trying to Throw your Arms Around the World"),
            new Track("Ultraviolet (Light my Way)"),
            new Track("Acrobat"),
            new Track("Love is Blindness")
        )
    );
  }
}
