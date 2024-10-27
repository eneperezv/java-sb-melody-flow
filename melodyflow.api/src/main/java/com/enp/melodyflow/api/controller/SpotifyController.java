package com.enp.melodyflow.api.controller;

import java.util.Date;

/*
 * @(#)SpotifyController.java 1.0 25/10/2024
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

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enp.melodyflow.api.dto.UserDto;
import com.enp.melodyflow.api.model.ErrorDetails;
import com.enp.melodyflow.api.model.ResponseDetails;
import com.enp.melodyflow.api.service.SpotifyApiService;

@RestController
@RequestMapping("/api/v1/melodyflow/spotify")
public class SpotifyController {
	
	private final SpotifyApiService spotifyApiService;

    public SpotifyController(SpotifyApiService spotifyApiService) {
        this.spotifyApiService = spotifyApiService;
    }
    
    // Endpoint para buscar un artista por nombre
    @GetMapping("/artist/search/{name}")
    public ResponseEntity<Map<String, Object>> searchArtistByName(@PathVariable String name) {
        Map<String, Object> artistData = spotifyApiService.searchArtistByName(name);
        return ResponseEntity.ok(artistData);
    }
    
    
    
    /*
    @GetMapping("/artist/search/{name}")
	public ResponseDetails<?> getUser(@PathVariable Long id){
		UserDto userDto;
		try {
			userDto = userService.findById(id);
			if(userDto == null) {
				ErrorDetails err = new ErrorDetails(new Date(),HttpStatus.NOT_FOUND.toString(),"User <"+userDto+"> not found");
				return new ResponseDetails<String>("ERROR",new Date(),new ResponseEntity<String>("NOT_FOUND", HttpStatus.NOT_FOUND));
			}
			return new ResponseDetails<UserDto>("OK",new Date(),new ResponseEntity<UserDto>(userDto, HttpStatus.OK));
		}catch(Exception e) {
			ErrorDetails err = new ErrorDetails(new Date(),HttpStatus.INTERNAL_SERVER_ERROR.toString(),e.getMessage());
			return new ResponseDetails<ErrorDetails>("ERROR",new Date(),new ResponseEntity<ErrorDetails>(err, HttpStatus.INTERNAL_SERVER_ERROR));
		}
	}
	*/
    @GetMapping("/track/{trackId}")
    public ResponseEntity<Map<String, Object>> getTrack(@PathVariable String trackId) {
        Map<String, Object> trackData = spotifyApiService.getTrack(trackId);
        return ResponseEntity.ok(trackData);
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
