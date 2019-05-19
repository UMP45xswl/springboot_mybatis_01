package com.no1.cz.domain;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	private int userId;
	private String userName;
	private Date userCreateTime;
}

