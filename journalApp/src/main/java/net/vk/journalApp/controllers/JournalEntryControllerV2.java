package net.vk.journalApp.controllers;

import net.vk.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {


    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }


    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){

        return true;
    }


    @GetMapping("id/{myId}")
    public JournalEntry getEntryById(@PathVariable long myId){
        return null;
    }


    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable long myId){
        return null;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournalById(@PathVariable long id , @RequestBody JournalEntry myEntry){
        return null;
    }
}
