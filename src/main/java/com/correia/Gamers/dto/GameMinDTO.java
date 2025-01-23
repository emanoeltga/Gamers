package com.correia.Gamers.dto;

import com.correia.Gamers.model.Game;
import com.correia.Gamers.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getGame_year();
		imgUrl = entity.getImg_url();
		shortDescription = entity.getShort_description();
	}

	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getGameYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
}
