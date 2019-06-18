package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
//@AllArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

	@Id
	@NonNull
	private Integer aid;
	private String aname;
	private Double asal;
}
