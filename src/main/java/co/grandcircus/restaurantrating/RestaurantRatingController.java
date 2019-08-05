package co.grandcircus.restaurantrating;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.restaurantrating.dao.RestaurantDao;
import co.grandcircus.restaurantrating.entity.Restaurant;

@Controller
public class RestaurantRatingController {
	
	@Autowired
	private RestaurantDao rdao; 
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("redirect:/home");
	}
	
	@RequestMapping("/home")
	public ModelAndView showHome() {		
		List<Restaurant> restaurantList = rdao.findAll();
		System.out.println(restaurantList.get(0));
		return new ModelAndView("home", "restaurants", restaurantList);
	}
	
}
