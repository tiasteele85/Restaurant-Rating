package co.grandcircus.restaurantrating.entity;

import javax.persistence.*;

@Entity
@Table(name="restaurants")
public class Restaurant {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 60)
	private String name;	
	private int rating;
	
	public Restaurant() {}

	public Restaurant(Long id, String name, int rating) {
		this.id = id;
		this.name = name;
		this.rating = rating;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}
	
	
}
