package ch.m242.morse.domain;

import javax.persistence.*;

@Entity
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String entry;
}