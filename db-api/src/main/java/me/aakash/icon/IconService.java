package me.aakash.icon;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IconService {
	
    @Autowired
    IconRespository iconRespository;

	public List<Demo_voi_icon> getAll() 
	{
		return iconRespository.findAll();
	}

	public List<Demo_voi_icon> groupByAge(int iconId)
	{
		 return iconRespository.findByAge(iconId);
	}

	public Optional<Demo_voi_icon> searchById(int iconId) 
	{
		return iconRespository.findById(iconId);
	}

	public void addnew(Map<String, String> body) 
	{
    	int id=Integer.parseInt(body.get("id"));
    	int age=Integer.parseInt(body.get("age"));
    	String icon_name=body.get("icon_name");
    	String url=body.get("url");
    	
    	Demo_voi_icon demoobj=	new Demo_voi_icon(id, age, icon_name, url);
     	iconRespository.save(demoobj);	
	}

	public void update(String id, Map<String, String> body) 
	{
		 int iconId = Integer.parseInt(id);		
        Demo_voi_icon icon = iconRespository.findById(iconId).get();
        icon.setId(Integer.parseInt(body.get("id")));
        icon.setAge(Integer.parseInt(body.get("age")));
        icon.setIcon_name(body.get("icon_name"));
        icon.setUrl(body.get("url"));
        iconRespository.save(icon);
		
	}

	public void delete(String id)
	{
		int iconId = Integer.parseInt(id);
	    iconRespository.deleteById(iconId);		
	}

}
