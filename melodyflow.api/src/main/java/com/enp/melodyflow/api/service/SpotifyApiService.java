package com.enp.melodyflow.api.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpotifyApiService {
	
	private final SpotifyAuthService spotifyAuthService;
	private final RestTemplate restTemplate;

    @Value("${spotify.api.url}")
    private String apiUrl;

    public SpotifyApiService(SpotifyAuthService spotifyAuthService) {
        this.spotifyAuthService = spotifyAuthService;
        this.restTemplate = new RestTemplate();
    }
    
    private HttpEntity<String> createAuthHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(spotifyAuthService.getAccessToken());
        return new HttpEntity<>(headers);
    }

    public Map<String, Object> getTrack(String trackId) {
        String url = apiUrl + "/tracks/" + trackId;
        /*HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(spotifyAuthService.getAccessToken());

        HttpEntity<String> entity = new HttpEntity<>(headers);*/
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.GET, createAuthHeader(), Map.class);
        return response.getBody();
    }
    
 // Obtener detalles de un artista por nombre
    public Map<String, Object> searchArtistByName(String artistName) {
        String url = apiUrl + "/search?q=" + artistName + "&type=artist&limit=1";
        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.GET, createAuthHeader(), Map.class);
        return response.getBody();
    }

    // Obtener lista de canciones de un álbum
    public Map<String, Object> getAlbumTracks(String albumId) {
        String url = apiUrl + "/albums/" + albumId + "/tracks";
        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.GET, createAuthHeader(), Map.class);
        return response.getBody();
    }

    // Obtener una playlist por ID
    public Map<String, Object> getPlaylist(String playlistId) {
        String url = apiUrl + "/playlists/" + playlistId;
        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.GET, createAuthHeader(), Map.class);
        return response.getBody();
    }

}
