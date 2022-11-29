@ortak
Feature: US10 Doktor Randevulari

 Background: Ortak stepler
  Given Doktor url gider
  Given Doktor Kisi ikonuna  tiklar
  And Doktor sigin buttonuna tiklar
  When Doktor rolu ile gecerli username "AcilSifa" girer
  And  Doktor rolu ile gecerli password "161122.d" girer
  And Doktor Sign 'i tiklar
  And My Pages buttonuna tiklar
  And My Appointment buttonuna tiklar

 @TC01
 Scenario: US10_TC01 Doktor zaman dilimlerini ve randevu listesini
 "My Appointments" sekmesinden gorebilmelidir
  Then Zaman araligini gorur.
  And Randevu  tarih araligini  belirler
  Then Randevu listesini gorur
  And Sayfa kapanir

 @TC02
 Scenario: US10_TC02 Tarih aralığı max 15 gün belirlenerek Doktor
 "patient id, start date, end date, status" randevu bilgilerini gorebilmeli

  And Tarih araligini max onbes gun secer
  Then ID , Start DateTime , End DateTime , Status  randevu  bilgilerini gorur
  And Sayfa kapanir


 @TC03
 Scenario: US10_TC03 Randevu olmayan bir aralik secildiginde Doktor
 "patient id, start date, end date, status" bilgilerini gorulemez

  And Randevu olmayan bir aralik girer
  Then Secilen aralikta randevu yoksa "No Appointments found" uyarisini gorur
  And Sayfa kapanir

 @TC04
 Scenario: US10_TC04 Tarih araligi 15 gunden fazla belirlendiginde Doktor
 "patient id, start date, end date, status" randevu bilgileri gorememeli

  And Zaman araligini onbes gunden fazla secer
  Then Uyari mesajini alir
  And Sayfa kapanir





