package me.aakash.users;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	
	@Autowired
	UserService usrsrvc;
	
	@GetMapping("/user")
	public List<User_info> index()
	{
        return usrsrvc.findAll();
    }
	
    @GetMapping("/user/{id}")
    public User_info showbymobid(@PathVariable long id
    		){
        return usrsrvc.getByMobNo(id);
    }
    
    @PostMapping("/user/new")
    public void create(@RequestBody Map<String,String> body)
    {
    	usrsrvc.adduser(body);
    }
    
    @PutMapping("/user/mob/{id}")
    public void update(@PathVariable String id, @RequestBody Map<String, String> body)
    {
    	usrsrvc.update(id,body);
    }
    
    @DeleteMapping("user/mob/{id}")
    public boolean delete(@PathVariable String id)
    {
       	return usrsrvc.delete(id);
    }
    
	@GetMapping("/user/count")
	 public String count()
	{
		return usrsrvc.countUser();
    }

}
