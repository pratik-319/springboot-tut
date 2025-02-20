package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entry.JournalEntry;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long , JournalEntry> JournalEntries = new HashMap<>(); 

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(JournalEntries.values());
    }

    @PostMapping
     public String createEntry(@RequestBody JournalEntry myEntry){
        int sz = JournalEntries.size();
        JournalEntries.put(myEntry.getID() , myEntry);
        if(sz+1 == JournalEntries.size()){
            return "Added successfully";
        }
        return "Not added";
     }
}
