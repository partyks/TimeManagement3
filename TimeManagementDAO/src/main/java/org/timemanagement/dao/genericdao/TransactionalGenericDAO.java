package org.timemanagement.dao.genericdao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
import com.googlecode.genericdao.search.*;
import org.hibernate.LockOptions;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * @author Michal Partyka
 */
public class TransactionalGenericDAO<T, ID extends Serializable> extends GenericDAOImpl<T, ID> implements GenericDAO<T,ID> {
    @Autowired
    @Override
    public void setSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
    @Override
    public int count(ISearch search) {
        return super.count(search);
    }

    @Transactional(propagation = Propagation.MANDATORY, readOnly = true)
    @Override
    public T find(Serializable id) {
        return super.find(id);
    }

    @Transactional(propagation = Propagation.MANDATORY, readOnly = true)
    @Override
    public T[] find(Serializable... ids) {
        return super.find(ids);
    }

    @Transactional(propagation = Propagation.MANDATORY, readOnly = true)
    @Override
    public List<T> findByExample(T example) {
        Search s = new Search(persistentClass);
        s.addFilter(getFilterFromExample(example));
        return search(s);
    }

    @Transactional(propagation = Propagation.MANDATORY, readOnly = true)
    @Override
    public List<T> findAll() {
        return super.findAll();
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public void flush() {
        super.flush();
    }

    @Transactional(propagation = Propagation.MANDATORY, readOnly = true)
    @Override
    public T getReference(Serializable id) {
        return super.getReference(id);
    }

    @Transactional(propagation = Propagation.MANDATORY, readOnly = true)
    @Override
    public T[] getReferences(Serializable... ids) {
        return super.getReferences(ids);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    @Override
    public boolean isAttached(T entity) {
        return super.isAttached(entity);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public T reattach(T entity) {
        if (!isAttached(entity)) {
            try {
                getSession().buildLockRequest(LockOptions.NONE).lock(entity);
            } catch (NonUniqueObjectException e) {
                refresh(entity);
            }
        }
        return entity;
    }

    @Transactional(propagation = Propagation.MANDATORY, readOnly = true)
    @Override
    public void refresh(T... entities) {
        super.refresh(entities);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public boolean remove(T entity) {
        return super.remove(entity);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public void remove(T... entities) {
        super.remove(entities);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public void removeByIds(Serializable... ids) {
        super.removeByIds(ids);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public boolean save(T entity) {
        return super.save(entity);
    }

    @Transactional(propagation = Propagation.MANDATORY)
    @Override
    public boolean[] save(T... entities) {
        return super.save(entities);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
    @Override
    public <RT> List<RT> search(ISearch search) {
        return super.search(search);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
    @Override
    public <RT> SearchResult<RT> searchAndCount(ISearch search) {
        return super.searchAndCount(search);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = true)
    @Override
    public <RT> RT searchUnique(ISearch search) {
        return super.searchUnique(search);
    }

    @Override
    public Filter getFilterFromExample(T example) {
        return super.getFilterFromExample(example);
    }

    @Override
    public Filter getFilterFromExample(T example, ExampleOptions options) {
        return super.getFilterFromExample(example, options);
    }
}
