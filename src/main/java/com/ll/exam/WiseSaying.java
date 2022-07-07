package com.ll.exam;

public class WiseSaying {
    private int id;
    private String content;
    private String author;

    @Override
    public String toString() {
        return "WiseSaying{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public WiseSaying(int id, String content, String author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }
}