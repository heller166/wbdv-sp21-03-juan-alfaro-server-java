package com.example.wbdvsp2103juanalfaroserverjava.services;

import com.example.wbdvsp2103juanalfaroserverjava.models.Widget;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WidgetService {
    public List<Widget> widgets = new ArrayList<>();
    {
        Widget w1 = new Widget();
        Widget w2 = new Widget();
        Widget w3 = new Widget();
        Widget w4 = new Widget();
        Widget w5 = new Widget();

        w1.setName("Hello1");
        w2.setName("Hello2");
        w3.setName("Hello3");
        w4.setName("Hello4");
        w5.setName("Hello5");

        widgets.add(w1);
        widgets.add(w2);
        widgets.add(w3);
        widgets.add(w4);
        widgets.add(w5);
    }

    public Widget createWidget(String topicId, Widget widget) {
        widget.setTopicId(topicId);
        widget.setId((new Date()).toString());
        widgets.add(widget);
        return widget;
    }

    public List<Widget> findAllWidgets() {
        return widgets;
    }

    public List<Widget> findWidgetsForTopic(String topicId) {
        List<Widget> ws = new ArrayList<>();
        for(Widget w: widgets) {
            if(w.getTopicId().equals(topicId)) {
                ws.add(w);
            }
        }
        return ws;
    }

    public Integer deleteWidget(String id) {
        int index = -1;
        for(int i=0; i<widgets.size(); i++) {
            if(widgets.get(i).getId().equals(id)) {
                index = i;
                widgets.remove(index);
                return 1;
            }
        }
        return -1;
    }

    public Integer updateWidget(String id, Widget widget) {
        for(int i=0; i<widgets.size(); i++) {
            if(widgets.get(i).getId().equals(id)) {
                widgets.set(i, widget);
                return 1;
            }
        }
        return -1;
    }
}
