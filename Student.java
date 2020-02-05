package com.prog39599.ThymeLeaf;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//An entity represents a table stored in a database 
//Every instance of that entity is a record or a row in the database


//You can use H2 for persistant data, but dont

//H2 is good for testing purposes

//@Entity is always defined at class level


@Entity //We want to store Student objects in our DB
public class Student {

		@Id
		@GeneratedValue
		private Long id;
		private String name;
		private String password;
		
}
