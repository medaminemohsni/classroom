package com.courzelo.classroom.entities;



import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="Formation")

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Formation {
	

	   @Transient
    public static final String SEQUENCE_NAME = "database_sequences";
	    
	    @Id
	    @Field(value = "IdFormation")
	    private long idFormation;

	    @Field(value = "Title")
	    private String title;

	
	    @Field(value = "Duaration")
	    private String duaration;
	
	    @Field(value = "Creator")
	    private String creator;
	    
	    @Field(value = "Leactures")
	    private String leactures;
	    
	    @Field(value = "Quizzes")
	    private String quizzes;
	    
	    @Field(value = "Price")
	    private String price;
	    
	    @Field(value = "Teacher")
	    private String teacher;
	    
	    @Field(value = "Students")
	    private String students;
	    
	    @Field(value = "Category")
	    private String category;
	    

	    @Field(value = "Description")
	    private String description;
}
