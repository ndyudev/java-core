# 🧠 Java Core: Quản lý Bộ nhớ & Cơ chế truyền tham số

Chào bạn! Dưới đây là bài tóm tắt thật chi tiết và "clean" về toàn bộ phần kiến thức thuộc package `javacore.memory` mà bạn vừa tìm hiểu thực hành. Các kiến thức này cực kỳ quan trọng và là nền tảng cốt lõi trong Java!

---

## 🏗️ 1. Stack và Heap Memory (Bộ nhớ Stack vs Heap)
Java quản lý bộ nhớ thông qua 2 vùng chính liên quan đến cấp phát biến:

- **Stack (Bộ nhớ ngăn xếp)**: 
  - Lưu trữ các biến kiểu nguyên thủy (primitive types) như `int`, `double`, `boolean`, `char`, v.v. (ví dụ: `int a = 1000`).
  - Lưu trữ giá trị tham chiếu (địa chỉ bộ nhớ) của biến tham chiếu gọi đến Object (ví dụ: biến `student` trỏ tới Memory Address).
  - Dữ liệu ở đây sẽ được giải phóng tự động khi kết thúc hàm (Block / Method scope).

- **Heap (Bộ nhớ dùng chung)**:
  - Nơi Lưu trữ toàn bộ các đối tượng (**Objects**) khi được khởi tạo bằng từ khóa `new` (Ví dụ: `new Student("Duy", 10)`, `new int[10]`).
  - Được quản lý tự động bởi thu gom rác (*Garbage Collector* - GC).

---

## 📦 2. Wrapper Class Cache & "Autoboxing"

Trong file `ExampleStudent`, bạn có kiểm tra thử việc so sánh các giá trị gói (Wrapper Classes) sử dụng toán tử `==`. Đây là một cơ chế cần cực kì lưu ý trong Java là **Integer Cache Pool**.

- Tự động đóng gói (**Autoboxing**): Chuyển đổi tự động từ dạng nguyên thủy sang Wrapper. Ví dụ `Integer int1 = 10;`.
- **Cơ chế Cache (-128 đến 127)**: 
  Java sẽ cache (tạo sẵn và lưu trữ trên Heap) các giá trị `Integer` nằm trong khoảng từ `-128` đến `127`. 
  - Do đó: Khi so sánh `Integer int1 = 10;` và `Integer int2 = 10;`, `int1 == int2` trả về `true` vì cả 2 cùng trỏ chung vào cùng 1 Object giới hạn trong bộ nhớ Cache.

- **Vượt ra ngoài khoảng Caching**: 
  - Nếu khai báo `Integer y = 1000;` và `Integer x = 1000;` (vượt khoảng -128 đến 127), Java sẽ khởi tạo 2 Object mới phân biệt trong RAM.
  - Lúc này, so sánh `y == x` sẽ trả về `false` do sử dụng `==` trên Object là đi so sánh địa chỉ vùng nhớ, chứ không so sánh giá trị nội tại (giá trị thực). Đối với Wrapper, hãy **luôn dùng hàm `.equals()`** để so sánh giá trị nhé!

---

## 🔄 3. Value Type & Reference Type (Truyền giá trị và tham chiếu)

**🚀 Chìa khóa quan trọng:** Trong Java chỉ có duy nhất cơ chế **Truyền theo giá trị (Pass by Value)**. Không có "Pass by reference" giống C/C++. 

Tuy nhiên, nó lại hoạt động theo 2 cách tùy thuộc kiểu dữ liệu truyền vào phương thức:

### A. Đối với kiểu nguyên thủy (Primitive Type)
Pass bản sao giá trị. Khi thay đổi bản sao ở trong hàm, biến gốc ban đầu bên ngoài không hề bị ảnh hưởng.

### B. Đối với kiểu tham chiếu (Reference Type / Objects / Arrays)
Bạn truyền giá trị chứa **"địa chỉ vùng nhớ"** của đối tượng này copy vào hàm. Điều này dẫn tới 2 hệ quả được thể hiện vô cùng rõ trong code của bạn:

1. **Thay đổi thuộc tính nội tại của Object:** 
   Ví dụ trong hàm: 
   ```java
   public static void updateAge(Student student) {
       student.setAge(student.getAge() + 1);
   }
   ```
   *Giải thích*: Tham chiếu trỏ chung vào 1 Object ban đầu trên Heap. Nếu thay đổi `.setAge()`, Object gốc thực sự bị thay đổi! (kết quả student bị già đi 1 tuổi). Tương tự với việc gắn `arr[1] = 1`.

2. **Gán lại một tham chiếu sang Object hoàn toàn mới (`new`):**
   Trong hàm:
   ```java
   public static void updateAge(Student student, int age) {
       Student newStudent = new Student(student.getName(), age);
       student = newStudent; // Gán lại sang object khác
   }
   ```
   *Giải thích*: Java chỉ pass-by-value cái tham chiếu. Dòng `student = newStudent;` chỉ đơn thuần thay đổi cái "bản copy tham chiếu" trỏ sang 1 địa chỉ mới thôi. Biến `student` bên ngoài hàm `main` vẫn khăng khăng "ôm" địa chỉ khởi tạo gốc ban đầu không suy xuyển!
   (Đó là lý do `arr` cũng mang kết quả in ra y chang ban đầu dẫu hàm `updateArray()` đã `new int[3]`).

---

**🔥 Tóm tắt để ghi nhớ thật chắc:**
- Wrapper Objects `==` cẩn thận với khoảng `-128` đến `127`. Luôn dùng `.equals()` khi so sánh Object.
- Truyền đối tượng vào hàm: Có thể thay đổi "Ruột" (đổi state/properties) đối tượng, nhưng thay đổi "Vỏ" (dùng `=` gán một Object mới toanh) trong hàm thì không mang ý nghĩa gì với biến ở hàm gốc.

Chúc ban học Core Java thật "cuốn" và chắc gốc xây nhà vững nha! Máy móc có thể chạy sai nhưng kiến thức Core thì luôn chuẩn mực! 🚀
