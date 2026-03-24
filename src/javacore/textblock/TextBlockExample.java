package javacore.textblock;

public class TextBlockExample {
    public static void main(String[] args) {
        String json = """
                    {
                        "id": 1,
                        "name": "Java"
                    }
                """;
        String text = """
                    Dòng này dài quá nên xuống\s
                    tôi ngắt nó ở đây.
                """;
        System.out.println(json);
        System.out.println(text);

    }
}
