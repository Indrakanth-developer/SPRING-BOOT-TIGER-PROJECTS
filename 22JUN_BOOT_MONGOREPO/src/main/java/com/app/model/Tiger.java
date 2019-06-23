package com.app.model;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document

public class Tiger {

	@Id
	private String id;
	
	@NonNull
	private Integer aid;
	@NonNull
	private String aname;
	
	public Tiger(String id, @NonNull Integer aid, @NonNull String aname) {
		super();
		this.id = id;
		this.aid = aid;
		this.aname = aname;
	}



	
	
}
