package com.enp.melodyflow.api.service;

/*
 * @(#)SpotifyAuthService.java 1.0 25/10/2024
 * 
 * El código implementado en este formulario esta protegido
 * bajo las leyes internacionales del Derecho de Autor, sin embargo
 * se entrega bajo las condiciones de la General Public License (GNU GPLv3)
 * descrita en https://www.gnu.org/licenses/gpl-3.0.html
 */

/**
 * @author eliezer.navarro
 * @version 1.0
 * @since 1.0
 */

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import io.github.cdimascio.dotenv.Dotenv;

@Service
public class SpotifyAuthService {
	
	private final Dotenv dotenv = Dotenv.load();
    
    private final String clientId;
    private final String clientSecret;

    public SpotifyAuthService() {
        this.clientId = dotenv.get("SPOTIFY_CLIENT_ID");
        this.clientSecret = dotenv.get("SPOTIFY_CLIENT_SECRET");
    }
	/*
	@Value("${spotify.client.id}")
    private String clientId;

    @Value("${spotify.client.secret}")
    private String clientSecret;
	*/
    @Value("${spotify.auth.url}")
    private String authUrl;

    private String accessToken;

    public String getAccessToken() {
        if (accessToken == null || isTokenExpired()) {
            accessToken = requestNewAccessToken();
        }
        return accessToken;
    }

    private String requestNewAccessToken() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.setBasicAuth(clientId, clientSecret);

        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("grant_type", "client_credentials");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(params, headers);
        ResponseEntity<Map> response = restTemplate.postForEntity(authUrl, request, Map.class);
        return (String) response.getBody().get("access_token");
    }

    private boolean isTokenExpired() {
        // Implementa la lógica para verificar si el token ha expirado
        return false;
    }

}
