
Feature:US10 Doktor Randevulari

Background:Ortak stepler
 Given Doktor url gider
 Given Doktor Kisi ikonuna  tiklar
 And Doktor sigin buttonuna tiklar
 When Doktor rolu ile gecerli username "AcilSifa" girer
 And  Doktor rolu ile gecerli password "161122.d" girer
 And Doktor Sign 'i tiklar
 And My Pages buttonuna tiklar
 And My Appointment buttonuna tiklar
 @ortak
 Scenario: US10_TC01 Doktor zaman dilimlerini ve randevu listesini
 "My Appointments" sekmesinden görebilmelidir
  Then Zaman araligini gorur.
  And Randevu  tarih araligini  belirler
  Then Randevu listesini gorur


 Scenario :US10_TC02 Tarih aralığı max 15 gün belirlenerek Doktor
 "patient id, start date, end date, status" randevu bilgilerini görebilmeli

  And Tarih araligini max onbes gun secer
  Then "ID , Start DateTime , End DateTime , Status " randevu  bilgilerini gorur




 Scenario:US10_TC03 Randevu olmayan bir aralik secildiginde Doktor
 "patient id, start date, end date, status" bilgilerini göremez

 And Randevu olmayan bir aralik girer
 Then Secilen aralikta randevu yoksa "No Appointments found" uyarisini gorur


  Scenario:US10_TC04 Tarih aralığı 15 günden fazla belirlediğinde Doktor
  "patient id, start date, end date, status" randevu bilgileri görememeli

  And Zaman araligini onbes gunden fazla secer
  Then Uyari mesajini alir





