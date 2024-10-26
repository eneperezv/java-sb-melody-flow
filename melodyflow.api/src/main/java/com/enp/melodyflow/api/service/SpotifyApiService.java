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

    @Value("${spotify.api.url}")
    private String apiUrl;

    public SpotifyApiService(SpotifyAuthService spotifyAuthService) {
        this.spotifyAuthService = spotifyAuthService;
    }

    public Map<String, Object> getTrack(String trackId) {
        String url = apiUrl + "/tracks/" + trackId;
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(spotifyAuthService.getAccessToken());

        HttpEntity<String> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.GET, entity, Map.class);
        return response.getBody();
    }

}
