package tsu.pro.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tsu.pro.bean.Info;
import tsu.pro.bean.Role;
import tsu.pro.bean.RoleInfo;
import tsu.pro.service.RoleService;


@RestController
@RequestMapping(value="/role")
public class RoleController {
	@Autowired
	RoleService roleservice;

	@RequestMapping(value="/", method = RequestMethod.POST)
	public RoleInfo<Role> addRole(@ModelAttribute Role role){
		System.out.println(role.toString());
		return roleservice.addRole(role);
		
	}

   @RequestMapping(value="/", method=RequestMethod.GET)
   public RoleInfo<Role> findAll(){
	   return roleservice.findAll();
 
   }

   @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
   public RoleInfo<Role> deleteRole(@PathVariable("id") int id){
	   System.out.println(id);
	   return roleservice.deleteRole(id);
	   
   }
   @RequestMapping(value="/{Userid}/{roleid}",method=RequestMethod.GET)
   public RoleInfo userAddRole(@PathVariable("Userid") int userid,@PathVariable("roleid") int roleid){
	  System.out.println(userid+""+roleid);
	   return roleservice.userAddRole(userid,roleid);
   }
   @RequestMapping(value="/{id}",method=RequestMethod.GET)
   public Info<Role> findbyIDToper(@PathVariable("id") int id){
	   System.out.println(id);
	   return roleservice.findidbyID(id);
	   
   }
}
