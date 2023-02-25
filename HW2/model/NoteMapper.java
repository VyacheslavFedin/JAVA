package HOMEWORK2.model;

public class NoteMapper {
    public String map(Note note) {
        return String.format("%s,%s,%s,%s", note.getId(), note.getHeader(), note.getContent(), note.getDate());
    }

    public Note map (String line) {
        String[] lines = line.split(",");
        // String id = lines[0].substring(14);
        // String header = lines[1].substring(12);
        // String content = lines[2].substring(13);
        // String data = lines[3].substring(7);
        // System.out.println(id);
        // System.out.println(header);
        // System.out.println(content);
        // System.out.println(data);
        // return new Note(lines[1], lines[3], lines[5], lines[7]);
        return new Note(lines[0], lines[1], lines[2], lines[3]);
    }

    // public static void main(String[] args) {
    //     String res = "Идентификатор: sdvsvd, Заголовок: dfbbfs, Содержание: advadv, Дата: sdvadv";
    //     map(res);
    // }
}
