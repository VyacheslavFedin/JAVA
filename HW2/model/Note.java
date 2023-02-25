package HOMEWORK2.model;

public class Note {
    private String id = "";
    private String header;
    private String content;
    private String date;

    public Note(String header, String content, String date) {
        this.header = header;
        this.content = content;
        this.date = date;
    }
    public Note(String id, String header, String content, String date) {
        this(header, content, date);
        this.id = id;
    }

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }

    


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Идентификатор: %s Заголовок: %s, Содержание: %s, Дата: %s", id, header, content, date);
    }

}
