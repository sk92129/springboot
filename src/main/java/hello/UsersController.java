package hello;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

	private final static Logger LOGGER = Logger.getLogger(UsersController.class.getName());

	private static List<Users> list=null;
	
	static {
		// got the lat lon from address using http://www.latlong.net/convert-address-to-lat-long.html
		
		list = new ArrayList<Users>();
		list.clear();
		list.add(new Users("Sean","Kang"));
		list.add(new Users("Joshua","Kang" ));
		
	}

	@RequestMapping(value="/", method= RequestMethod.GET)
	public List<Users> getUsers() {
		LOGGER.debug("getUsers" );
		
		return list;
	}




	@RequestMapping(value="/", method= RequestMethod.POST)
	public OkStatus addUser(@RequestParam(value="email", defaultValue="user@kang.com") String email,
						  @RequestParam(value="firstname", defaultValue="sean") String firstName,
							@RequestParam(value="lastname", defaultValue="kang") String lastName) {

		LOGGER.debug("check  " +email  + " firstName " + firstName + " lastName "+ lastName);

		boolean verified = true;// you would do something different here.

		list.add(new Users(firstName, lastName, email));

		return new OkStatus(verified);


	}


}
