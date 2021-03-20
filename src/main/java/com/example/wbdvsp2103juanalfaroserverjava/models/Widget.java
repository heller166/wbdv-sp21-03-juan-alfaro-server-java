package com.example.wbdvsp2103juanalfaroserverjava.models;

public class Widget {
    private String src;
    private String name;
    private String type;
    private String text;
    private String style;
    private String value;
    private String cssClass;
    private String id;
    private Integer size;
    private Integer widget;
    private Integer height;
    private Integer widgetOrder;
    private String topicId;

    public Widget(String src, String name, String type, String text, String style, String value, String cssClass,
                  String id, Integer size, Integer widget, Integer height, Integer widgetOrder) {
        this.src = src;
        this.name = name;
        this.type = type;
        this.text = text;
        this.style = style;
        this.value = value;
        this.cssClass = cssClass;
        this.id = id;
        this.size = size;
        this.widget = widget;
        this.height = height;
        this.widgetOrder = widgetOrder;
    }

    public Widget() {
    }

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

    public String getId() {
        return id;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getWidget() {
        return widget;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setWidget(Integer widget) {
        this.widget = widget;
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
}
