REST API BOOKS oleh M Azriel Pazarudin
Dibangun untuk memnuhi test magang PT Javan

System Requirement :
- Jdk 20
- postgresql
- code editor/IDE (visual studio code,eclipse atau intelij)
- postman , thunder client atau sejenisnya

Cara Instalasi
- clone repository ini :
    https://github.com/azrielpazarudin/tes_kerja_javan.git
- Di src/main/resource/application.yaml
    pastikan anda menggunakan koneksi postgre milik anda
    oleh karena itu username dan password nya silahkan untuk disesuaikan. Selain itu padabagian url ,pastikan url nya sesuai dengan lokasi dan nama database yang dipakai (buat databasenya terlebih dahulu,karena postgre tidak support auto generate database)


Cara pemakaian
- Jalankan program berikut dengan command mvn spring-boot:run atau dengan action button pada IDE anda
- Program akan berjalan di port 8081
- Untuk list ENDPOINT ada di package 'controller' file : BooksController.java
- API bisa di check menggunakan Postman,thunder client,atau aplikasi sejenis