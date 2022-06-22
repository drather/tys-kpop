package com.entertainment.kpop.service;

import com.entertainment.kpop.domain.Artist;
import com.entertainment.kpop.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ArtistService {
    @Autowired
    ArtistRepository artistRepository;

    public List<Artist> findAll() {
        return artistRepository.findAll();
    }

    public Artist findById(int id) {
        return artistRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public Artist save(Artist artist) {
        return artistRepository.save(artist);
    }

    public void delete(int id) {
        artistRepository.deleteById(id);
    }

}
