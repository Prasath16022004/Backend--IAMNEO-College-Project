package com.e727821tuit114.reciperealm.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.e727821tuit114.reciperealm.Repository.interFace;
import com.e727821tuit114.reciperealm.model.food;

@Service
public class foodservice {
@Autowired

	interFace i;
	public Iterable<food> get()
	{
		return i.findAll();
	}
	public String Delete(@PathVariable("id") int id)
	{
		i.deleteById(id);
		return "Id : "+id+" is deleted";
	}
	public String Post(@RequestBody food b1)
	{
		i.save(b1);
		return "food Details Successfully Saved In The DataBase";
	}
	public food Update(@RequestBody food b)
	{
		System.out.println("The Changes Made Have Been Successfully Updated");
		return i.save(b);
		
	}
	
	public Iterable<food> sortfood(String field)
	{
		return i.findAll(Sort.by(field));
	}
	
	public Page<food>pagingfood(int page,int pagesize)
	{
		Pageable paging = PageRequest.of(page,pagesize);
		return i.findAll(paging);
	}
	
	public Page<food> pagingAndSortingfood(int offset, int pageSize, String field)
	{
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		return i.findAll(paging);
	}
	
}