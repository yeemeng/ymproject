package ymproject.dao;

import java.util.List;

public interface MemberDaoInterface<E, K> {
	void persist(E entity);
	void update(E entity);
	void delete(E entity);
    E findById(K id);
    List<E> findAll();
}
