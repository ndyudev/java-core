# 📌 Java I/O Streams – File Handling & Object Serialization

## 📖 Giới thiệu

Project này tập trung vào việc tìm hiểu và thực hành **Input/Output Streams trong Java**, bao gồm:

- 📄 Đọc/ghi file văn bản
- 🔁 Làm việc với luồng byte & ký tự
- 📦 Lưu và khôi phục object bằng Object Stream
- ⚠️ Xử lý Exception khi thao tác file

👉 Đây là nền tảng quan trọng cho:

- File System
- Database
- Network Programming

---

## 🧠 Kiến thức chính

### 1. Input & Output Streams

#### 🔹 InputStream
Dùng để **đọc dữ liệu** từ nguồn (file, keyboard, network,...)

#### 🔹 OutputStream
Dùng để **ghi dữ liệu** từ chương trình ra ngoài

#### 🔹 Đặc điểm
- Dữ liệu được xử lý theo dạng **stream (luồng)**
- Không thao tác trực tiếp với file → thông qua stream

---

### 2. Phân loại Stream

#### ⚡ Byte Stream (dữ liệu nhị phân)

- `InputStream`
- `OutputStream`

**Ví dụ:**
```java
FileInputStream fis = new FileInputStream("input.txt");
FileOutputStream fos = new FileOutputStream("output.txt");