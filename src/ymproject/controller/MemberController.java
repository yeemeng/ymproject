package ymproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ymproject.commandObject.CommandMember;

@Controller
public class MemberController {
	private Log log = LogFactory.getLog(this.getClass());
	
	@RequestMapping("/memberRegistrationPage")
	public String getMemberRegistrationPage(Model model) {
    	CommandMember member = new CommandMember();
        model.addAttribute("member", member);
        return "html/registerMember";
    }
	
	@RequestMapping("/memberSubmit")
	public String registerMember(@ModelAttribute("member")CommandMember member, Model model) {
		List<CommandMember> memberList = new ArrayList<CommandMember>();
		memberList.add(member);
		model.addAttribute("memberList", memberList);
		return "html/hello";
	}
}
