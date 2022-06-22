package com.entertainment.kpop.controller;

import com.entertainment.kpop.domain.Agency;
import com.entertainment.kpop.domain.Artist;
import com.entertainment.kpop.dto.ArtistDto;
import com.entertainment.kpop.service.AgencyService;
import com.entertainment.kpop.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {
    @Autowired
    ArtistService artistService;

    @Autowired
    AgencyService agencyService;

    @GetMapping
    public List<Artist> getArtists() {
        List<Artist> res = artistService.findAll();
        return artistService.findAll();
    }

    @GetMapping("/{id}")
    public Artist getArtist(@PathVariable("id") int id) {
        return artistService.findById(id);
    }

    @PostMapping
    public Artist insertArtist(@RequestBody ArtistDto dto) {
        Agency agency = agencyService.findById(dto.getAgency().getId());

        Artist artist = new Artist();

        return artistService.save(artist);
    }

    @PutMapping("/{id}")
    public Artist updateArtist(@PathVariable("id") int id, @RequestBody Artist request) {
        Artist artist = artistService.findById(id);

        artist = update(request, artist);
        return artist;
    }

    private Artist update(Artist request, Artist artist) {
        artist.setAgency(request.getAgency());
        artist.setDescription(request.getDescription());
        artist.setDebutData(request.getDebutData());
        artist.setImg(request.getImg());
        artist.setName(request.getName());

        artistService.save(artist);
        return artist;
    }

    @DeleteMapping("{id}")
    public int deleteArtist(@PathVariable int id) {
        artistService.delete(id);
        return id;
    }
}
