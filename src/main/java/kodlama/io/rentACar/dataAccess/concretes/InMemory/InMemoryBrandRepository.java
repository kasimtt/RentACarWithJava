package kodlama.io.rentACar.dataAccess.concretes.InMemory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entity.concretes.Brand;

@Repository  // bu sınıf bir dataAccess nesnesidir.
public class InMemoryBrandRepository implements BrandRepository{

	
	List<Brand> brands;
	
	
	
	public InMemoryBrandRepository() {
		
		brands = new ArrayList<Brand>();
		brands.add(new Brand(1,"BMW"));
		brands.add(new Brand(2,"AUDI"));
		brands.add(new Brand(3,"FIAT"));
		brands.add(new Brand(4,"RENAULT"));
		brands.add(new Brand(5,"MERCEDES"));
		brands.add(new Brand(6,"TESLA"));

	}



	@Override
	public List<Brand> getAll() {
		// TODO Auto-generated method stub
		return brands;
	}

}
