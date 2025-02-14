# EXERCICIS OOP-SOLID
Enunciats detallats on s'apliquen un o més principis SOLID. Els enunciats estan dissenyats per tal que puguis imaginar fàcilment el diagrama de classes i aplicar els principis SOLID de manera pràctica.

Recorda sempre aquests punts:
> 1. Cada classe té una única responsabilitat, delegant tasques adequadament.
> 2. Has utilitzat herència o interfícies per permetre l'extensió de la classe sense modificar el seu codi original.
> 3. Les subclasses implementen els seus mètodes i cap llença errors o retorna nuls per incoherència de sentit de la funcionalitat.
> 4. Tota classe està oberta a extensió, però tancada a modificació.
> 5. Les interfícies no inclouen mètodes innecessaris.
> 6. Les dependències entre classes que poden "canviar" es fan per interfícies.

---

### 1. Tens una classe anomenada `Employee` que gestiona tant les dades personals com el càlcul del salari dels empleats. La classe també inclou un mètode per generar un informe amb el resum del salari i els beneficis. Refactoritza aquesta classe .  

   Crea les següents classes:
   - **Employee**: Contindrà únicament les dades personals (nom, lloc de treball, etc.).
   - **SalaryCalculator**: S'encarregarà de calcular el salari d'un empleat basat en el seu lloc de treball i hores treballades.
   - **ReportGenerator**: S'encarregarà de generar l'informe de salari per a l'empleat.

---

### 2. Estàs desenvolupant un sistema de càlcul d'impostos per a diferents tipus de productes. Actualment, la classe `TaxCalculator` té un mètode `calculateTax` que aplica un càlcul fix a tots els productes. Però, la legislació canvia i has d'incorporar nous tipus d'impostos segons el tipus de producte (per exemple, llibres, aliments i electrònics).  

   Crea les següents classes:
   - **Product**: Contindrà atributs com el nom i el preu.
   - **TaxCalculator**: Tindrà un mètode `calculateTax(Product product)` que ha de ser capaç de calcular l'impost per a diferents tipus de productes. Aquesta classe ha d'estar oberta a extensió, però tancada a modificació.
   - **ElectronicsTax**, **BooksTax**, **FoodTax**: Classes que implementen la lògica de càlcul d'impostos per a cada tipus de producte.

Permet l'extensió de les classes sense modificar el seu codi original.

---

### 3. Tens una jerarquia de classes on `Employee` és la classe base i `FullTimeEmployee` i `PartTimeEmployee` són subclasses. La classe `Employee` té un mètode `calculateSalary` que, en la subclasse `PartTimeEmployee`, només retorna una fracció del salari. Tanmateix, en utilitzar una instància de `PartTimeEmployee` on s'espera un `Employee`, el programa llença un error.  

   Crea les següents classes:
   - **Employee**: Contindrà el nom i el salari base, i un mètode `calculateSalary()`.
   - **FullTimeEmployee**: Sobrescriurà `calculateSalary()` per calcular el salari complet.
   - **PartTimeEmployee**: Sobrescriurà `calculateSalary()` per calcular el salari proporcional.

---

### 4. Estàs desenvolupant un sistema de gestió per vehicles. La interfície `Vehicle` té mètodes com `start()`, `stop()`, `navigate()` i `fly()`. Tanmateix, un cotxe només necessita els mètodes `start()` i `stop()`, mentre que un avió necessita els mètodes `start()`, `stop()` i `fly()`.  

   Crea les següents interfícies:
   - **IVehicle**: Una interfície comuna amb els mètodes `start()` i `stop()`.
   - **INavigable**: Una interfície amb el mètode `navigate()`.
   - **IFlyable**: Una interfície amb el mètode `fly()`.
   - **Car**: Implementarà només `IVehicle`.
   - **Plane**: Implementarà `IVehicle`, `INavigable`, i `IFlyable`.

---

### 5. Tens una classe `Order` que depèn directament de la classe `ShippingService` per calcular els costos d'enviament i gestionar el procés d'enviament. Aquesta dependència està provocant que la classe `Order` sigui difícil de mantenir i estendre.

   Crea les següents classes:
   - **Order**: Tendrà un mètode `calculateShippingCost()` que dependrà d'una interfície `IShippingService`.
   - **ShippingServiceDHL** i **ShippingServiceFedEx**: Implementaran la interfície `IShippingService` amb la lògica de càlcul de costos i enviament.

Utilitza `Order` i les classes de serveis d'enviament, assegurant que les implementacions puguin canviar sense modificar la classe `Order`.

---

### 6. Tens una classe `Invoice` que calcula i genera la factura d'un client, però aquesta classe també té la responsabilitat d'aplicar descomptes i gestionar promocions. Refactora la classe perquè sigui més fàcil afegir nous tipus de descomptes i promocions sense modificar la classe `Invoice`.  

   Crea les següents classes:
   - **Invoice**: Contindrà els mètodes per afegir productes i generar la factura.
   - **DiscountCalculator**: Implementarà diferents tipus de descomptes (descompte per volum, per temporada, etc.).
   - **Promotion**: Serà una classe base o interfície per aplicar promocions.
   - **DiscountPromotion** i **GiftPromotion**: Implementaran tipus concrets de promocions.

---

### 7. Tens una jerarquia de classes d'`Employee` amb diferents tipus d'empleats (per exemple, `FullTimeEmployee` i `HourlyEmployee`). Els empleats a temps complet reben un salari fix, però els empleats per hores tenen un salari variable basat en les hores treballades. 

   Crea les següents interfícies i classes:
   - **Employee**: Contindrà el nom i un salari base, i un mètode `calculateSalary()`.
   - **FullTimeEmployee**: Implementarà `calculateSalary()` per al càlcul de salari fix.
   - **HourlyEmployee**: Implementarà `calculateSalary()` segons el nombre d'hores treballades.
   - **FreelanceEmployee**: Implementarà una interfície `IFreelance` que gestioni les hores i el pagament per hora.

---

### 8. Tens una classe `OrderManager` que gestiona la creació i l'enviament de comandes, però també realitza el càlcul del total d'una comanda i les validacions. Refactoritza aquesta classe per tal que les responsabilitats estiguin ben separades i perquè sigui fàcil afegir noves validacions o noves formes de calcular el total sense modificar la classe `OrderManager`.

   Crea les següents classes:
   - **Order**: Contindrà informació sobre els productes i el total.
   - **OrderManager**: S'encarregarà de processar la comanda i delegarà el càlcul del total a una classe `TotalCalculator`.
   - **TotalCalculator**: Implementarà un mètode per calcular el total d'una comanda.
   - **OrderValidator**: S'encarregarà de realitzar les validacions de la comanda.

Permet l'extensió sense modificar el codi.

---

### 9. Tens una classe `SystemAlert` que depèn directament de la classe `EmailService` per enviar notificacions per correu electrònic. Refactoritza el sistema.

   Crea les següents classes:
   - **SystemAlert**: Contindrà un mètode `sendAlert()` i dependrà d'una interfície `Notifier`.
   - **Notifier**: Una interfície amb un mètode `send()`.
   - **EmailService**: Implementarà `Notifier` per enviar alertes per correu electrònic.
   - **SMSService**: Implementarà `Notifier` per enviar alertes per missatge de text.

Facilita que es pugui canviar la implementació sense modificar la classe.

---

### 10. Tens una classe `NotificationSystem` que envia notificacions als usuaris. Actualment, la classe té mètodes per enviar notificacions per correu electrònic, SMS i notificacions push. Refactora.

   Crea les següents classes:
   - **Notifier**: Una interfície que tindrà el mètode `sendNotification()`.
   - **EmailNotification**, **SMSNotification**, **PushNotification**: Implementaran la interfície `Notifier` per enviar notificacions a través de diferents canals.
   - **NotificationSystem**: S'encarregarà de gestionar les notificacions, delegant l'enviament a les implementacions de `Notifier`.

---
