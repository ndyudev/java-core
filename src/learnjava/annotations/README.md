# 🏷️ Java Core: Custom Annotations (Anotations Tự tạo)

Chào bạn! Dựa vào đoạn code bạn đã viết trong phần này (`RequiresRole.java` và `ExampAnnotation.java`), bạn đang bước vào một mảng cực kỳ mạnh mẽ của Java: **Tự định nghĩa Annotation (Custom Annotations)**.

Dưới đây là bảng tổng hợp "vắt kiệt" những gì bạn cần nắm chắc về Annotation dựa trên code thực hành của bạn!

---

## 🧐 1. Annotation rốt cuộc là gì?
Annotation (chú thích) bản chất là các **siêu dữ liệu (metadata)** đính kèm vào code (Class, Method, Field,...). 
- Nó **chỉ cung cấp thông tin** (dữ liệu mô tả) chứ bản thân nó **không trực tiếp thay đổi logic hoạt động** của đoạn code được đánh dấu. 
- Để Annotation thực sự có tác dụng (như phân quyền, validate,...), ta cần một **công cụ thứ ba (như Reflection API hoặc các Framework như Spring, Hibernate)** đọc các Annotation này vào lúc chạy (Runtime) và xử lý logic tương ứng.

---

## 🛠️ 2. Mổ xẻ cái `@RequiresRole` của bạn

Bạn đã tự tay tạo ra Annotation `RequiresRole` theo cú pháp cực chuẩn: `@interface`. Hãy cùng "đọc vị" từng dòng code của bạn nhé:

### 🎯 @Target (Xác định **NƠI** được phép dùng Annotation)
```java
@Target(ElementType.METHOD)
```
- Dòng này nói cho Java biết: *"Ê, cái `@RequiresRole` này chỉ được đặt trên đầu các hàm (Methods) thôi nhé!"*
- Nếu bạn cố tình đặt nó trên đầu một class hay một biến, Java sẽ báo lỗi đỏ lòm ngay lập tức.
- Bạn có thể đặt nhiều giá trị cùng lúc như: `@Target({ElementType.METHOD, ElementType.TYPE})` (áp dụng cho cả Hàm và Class).

### ⏳ @Retention (Xác định **THỜI ĐIỂM** sống của Annotation)
```java
@Retention(RetentionPolicy.RUNTIME)
```
- Dòng này cực kỳ quan trọng! Nó quyết định vòng đời của Annotation.
- `RetentionPolicy.RUNTIME`: Nói rằng *"Hãy giữ cái Annotation này tồn tại cho đến tận lúc chương trình đang chạy (Runtime)"*. 
- Nếu không có dòng này, hoặc xài `SOURCE`, trình biên dịch sẽ vứt bỏ Annotation khi Build code bnar build ra file `.class`, dẫn đến việc giới hạn phân quyền lúc chạy bị phế! Hầu hết Custom Annotations chúng ta tự viết đều dùng `RUNTIME` để quét bằng Reflection.

### 📝 Thuộc tính (Attribute) của Annotation
```java
String value() default "USER";
```
- Annotation có thể nhận các giá trị truyền vào (như param của hàm).
- Ở đây bạn đặt tên là `value()`. Trong Java, chữ `value` là một cái tên **ma thuật**. Nếu Annotation chỉ có **duy nhất** 1 thuộc tính tên là `value`, khi sử dụng bạn có thể viết ngắn gọn `@RequiresRole("ADMIN")` thay vì phải viết `@RequiresRole(value = "ADMIN")`.
- `default "USER"`: Nghĩa là nếu bạn chỉ ghi `@RequiresRole` mà lười không truyền số má gì cả, nó sẽ tự ngầm hiểu role yêu cầu là `USER`.

---

## 🚀 3. Mở rộng (Bonus để bạn code nốt hàm `main`)

Trong file `ExampAnnotation.java`, bạn đã đánh dấu:
```java
@RequiresRole("ADMIN")
private static void deleteUser() { ... }
```
Nếu bạn thắc mắc: *"Làm sao để lấy được chữ ADMIN kia ra mà check quyền?"*. Bạn sẽ cần dùng đến **Reflection** trong hàm `main()` của bạn. Bạn có thể tự thử nghiệm bằng cách gõ nốt đoạn này vào hàm main để xem "phép thuật" xảy ra nhé:

```java
public static void main(String[] args) throws Exception {
    // 1. Dùng Reflection để lấy mô tả của hàm deleteUser
    Method method = ExampAnnotation.class.getDeclaredMethod("deleteUser");
    
    // 2. Kiểm tra xem hàm này có được dán nhãn @RequiresRole không
    if (method.isAnnotationPresent(RequiresRole.class)) {
        
        // 3. Nếu có, móc cái Annotation đó ra
        RequiresRole annotation = method.getAnnotation(RequiresRole.class);
        
        // 4. In ra để xem có đúng là ADMIN không nào!
        System.out.println("Role cần thiết để xóa user là: " + annotation.value());
        
        // Ở thực tế, team Spring Security sẽ viết thêm 1 đoạn:
        // Nếu role của thằng đang đăng nhập không khớp với annotation.value(),
        // ném ngay lỗi "Mày không được phép vào đây!" =))
    }
}
```

---
**🔥 Chốt lại:** Học Annotation chính là học cách dán nhãn thông minh để nhường phần code logic thực hiện cho một hệ thống ngầm khác (như Reflection tự build, hoặc xài Framework như Spring Boot). Cú pháp của bạn chuẩn không cần chỉnh rồi đó! Tiếp tục bay cao bạn nhé! 🦅
