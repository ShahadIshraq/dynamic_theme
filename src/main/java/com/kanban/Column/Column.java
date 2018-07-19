package com.kanban.Column;

import com.kanban.BaseEntity;
import com.kanban.Card.Card;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
@Entity
public class Column extends BaseEntity {
    private String title;
    private int order;
    private Long boardId;

    public Column() {
    }
    public Column(String title, int order, Long boardId) {
        this.title = title;
        this.order = order;
        this.boardId = boardId;
    }

    //    get all cards
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "columnId")
    private Set<Card> cards = new HashSet<>();

    public Set<Card> getCards() {
        return cards;
    }





    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }


}