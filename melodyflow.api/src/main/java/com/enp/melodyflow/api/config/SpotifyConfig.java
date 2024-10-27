package com.enp.melodyflow.api.config;

/*
 * @(#)SpotifyConfig.java 1.0 25/10/2024
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
