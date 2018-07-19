package com.kanban.Board;

import com.kanban.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Entity for the boards. Each board is associated with a project.
 */

@Entity
public class Board extends BaseEntity {

    public Board() {
    }
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    @JoinColumn(name = "boardId")
    private Set<Column> columns = new HashSet<>();

    public Set<Column> getColumns(){
        return columns;
    }
    public Long getId(){
        return id;
    }
}