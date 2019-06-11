package me.aakash.users;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService 
{	
	@Autowired
	UserRepo usrob;

	public List<User_info> findAll()
	{
		return usrob.findAll();
	}

	public User_info getByMobNo(long id) 
	{
		return usrob.findById(id).get();
	}

	public void adduser(Map<String, String> body)
	{
    	long mob=Long.parseLong(body.get("mob_number"));
    	String usrname=body.get("usrname");
    	String email=body.get("email");
    	usrob.save(new User_info(mob,usrname,email));
	}

	public void update(String id, Map<String, String> body) {
        long mobId = Long.parseLong(id);
        User_info user =  usrob.findById(mobId).get();
        user.setMob_number(Long.parseLong(body.get("mob_number")));
        user.setUsrname(body.get("usrname"));
        user.setEmail(body.get("email"));
		
	}

	public boolean delete(String id) {
	
		long mobId = Long.parseLong(id);
        usrob.deleteById(mobId);
        return true;
		
	}

	public String countUser()
	{
		String out="Total Registered Users = " +usrob.count();
        return out;   
	}
	
	

}
