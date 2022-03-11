package ch.m242.morse.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.m242.morse.domain.Entry;

@ApplicationScoped
public class EntryService {
    @Inject
    private EntityManager entityManager;

    @Transactional
    public Entry createEntry(Entry entry) {
        entityManager.persist(entry);
        return entry;
    }

    public Entry getSingleEntry(Long id){
        return entityManager.find(Entry.class, id);
    }

    @Transactional
    public void deleteEntry(Long id){
        Entry entryToDelete = getSingleEntry(id);
        entityManager.remove(entryToDelete);
    }

    @Transactional
    public void updateEntry(Entry entry){
        entityManager.merge(entry);
    }

    @SuppressWarnings("unchecked")
    public int findLatest() {
        var query = entityManager.createQuery("FROM Entry WHERE id = (SELECT MAX(id) FROM Entry)");
        return query.getFirstResult();
    }
}
