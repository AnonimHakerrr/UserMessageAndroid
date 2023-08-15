package edu.itstep.a10_1senddata;

public class Slide {
    private String header;
    private String paragraph;
    private int color;
    private User user;

    public Slide(User user,String header, String paragraph, int color) {
        this.header = header;
        this.paragraph = paragraph;
        this.color = color;
        this.user = user;
    }
    public User getUser() {
        return user;
    }
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
