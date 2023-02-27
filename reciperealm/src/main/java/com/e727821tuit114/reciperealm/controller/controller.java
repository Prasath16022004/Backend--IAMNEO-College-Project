package com.e727821tuit114.reciperealm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.e727821tuit114.reciperealm.Service.foodservice;
import com.e727821tuit114.reciperealm.model.food;

@RestController
	
public class controller {

	@Autowired
	foodservice f1;
	
	@GetMapping("/get")
	public Iterable<food> getDetails()
	{
		return f1.get();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		f1.Delete(id);
		return "Id : "+id+" is deleted";
	}
	
	@PostMapping("/post")
	public String postDetails(@RequestBody food b1)
	{
		return f1.Post(b1);
		
	}
	
	@PutMapping("/put/{id}")
	public food updatefoodDetails(@RequestBody food b)
	{
		
		return f1.Update(b);
		
	}
																		
	//sorting
		@GetMapping("/sortfood/{field}")
		public Iterable<food> getfoodSorted(@PathVariable("field")String str)
		{
			return f1.sortfood(str);
		}
		
		//paging
		@GetMapping(value="/pagingfood/{pageNo}/{pageSize}")
		Page<food> foodPaging(@PathVariable("pageNo")int pageno,@PathVariable("pageSize")int pagesize){
			return f1.pagingfood(pageno,pagesize);
			
		}

		//paging and sorting
	    @GetMapping(value = "/pagingSortingfood/{pageNo}/{pageSize}/{field}")
		Page<food> foodPagingAndSorting(@PathVariable ("pageNo") int pageno,
				@PathVariable ("pageSize") int pageSize,@PathVariable ("field")String field) {
			return f1.pagingAndSortingfood(pageno, pageSize,field);

		}
	
	
	
}