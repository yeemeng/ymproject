package ymproject.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import ymproject.commandObject.CommandMember;

@Component
public class MemberDao extends BaseDao implements MemberDaoInterface<CommandMember, Integer> {
	public MemberDao() {
	}

	public void persist(CommandMember entity) {
		System.out.println(entity.toString());
		openCurrentSessionwithTransaction();
		getCurrentSession().save(entity);
		closeCurrentSessionwithTransaction();
	}

	public void update(CommandMember entity) {
		getCurrentSession().update(entity);
	}

	public CommandMember findById(Integer id) {
		CommandMember member = (CommandMember) getCurrentSession().get(CommandMember.class, id);
		return member;
	}
	
	public void delete(CommandMember member) {
		getCurrentSession().delete(member);
	}
	
	public List<CommandMember> findAll() {
		//getCurrentSession().getA
		
		return null;
	}

}
