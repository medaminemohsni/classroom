package com.courzelo.classroom.entities.dtos;




import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class FormationDTO {
	
	
	public long id ;
	public String title ;
	public String creator;
	
	public String duaration;
	public String leactures;
	public String quizzes;
	public String price;
	public String teacher;
	public String category;
	public String description ;
	public String students;
	//public List<E> classe;
}

