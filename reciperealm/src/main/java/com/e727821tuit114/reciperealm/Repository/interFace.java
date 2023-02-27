//package com.example.demo.Repository;





package com.e727821tuit114.reciperealm.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.e727821tuit114.reciperealm.model.food;
@Repository
public interface interFace extends CrudRepository<food, Integer>,PagingAndSortingRepository<food, Integer>
{

	
}


