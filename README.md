# SI_2024_lab2_216149-
Ivan Timchevski 216149 
~[diagram](/c/Users/Ivan/Desktop/SI_2024_lab2_216149-/diagram.png) 
<h1>Ciklomatska kompleksnost </h2>
<p> Ja presmetuvame slednava ravenka:M=E-N+2p = 8 <p>
<h2> Test slucaevi spored Every Branch kriterium, ispolnet vo 4 slucai </h2>
<p> - Prv iskluchok koga allItems = null - Test slucaj [null, "0123", "301", "0.1"] </p>
<p> - Vtor iskuluchok koga getBarcode!=null ili dolzinata na name e 0 </p> 
<p> - Iskluchok koga barcode e razlichno od null <p>
<p> - Iskluchok koga sum <= payment </p>

<h2> Test sluchai spored Multiple Condition kriterium - vo 2 od niv </h2>
<p> - item.getName() == null | item.getName(),length() == 0 <p>
<p> - item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcdoe().charAt(0) == '0'<p>

<h2> Objasnuvanje za napishanite test - units </h2>
<p> - testAllItemsNull test koga all items se null </p>
<p> - getBarcode!=null ili dolzina na name=0 </p>
<p> - Sluchaj koga sum <= payment </p>

<h2> Tests za Every Branch: </h2>
<p> - test za name: null || name.length==0</p>
<p> - test koga item.getPrice()> 300 && item.getDiscount() > &&item.getBarcode().charAt(0) == '0' </p>

