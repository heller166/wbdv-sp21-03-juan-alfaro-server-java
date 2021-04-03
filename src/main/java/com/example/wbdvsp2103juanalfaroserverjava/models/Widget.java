package com.example.wbdvsp2103juanalfaroserverjava.models;

import javax.persistence.*;

@Entity
@Table(name="widgets")
public class Widget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String src = "";
    private String name = "";
    private String type = "";
    private String text = "";
    private String style = "";
    private String value = "";
    private String topicId = "";
    private String cssClass = "";
    private Integer size = 0;
    private Integer width = 0;
    private Integer height = 0;
    private Integer widgetOrder = 1;
    private Boolean ordered = true;


    public String getSrc() {
        return src;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    public String getStyle() {
        return style;
    }

    public String getValue() {
        return value;
    }

    public String getCssClass() {
        return cssClass;
    }

    public Long getId() {
        return id;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidgetOrder() {
        return widgetOrder;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setWidth(Integer widget) {
        this.width = widget;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidgetOrder(Integer widgetOrder) {
        this.widgetOrder = widgetOrder;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topidId) {
        this.topicId = topidId;
    }

    public Boolean getOrdered() {
        return ordered;
    }

    public void setOrdered(Boolean ordered) {
        this.ordered = ordered;
    }
}
