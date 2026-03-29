package hiber;

import java.time.LocalDate;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class input {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private int tempid;
	private String name;
	private int people;
	private int number;
	private LocalDate resevation;
	private LocalTime ti;
	@Enumerated(EnumType.STRING)
	private reservation_sta sta;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public LocalDate getResevation() {
		return resevation;
	}
	public void setResevation(LocalDate resevation) {
		this.resevation = resevation;
	}
	public LocalTime getTi() {
		return ti;
	}
	public void setTi(LocalTime ti) {
		this.ti = ti;
	}
	public input( int id,String name, int people, int number, LocalDate resevation, LocalTime ti) {
		super();
		this.id=id;
		this.name = name;
		this.people = people;
		this.number = number;
		this.resevation = resevation;
		this.ti = ti;
	}
	public input() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setStatus(reservation_sta sta) {
		// TODO Auto-generated method stub
		this.sta=sta;
	}
	public reservation_sta getSta() {
		return sta;
	}
	public void setSta(reservation_sta sta) {
		this.sta = sta;
	}
	
	 @Override
	    public String toString() {
	        return "Reservation [id=" + id +
	                ", name=" + name +
	                ", people=" + people +
	                ", number=" + number +
	                ", date=" + resevation +
	                ", time=" + ti +
	                ", status=" + sta + "]";
	    }
	 public int getTempid() {
		 return tempid;
	 }
	 public void setTempid(int tempid) {
		 this.tempid = tempid;
	 }
	 public input(int tempid) {
		super();
		this.tempid = tempid;
	 }
	
	
	
	

}
