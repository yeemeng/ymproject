package ymproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ymproject.commandObject.CommandMember;
import ymproject.dao.MemberDao;

@Service
public class MemberService {
	@Autowired
	private MemberDao memberDao;
	
	public void persist(CommandMember member) {
		memberDao.persist(member);
	}
	
	public void update(CommandMember member) {
		memberDao.update(member);
	}
	
	public CommandMember findById(int id) {
		return memberDao.findById(id);
	}
	
	public void delete(int id) {
		memberDao.delete(findById(id));
	}
}
