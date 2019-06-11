package me.aakash.icon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class IconController 
{

    @Autowired
    IconService iconsrvc;

    @GetMapping("/icon")
    public List<Demo_voi_icon> index(){
        return iconsrvc.getAll();
    }

    @GetMapping("/icon/age/{id}")
    public List<Demo_voi_icon> showbyage(@PathVariable int id)
    {
        return iconsrvc.groupByAge(id);
    }
    
    @GetMapping("/icon/id/{id}")
    public Optional<Demo_voi_icon> showbyid(@PathVariable int id)
    {
        return iconsrvc.searchById(id);
    }
    
    @PostMapping("/icon/new")
    public void create(@RequestBody Map<String,String> body)
    {
    	iconsrvc.addnew(body);
    }
    
    @PutMapping("/icon/id/{id}")
    public void update(@PathVariable String id, @RequestBody Map<String, String> body)
    {
           iconsrvc.update(id,body);
    }
    
    @DeleteMapping("icon/id/{id}")
    public void delete(@PathVariable String id)
    {
       iconsrvc.delete(id);
    }

}