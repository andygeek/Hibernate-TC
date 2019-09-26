package com.andygeek.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course implements Serializable{
	
	@Id
	@Column(name = "id_course")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCourse;
	@Column(name = "name")
	private String name;
	@Column(name = "themes")
	private String themes;
	@Column(name = "project")
	private String project;
	
	//Aqui se coloca la etiqueta inversa
	//Queremos añadir un curso sin necesidad de añadir un teacher osea es opcional
	//el fectch forzara el manejador para que nos devuelva los datos de teacher
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	//Nombre del campo que esta en la tabla course y estoy intentando mapear
	@JoinColumn(name="id_teacher")
	private Teacher teacher;
		
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Course(String name, String themes, String project, Teacher teacher) {
		super();
		this.name = name;
		this.themes = themes;
		this.project = project;
		this.teacher = teacher;
	}

	public long getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(long idCourse) {
		this.idCourse = idCourse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThemes() {
		return themes;
	}
	public void setThemes(String themes) {
		this.themes = themes;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
	
	
}
