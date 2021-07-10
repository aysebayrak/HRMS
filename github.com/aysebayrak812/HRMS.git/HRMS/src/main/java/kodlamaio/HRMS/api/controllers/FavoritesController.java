package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.HRMS.business.abstracts.FavoriteService;
import kodlamaio.HRMS.entities.concretes.Favorite;

@CrossOrigin
@RequestMapping("/api/favorite")
@RestController
public class FavoritesController {
	
	private FavoriteService favoriteService;

	@Autowired
	public FavoritesController(FavoriteService favoriteService) {
		super();
		this.favoriteService = favoriteService;
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Favorite favorite){
		return ResponseEntity.ok(this.favoriteService.add(favorite));
		
	}
	
	
	@DeleteMapping("/deleteById")
	public ResponseEntity<?> delete(@RequestParam int id){
		return ResponseEntity.ok(this.favoriteService.delete(id));
	}

	
	@GetMapping("/getByCandidateId")
	public ResponseEntity<?> getByCandidateId(@RequestParam int id){
		return ResponseEntity.ok(this.favoriteService.getByCandidateId(id));
	}
	
	
}