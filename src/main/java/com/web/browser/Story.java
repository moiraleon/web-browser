package com.web.browser;

public class Story {

    private Long id;
    private String title;
    private String description;
    private String body;

    public Story(Long id, String title, String description, String body){
        this.id=id;
        this.title = title;
        this.description = description;
        this.body = body;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
