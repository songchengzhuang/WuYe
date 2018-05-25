package tsu.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tsu.pro.bean.Info;
import tsu.pro.bean.Owner;
import tsu.pro.bean.Stuts;
import tsu.pro.service.OwnerService;

@RestController
@RequestMapping(value = "/owner")
public class ownerController {
	@Autowired
 private	OwnerService ownerservice;
	/**
	 * 插入业主信息
	 */
	@RequestMapping(value ="/", method = RequestMethod.POST)
	public Stuts createUser(@ModelAttribute Owner owner) {
	 return	ownerservice.insertOwner(owner);
	

	}
	/**
	 * 查询业主  
	 * ID
	 */
	@RequestMapping(value ="/ownerID/{id}", method = RequestMethod.GET)
	public Info<Owner> findbyID(@PathVariable("id")  int ownerID) {
		System.out.println(ownerID);
	
	 return	ownerservice.selectById(ownerID);
	
	}
	/**
	 * 查业主列表
	 */
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public Info<Owner> findList() {
	 return	ownerservice.findList();
	
	}
     /**
      * 模糊查询业主信息
      */
	@RequestMapping(value ="/{name}", method = RequestMethod.GET)
	public Info<Owner> findlike(@PathVariable("name")  String name) {
	 return	ownerservice.findLike(name);
	
	}
	@RequestMapping(value ="/delete/{id}", method = RequestMethod.GET)
	public Stuts deleteByID(@PathVariable("id")  int ownerID) {
	 return	ownerservice.deleteByID(ownerID);
	
	}
	@RequestMapping(value ="/update", method = RequestMethod.POST)
	public Stuts update(@ModelAttribute Owner owner) {
	 return	ownerservice.update(owner);
	
	}
	
}
