# 📝 Java Core: Text Blocks (Từ Java 15)

Chào bạn! File `TextBlockExample.java` của bạn vừa đánh trúng một trong những cập nhật đáng giá nhất để giúp code Java trông "sạch nước cản" hơn rất nhiều - đó là **Text Blocks**.

Dưới đây là bản tóm tắt cực "clean" về Text Blocks dựa trên code của bạn! 🚀

---

## 🎯 1. Nỗi đau trước khi có Text Blocks
Thử tưởng tượng trước Java 15, nếu bạn muốn nhúng một đoạn JSON, HTML hay SQL dài thò lò vào code thì sẽ phải dùng chuỗi cộng với ký tự xuống dòng `\n`, xen lẫn là những dấu gạch chéo escape các ngoặc kép `\"`. Ví dụ:
```java
// Truyen thong (Pre-Java 15)
String json = "{\n" +
              "    \"id\": 1,\n" +
              "    \"name\": \"Java\"\n" +
              "}";
```
Cách cũ này khiến bạn mỏi tay, code rối và rất dễ gây lỗi cú pháp!

---

## 🚀 2. "Cứu tinh" Text Blocks (`"""`)
Text Blocks giải quyết gọn gàng các vấn đề trên. Hãy nhìn vào đoạn mã bạn đã viết:

```java
String json = """
            {
                "id": 1,
                "name": "Java"
            }
        """;
```
### Các đặc tính "vàng":
1. **Không giới hạn ngắt dòng**: Bạn có thể `Enter` xuống dòng bao nhiêu cũng được. Code bạn viết thế nào, in ra console nó sẽ y như thế.
2. **Loại bỏ Escape character rườm rà**: Bạn tha hồ gõ dấu ngoặc kép `"` ở bên trong mà không cần phải escape `\"`. Thoải mái chèn JSON, HTML, SQL!
3. **Căn lề tự động (Incidental White Space)**: 
   Bạn có để ý khoảng trắng thừa bên trái thụt lề không? Trình biên dịch Java đủ thông minh để bỏ qua những *khoảng trắng ảo* sinh ra bởi việc căn thụt Code trong IDE và giữ lại đúng *khoảng trắng cấu trúc* của đoạn string thật. Việc canh lề lùi ở đâu sẽ được quyết định bởi vị trí đặt dấu `"""` đóng.

---

## 🪄 3. Escape trong Text Blocks (Ví dụ `\s` bạn dùng)

Trong file của bạn có một đoạn khá xịn:
```java
String text = """
            Dòng này dài quá nên xuống\s
            tôi ngắt nó ở đây.
        """;
```

### Tại sao lại cần `\s`?
Mặc định Java sẽ tự động cắt bỏ/xóa đi (strip) dải toàn bộ các khoảng trắng thừa nằm ở "cuối" dòng (trailing whitespaces) khi dịch code. 
Việc bạn cố tình thêm `\s` ở cuối dòng 1 mang ý nghĩa: *"Ê Java, hãy giữ nguyên và bảo tồn một dấu khoảng trắng này lại cho tôi, không được phép cắt bỏ!"*.

### Bonus thêm một Escape cực hay: Nối dòng `\`
Nếu bạn đang viết một câu cực kỳ dài trong code (muốn xuống dòng cho IDE dễ nhìn), nhưng khi in ra **không muốn** ngắt dòng thật, bạn chỉ cần ném thêm con dấu `\` ở cuối. Thử xem:
```java
String longText = """
                Bạn vừa gõ một câu dài ơi là dài. \
                Và dòng dưới này thực ra vẫn dính sát rạt với dòng trên lúc chạy code!
                """;
```

---
**🔥 Tóm tắt để chốt:** Text Blocks (`"""`) sinh ra để "thành thánh" nhúng code ngoài (JSON, SQL) vào Java. Chấm dứt kỷ nguyên dính đầy dấu `+` và `\n` trong String.

Tiếp tục hành trình học siêu tốc độ của bạn nào! 🏃‍♂️💨 Cần "clean docs" cái nào tiếp bạn lại ới mình nha!
