package co.grandcircus.restaurantrating.dao;


import java.util.List;

import javax.persistence.*;
import javax.transaction.*;

import org.springframework.stereotype.Repository;

import co.grandcircus.restaurantrating.entity.Restaurant;

@Transactional
@Repository
public class RestaurantDao {

	@PersistenceContext
	EntityManager em;
	
	public List<Restaurant> findAll(){
		return em.createQuery("FROM Restaurant", Restaurant.class).getResultList();
	}
	
	public Restaurant findById(Long id) {
		return em.find(Restaurant.class, id);
	}
	
	public void create(Restaurant restaurant) {
		em.persist(restaurant);
	}
	
	public void delete(Long id) {
		Restaurant restaurant = em.getReference(Restaurant.class, id);
		em.remove(restaurant);
	}
	
	public void edit(Restaurant restaurant) {
		em.merge(restaurant);
	}
}
