package ymproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ymproject.commandObject.CommandMember;
import ymproject.service.MemberService;

@Controller
public class MemberController {
	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/memberRegistrationPage")
	public String getMemberRegistrationPage(Model model) {
    	CommandMember member = new CommandMember();
        model.addAttribute("member", member);
        return "html/registerMember";
    }
	
	@RequestMapping("/memberListingPage") 
	public String memberListing(Model model) {

		return "html/hello";
	}
	
	@RequestMapping("/memberSubmit")
	public String registerMember(@ModelAttribute("member")CommandMember member, Model model) {
		memberService.persist(member);
		return "html/hello";
	}
}
