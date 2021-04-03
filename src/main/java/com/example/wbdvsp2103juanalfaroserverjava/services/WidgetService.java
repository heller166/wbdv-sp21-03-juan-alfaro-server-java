package com.example.wbdvsp2103juanalfaroserverjava.services;

import com.example.wbdvsp2103juanalfaroserverjava.models.Widget;
import com.example.wbdvsp2103juanalfaroserverjava.repositories.WidgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WidgetService {
    @Autowired
    private WidgetRepository repository;

    public Widget createWidget(String topicId, Widget widget) {
        widget.setTopicId(topicId);
        return repository.save(widget);
    }

    public List<Widget> findAllWidgets() {
        return (List<Widget>) repository.findAll();
    }

    public List<Widget> findWidgetsForTopic(String topicId) {
        return repository.findWidgetsForTopic(topicId);
    }

    public Integer deleteWidget(Long id) {
        repository.deleteById(id);
        return 1;
    }

    public Integer updateWidget(Long id, Widget widget) {
        repository.save(widget);
        return 1;
    }
}
