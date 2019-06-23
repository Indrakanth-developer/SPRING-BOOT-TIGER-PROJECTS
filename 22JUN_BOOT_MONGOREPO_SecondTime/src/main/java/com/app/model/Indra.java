package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Indra {

	@Id//optional if u give variable name as id
		private String id;
	
	@NonNull
		private Integer iid;
		@NonNull
		private String iname;
		

}
