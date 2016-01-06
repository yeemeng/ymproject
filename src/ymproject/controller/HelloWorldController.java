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
public class HelloWorldController {
	private Log log = LogFactory.getLog(this.getClass());
	
    @RequestMapping("/helloPage")
    public String helloWorld(Model model) {
        String message = "Hello yeemeng!";
        List<CommandMember> memberList = getMarkupData();
        model.addAttribute("memberList", memberList);
        model.addAttribute("message", message);
        return "html/hello";
    }
    
    @RequestMapping("/submitForm")
    public String submitForm(@ModelAttribute("member")CommandMember member, Model model) {
    	String message = "Welcome member";
    	Boolean isMember = true;
    	model.addAttribute("message", message);
    	model.addAttribute("memberName", member.getName());
    	model.addAttribute("isMember", isMember);
    	return "html/result";
    }
    
    public List<CommandMember> getMarkupData () {
    	CommandMember member = new CommandMember("yeemeng", "yeemeng", "gmail.com", "123456", "123456", "qweasdzxc");
    	CommandMember member1 = new CommandMember("yeemeng1", "yeemeng123", "gmail.com", "123456", "123456", "qweasdzxc");
    	CommandMember member2 = new CommandMember("yeemeng2", "yeemeng456", "gmail.com", "123456", "123456", "qweasdzxc");
    	List<CommandMember> memberList = new ArrayList<CommandMember>();
    	memberList.add(member);
    	memberList.add(member1);
    	memberList.add(member2);
    	return memberList;
    }
}
