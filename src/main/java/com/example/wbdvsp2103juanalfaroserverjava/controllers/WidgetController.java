package com.example.wbdvsp2103juanalfaroserverjava.controllers;

import com.example.wbdvsp2103juanalfaroserverjava.models.Widget;
import com.example.wbdvsp2103juanalfaroserverjava.services.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {
    @Autowired
    WidgetService service;

    @PostMapping("/api/topics/{tid}/widgets")
    public Widget createWidget (
            @PathVariable("tid") String topicId,
            @RequestBody Widget widget)
    {
        return service.createWidget(topicId, widget);
    }

    @GetMapping("/api/topics/{tid}/widgets")
    public List<Widget> findWidgetsForTopic(
            @PathVariable("tid") String topicId)
    {
        return service.findWidgetsForTopic(topicId);
    }

    @PutMapping("/api/widgets/{wid}")
    public Integer updateWidget(
            @PathVariable("wid") String id,
            @RequestBody Widget widget)
    {
        return service.updateWidget(id, widget);
    }

    @DeleteMapping("/api/widgets/{wid}")
    public Integer deleteWidget(
            @PathVariable("wid") String id)
    {
        return service.deleteWidget(id);
    }

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets()
    {
        return service.findAllWidgets();
    }

    Widget findWidgetById(String wid)
    {
        return null;
    }
}