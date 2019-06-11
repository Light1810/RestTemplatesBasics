package me.aakash.selection;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SelectionController {

	CustomData customdata;
	@Autowired
	SelectionService selectionservice;
	@Autowired
	RestTemplate resttemplate;
	
	
	@GetMapping("/select")
	public List<Useroptions> getall()
	{
		return selectionservice.getallusers();
	}
	
	@GetMapping("/select/cust/{id}")
	public User_info getbymobNo(@PathVariable("id")long mobNo)
	{
	return resttemplate.getForObject("http://localhost:8084/user/"+mobNo, User_info.class);
	}
	
	@GetMapping("/select/cust/{id}/1")
	public Demo_voi_icon getop1(@PathVariable("id")long mobNo) {
		Useroptions usop=selectionservice.getbynumber(mobNo);
		int o1=usop.getO1();
		return resttemplate.getForObject("http://localhost:8083/icon/id/"+o1,Demo_voi_icon.class);
	}
	
	@GetMapping("/select/cust/{id}/2")
	public Demo_voi_icon getop2(@PathVariable("id")long mobNo) {
		Useroptions usop=selectionservice.getbynumber(mobNo);
		int o2=usop.getO2();
		return resttemplate.getForObject("http://localhost:8083/icon/id/"+o2,Demo_voi_icon.class);
	}
	
	@GetMapping("/select/cust/{id}/3")
	public Demo_voi_icon getop3(@PathVariable("id")long mobNo) {
		Useroptions usop=selectionservice.getbynumber(mobNo);
		int o3=usop.getO3();
		return resttemplate.getForObject("http://localhost:8083/icon/id/"+o3,Demo_voi_icon.class);
	}
	
	@GetMapping("/select/cust/{id}/4")
	public Demo_voi_icon getop4(@PathVariable("id")long mobNo) {
		Useroptions usop=selectionservice.getbynumber(mobNo);
		int o4=usop.getO4();
		return resttemplate.getForObject("http://localhost:8083/icon/id/"+o4,Demo_voi_icon.class);
	}
	
	@GetMapping("/select/{id}")
   public CustomData getallinfo(@PathVariable("id")long mobNo) {
		
		Useroptions usop=selectionservice.getbynumber(mobNo);
		int o1=usop.getO1();
		int o2=usop.getO2();
		int o3=usop.getO3();
		int o4=usop.getO4();
		
		User_info userinfo=resttemplate.getForObject("http://localhost:8084/user/"+mobNo, User_info.class);
		Demo_voi_icon icon1=resttemplate.getForObject("http://localhost:8083/icon/id/"+o1,Demo_voi_icon.class);
		Demo_voi_icon icon2=resttemplate.getForObject("http://localhost:8083/icon/id/"+o2,Demo_voi_icon.class);
		Demo_voi_icon icon3=resttemplate.getForObject("http://localhost:8083/icon/id/"+o3,Demo_voi_icon.class);
		Demo_voi_icon icon4=resttemplate.getForObject("http://localhost:8083/icon/id/"+o4,Demo_voi_icon.class);
		
		String username=userinfo.getUsrname();
		String emailid=userinfo.getEmail();
		int agegroup=icon1.getAge();
		String selection1=icon1.getIcon_name();
		String selection2=icon2.getIcon_name();
		String selection3=icon3.getIcon_name();
		String selection4=icon4.getIcon_name();
		
		return new CustomData(username,emailid,agegroup,selection1,selection2,selection3,selection4);

   }
}
 