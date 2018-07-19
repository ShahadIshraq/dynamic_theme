package com.kanban.Card;

import com.kanban.BaseEntity;

import javax.persistence.Entity;

/**
 *
 */

@Entity
public class Card extends BaseEntity {

    private Long boardId;
    private Long columnId;
    private int order;
    public Card() {
    }

    public Card(Long boardId, Long columnId, int order) {
        this.boardId = boardId;
        this.columnId = columnId;
        this.order = order;
    }

    public Long getBoardId() {
        return boardId;
    }

    public Long getColumnId() {
        return columnId;
    }

    public int getOrder() {
        return order;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public void setColumnId(Long columnId) {
        this.columnId = columnId;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}