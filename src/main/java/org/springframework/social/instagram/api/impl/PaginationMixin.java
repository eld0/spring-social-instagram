package org.springframework.social.instagram.api.impl;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
abstract class PaginationMixin {
	@JsonCreator
	PaginationMixin(
			@JsonProperty("next_url") String nextUrl,
			@JsonProperty("next_max_id") long nextMaxId,
			@JsonProperty("next_min_id") long nextMinId) {}
}
