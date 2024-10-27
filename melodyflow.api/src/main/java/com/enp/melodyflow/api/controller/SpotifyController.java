package com.enp.melodyflow.api.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enp.melodyflow.api.service.SpotifyApiService;

@RestController
@RequestMapping("/api/v1/melodyflow/spotify")
public class SpotifyController {
	
	private final SpotifyApiService spotifyApiService;

    public SpotifyController(SpotifyApiService spotifyApiService) {
        this.spotifyApiService = spotifyApiService;
    }

    @GetMapping("/track/{trackId}")
    public ResponseEntity<Map<String, Object>> getTrack(@PathVariable String trackId) {
        Map<String, Object> trackData = spotifyApiService.getTrack(trackId);
        return ResponseEntity.ok(trackData);
    }
    
    // Endpoint para buscar un artista por nombre
    @GetMapping("/artist/search/{name}")
    public ResponseEntity<Map<String, Object>> searchArtistByName(@PathVariable String name) {
        Map<String, Object> artistData = spotifyApiService.searchArtistByName(name);
        return ResponseEntity.ok(artistData);
    }
    
    // Endpoint para obtener discografia de artista
    

    // Endpoint para obtener canciones de un álbum por ID
    @GetMapping("/album/{albumId}/tracks")
    public ResponseEntity<Map<String, Object>> getAlbumTracks(@PathVariable String albumId) {
        Map<String, Object> albumTracks = spotifyApiService.getAlbumTracks(albumId);
        return ResponseEntity.ok(albumTracks);
    }

    // Endpoint para obtener una playlist por ID
    @GetMapping("/playlist/{playlistId}")
    public ResponseEntity<Map<String, Object>> getPlaylist(@PathVariable String playlistId) {
        Map<String, Object> playlistData = spotifyApiService.getPlaylist(playlistId);
        return ResponseEntity.ok(playlistData);
    }

}
