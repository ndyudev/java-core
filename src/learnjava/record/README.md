# 📦 Java Core: Record (Từ Java 14+)

Chào bạn! Thư mục này hiện tại chưa có code, có vẻ bạn mới tạo folder và chuẩn bị "lăn xả" vào code phần **Record** phải không? 

Trong lúc bạn đang học và gõ code, mình đã tạo sẵn khung lý thuyết cốt lõi về **Record** để bạn vừa code vừa đối chiếu cho lẹ nhé! Khi nào bạn viết xong code demo, cứ hối mình, mình sẽ cập nhật lại file này dựa trên chính code thực hành của bạn để phân tích sâu hơn.

---

## 🎯 1. Record sinh ra để giải quyết nỗi đau nào?

Trước đây (trước Java 14), khi bạn muốn tạo một class chỉ để chứa dữ liệu (Data Transfer Object - DTO), bạn phải viết cực kỳ nhiều **Boilerplate Code** (code lặp đi lặp lại), bao gồm:
- Khai báo các field `private final`.
- Viết Constructor.
- Viết các hàm `Getter`.
- Override hàm `equals()` và `hashCode()`.
- Override hàm `toString()`.

Với một class chỉ có 2-3 thuộc tính nhưng code có thể dài cả chục tới hàng trăm dòng từ IDE generate ra. Rất rối mắt!

🌟 **Java Record** xuất hiện để dẹp bỏ mớ hỗn độn này. Nó giúp bạn khai báo một Immutable Data Class (Lớp dữ liệu không thể thay đổi) chỉ với **1 dòng code duy nhất**.

---

## 🚀 2. Cú pháp & Đặc điểm của Record

### Cú pháp siêu ngắn:

Thay vì dùng chữ `class`, bạn dùng chữ `record`:

```java
public record StudentRecord(String name, int age) {
}
```

Bên dưới tầng biên dịch, đoạn code 1 dòng trên tự động cung cấp cho bạn:
1. Các biến `name` và `age` là `private final`.
2. Một public constructor với đầy đủ tham số `(String name, int age)`.
3. Hàm lấy giá trị (Getter) mang tên chính xác của biến (ví dụ: `.name()` và `.age()` thay vì `.getName()`).
4. Triển khai sẵn hàm `equals()`, `hashCode()` và `toString()`.

### Các tính chất bắt buộc phải nhớ khi học Record:
- **Tính Bất biến (Immutable):** Dữ liệu của Record sau khi khởi tạo qua (Constructor) là **không thể thay đổi** (vì các field mặc định là `final`). Bạn sẽ KHÔNG CÓ hàm `setter`.
- **Kế thừa:** 
  - Record tự động kế thừa từ class `java.lang.Record`. (Khác class thông thường là kế thừa trực tiếp từ `Object`).
  - Do trong Java bạn không thể đa kế thừa Class nên một Record **không thể extends (kế thừa) bất kỳ Class hay Record nào khác**.
  - Nó **có thể implements (triển khai) một hay nhiều Interfaces**. 
  - Record ngầm định là `final class` nên các Class khác cũng không thể kế thừa lại một Record!

---

## 🛠️ 3. Bạn được phép làm gì thêm bên trong Record?

Mặc dù cực kỳ ngắn, bạn hoàn toàn có thể tùy biến thêm bên trong cặp ngoặc `{}` của Record:

1. **Khởi tạo phương thức tĩnh (`static methods`) và thuộc tính tĩnh (`static fields`)**.
2. **Tuỳ biến Constructor (Compact Constructor)**: Dùng để xác thực (validate) dữ liệu trước khi gán.
   ```java
   public record StudentRecord(String name, int age) {
       // Tuỳ biến (Compact Constructor) mà không cần khai báo lại tham số
       public StudentRecord {
           if (age < 0) {
               throw new IllegalArgumentException("Tuổi không được âm!");
           }
       }
   }
   ```
3. **Thêm phương thức thông thường (Instance methods)**.

---

🔥 **Nhiệm vụ của bạn:**
Bạn cứ tạo vài file Java (`public record ...`) trong thư mục này để tự tay test những lí thuyết trên (thử in `.toString()`, gọi Getter, thử so sánh bằng `equals`...).

Khi nào bạn "chơi" chán code phần này rồi báo mình một tiếng, mình sẽ rà lại bộ code của bạn và nâng cấp/gắn chính code của bạn vào file `README.md` này làm tài liệu riêng chuẩn nhất cho bạn review nha! Chúc bạn gõ code vui vẻ! ⌨️
