package com.correia.Gamers.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "tb_game")
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private int game_year;
	private String genre;
	private String platforms;
	private Double score;
	private String img_url;
	@Column(columnDefinition = "TEXT")
	private String short_description;
	@Column(columnDefinition = "TEXT")
	private String long_description;
}
