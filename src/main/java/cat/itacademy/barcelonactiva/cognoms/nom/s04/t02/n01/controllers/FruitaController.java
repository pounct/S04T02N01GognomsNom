package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.services.FruitaService;

@RestController
public class FruitaController implements IFruitaController {

	@Autowired
	FruitaService fruitaService;

	@PostMapping("/fruita/add")
	@Override
	public void add(@RequestBody Fruita fruita) {
		// add fruita
		fruitaService.add(fruita);
	}

	@PutMapping("/fruita/update")
	@Override
	public void update(@RequestBody Fruita fruita) {
		// update fruita
		fruitaService.update(fruita);
	}

	@DeleteMapping("/fruita/delete/{id}")
	@Override
	public void delete(@PathVariable("id") Long id) {
		// delete fruita
		fruitaService.delete(id);
	}

	@Override
	@GetMapping("/fruita/getOne/{id}")
	public Optional<Fruita> getOne(@PathVariable("id") Long id) {
		return fruitaService.getOne(id);
	}

	@GetMapping("/fruita/getAll")
	@Override
	public List<Fruita> getAll() {
		// getAll Fruites
		return fruitaService.getAll();
	}

}
