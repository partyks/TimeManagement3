package org.timemanagement.dao.genericdao;

import com.googlecode.genericdao.search.ExampleOptions;
import com.googlecode.genericdao.search.Filter;
import com.googlecode.genericdao.search.ISearch;
import com.googlecode.genericdao.search.SearchResult;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

/**
 * @author Michal Partyka
 */
public interface GenericDAO<T, ID extends Serializable> {
    void setSessionFactory(SessionFactory sessionFactory);

    int count(ISearch search);

    T find(Serializable id);

    T[] find(Serializable... ids);

    List<T> findByExample(T example);

    List<T> findAll();

    void flush();

    T getReference(Serializable id);

    T[] getReferences(Serializable... ids);

    boolean isAttached(T entity);

    T reattach(T entity);

    void refresh(T... entities);

    boolean remove(T entity);

    void remove(T... entities);

    void removeByIds(Serializable... ids);

    boolean removeById(Serializable id);

    boolean save(T entity);

    boolean[] save(T... entities);

    <RT> List<RT> search(ISearch search);

    <RT> SearchResult<RT> searchAndCount(ISearch search);

    <RT> RT searchUnique(ISearch search);

    Filter getFilterFromExample(T example);

    Filter getFilterFromExample(T example, ExampleOptions options);
}
