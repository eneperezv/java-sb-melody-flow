package com.enp.melodyflow.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.cdimascio.dotenv.Dotenv;

@Configuration
public class SpotifyConfig {
	
	private final Dotenv dotenv;

    public SpotifyConfig() {
        this.dotenv = Dotenv.configure().ignoreIfMissing().load(); // Ignora si no encuentra el archivo
    }

    @Bean
    public String spotifyClientId() {
        return dotenv.get("SPOTIFY_CLIENT_ID");
    }

    @Bean
    public String spotifyClientSecret() {
        return dotenv.get("SPOTIFY_CLIENT_SECRET");
    }

}
