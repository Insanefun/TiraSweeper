###Aiheen määrittely <br />
Miinaharavassa auttava botti.<br />
Botti pyrkii määrittämään turvallisimmat siirrot ja ehdottamaan niitä. Se myös pyrkii tunnistamaan varmasti pelin lopettavat siirrot. 
Tärkein ominaisuus ehkä tunnistaa pelattavissa olevat ruudut, antaa niiden todennäisyyksien mukaan ehdotuksia seuraavasta siirrosta ja päivittää
siirrot kun tillanne muutuu. Jos tunnettu miina asetetaan ruutuun automaattisesti flag, jos algoritmi päättelee että on epätodennäköistä, että
ruudussa on miina annetaan sille vihreä ja jos siirto vaikuttaa epävarmalta punainen. Jos algoritmi päivittää ehdotuksensa jokaisen siirron jälkeen
olisi hyvä että se toimisi kohtuullisessa ajassa. Botin tulisi tarkistaa avaamattomien ruutujen suhde päivittäessään ehdotuksia. Jos ruudun numero on
yhtäsuuri kuin avaamattomien ruutujen määrä tulisi kaikkiin niihin automaattisesti laittaa flag, toisaalta jos numero on yhtäsuuri kun lipulla merkityt
ruudut, ovat muut ruudut turvallisia. Tämä jättäisi punaiset ruudut "vaarallisiksi" oletetuille siirroille, tai ehkäpä siirroille jotka helpottaisivat tulevia
siirtoja (toisaalata tämän hyödyntämien vaatisi että botti tuntee mahdolliset tulokset jotka siirroista seuraisi) ja näin nostaisivat voiton todennäköisyyttä.
