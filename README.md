Misty Cake Shop Service เป็น Project ที่สร้างขึ้นมาเพื่อจำลองเว็บไซต์ร้านขายเค้ก เพื่อเพิ่มความสะดวกสบายแก่ผู้ที่ต้องการจะสั่งซื้อเค้ก

สามารถใช้ได้ทั้ง Admin ที่เป็นคนจัดการข้อมูลสินค้าและลูกค้า และ User ที่เป็นลูกค้าให้เข้ามาเลือกซื้อได้ โดยวิธีการรัน คือ

เข้า MySQL ให้สร้าง Schema เปล่าโดยใช้ชื่ออะไรก็ได้ตามที่ต้องการ และเปิดโปรแกรม Cake Runner เข้าไปที่ application.properties 

ในบรรทัด spring.datasource.url=jdbc:mysql://localhost:3306/cake_test คำท้ายสุด(ในที่นี้คือ cake_test) 

สามารถเปลี่ยนเป็นชื่อ Schema ที่เราสร้างเองได้ บรรทัด spring.datasource.password=im1ying2to3 

คำท้ายสุด(ในที่นี้คือ im1ying2to3) เปลี่ยนเป็นรหัสผ่าน MySQL ของ local ของตนเอง เพื่อโปรแกรมจะได้เชื่อมต่อกับ database ได้ 

และ รันโปรแกรมชื่อ cakeAPI และ cakeRunnerWeb ทั้งสองพร้อมกัน หลังจากรันเรียบร้อยแล้ว ให้เข้า browser ใดก็ได้ เช่น Google Chrome 

และพิมพ์ไนช่องใส่ URL ด้านบน ด้วยคำว่า  localhost:8080/home และกด Enter หลังจากนั้นจะปรากฎหน้าแรกของเว็บไซต์ Misty Cake Shop ขึ้นมา
