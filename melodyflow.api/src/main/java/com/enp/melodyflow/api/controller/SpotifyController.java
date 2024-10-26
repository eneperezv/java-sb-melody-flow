package com.enp.melodyflow.api.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
