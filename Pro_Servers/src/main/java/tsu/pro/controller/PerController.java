package tsu.pro.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tsu.pro.bean.PerInfo;
import tsu.pro.bean.Permission;
import tsu.pro.bean.RoleInfo;
import tsu.pro.service.PerService;

@RestController
@RequestMapping(value="/per")
public class PerController {
	@Autowired
	PerService perservice;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public PerInfo<Permission> findlist(){
		return perservice.findlist();
		
	}
    
	@RequestMapping(value = "/{role_id}/{per_id}", method = RequestMethod.GET)
	 public  PerInfo<Permission> roleAddPer(@PathVariable("role_id") String role_id,@PathVariable("per_id") String per_id){
		   return perservice.roleAddPer(role_id,per_id);
	   }
}
