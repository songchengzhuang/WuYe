package tsu.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tsu.pro.bean.Charge;
import tsu.pro.bean.Info;
import tsu.pro.bean.Charge;
import tsu.pro.bean.Stuts;

import tsu.pro.service.chargeService;

@RestController
@RequestMapping(value = "/charge")
public class ChargeController {
 @Autowired
 private chargeService chargeservice;
	/**
	 * 插入缴费信息
	 */
	@RequestMapping(value ="/", method = RequestMethod.POST)
	public Stuts createUser(@ModelAttribute Charge Charge) {
	 return	chargeservice.insertCharge(Charge);
	

	}
	/**
	 * 查询缴费  
	 * ID
	 */
	@RequestMapping(value ="/propid/{id}", method = RequestMethod.GET)
	public Info<Charge> findbyID(@PathVariable("id")  int ChargeID) {
	 return	chargeservice.selectById(ChargeID);
	
	}
	/**
	 * 查缴费列表
	 */
	@RequestMapping(value ="/", method = RequestMethod.GET)
	public Info<Charge> findList() {
	 return	chargeservice.findList();
	
	}
     /**
      * 模糊查询缴费信息
      */
	@RequestMapping(value ="/{ownerID}", method = RequestMethod.GET)
	public Info<Charge> findlike(@PathVariable("ownerID")  int ownerID) {
	 return	chargeservice.findLike(ownerID);
	
	}
	@RequestMapping(value ="/delete/{id}", method = RequestMethod.GET)
	public Stuts deleteByID(@PathVariable("id")  int ChargeID) {
	 return	chargeservice.deleteByID(ChargeID);
	
	}
	@RequestMapping(value ="/update", method = RequestMethod.POST)
	public Stuts update(@ModelAttribute Charge Charge) {
	 return	chargeservice.update(Charge);
	
	}
	
}
