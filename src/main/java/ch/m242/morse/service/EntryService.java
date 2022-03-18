package ch.m242.morse.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import ch.m242.morse.domain.Entry;

import java.util.List;

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
    public Entry findLatest() {
        var query = entityManager.createQuery("FROM Entry ORDER BY id DESC");
        query.setMaxResults(1);
        Entry last = (Entry) query.getSingleResult();
        return last;
    }
}
