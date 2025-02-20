package com.example.demo.entry;

public class JournalEntry {

    private long id;
    private String title;
    private String content;

    public long getID(){
        return id;
    }

    public void setID(long id){
        this.id = id;
    }

    public String gettitle(){
        return title;
    }

    public void settitle(String title){
        this.title = title;
    }

    public String getcontent(){
        return content;
    }

    public void setcontent(String content){
        this.content = content;
    }

}
