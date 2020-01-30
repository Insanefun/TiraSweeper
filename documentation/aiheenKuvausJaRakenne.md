### Aiheen määrittely <br />
Miinaharavassa auttava botti.<br />
Botti pyrkii määrittämään turvallisimmat siirrot ja ehdottamaan niitä. Se myös pyrkii tunnistamaan varmasti pelin lopettavat siirrot. 
Tärkein ominaisuus ehkä tunnistaa pelattavissa olevat ruudut, antaa niiden todennäisyyksien mukaan ehdotuksia seuraavasta siirrosta ja päivittää
siirrot kun tillanne muutuu. Jos tunnettu miina asetetaan ruutuun automaattisesti flag, jos algoritmi päättelee että on epätodennäköistä, että
ruudussa on miina annetaan sille vihreä ja jos siirto vaikuttaa epävarmalta punainen. Jos algoritmi päivittää ehdotuksensa jokaisen siirron jälkeen
olisi hyvä että se toimisi kohtuullisessa ajassa. Botin tulisi tarkistaa avaamattomien ruutujen suhde päivittäessään ehdotuksia. Jos ruudun numero on
yhtäsuuri kuin avaamattomien ruutujen määrä tulisi kaikkiin niihin automaattisesti laittaa flag, toisaalta jos numero on yhtäsuuri kun lipulla merkityt
ruudut, ovat muut ruudut turvallisia. Tämä jättäisi punaiset ruudut "vaarallisiksi" oletetuille siirroille, tai ehkäpä siirroille jotka helpottaisivat tulevia
siirtoja (toisaalata tämän hyödyntämien vaatisi että botti tuntee mahdolliset tulokset jotka siirroista seuraisi) ja näin nostaisivat voiton todennäköisyyttä.
Koskaan ei pitäisi olla mahdollista, että jonkin viereisen ruudun vieressä ei ole yhtään ei flagittua miinaa ja samaan aikaan toisen viereisen kaikki miinat on flagittu.
Täten voi botti voi lähes huoletta luottaa, että jos jompikumpi näistä yrityistapauksista tapahtuu voi se toimia kyseisen tapauksen pohjalta.
Jos mitään ehdotuksia ei voida tehdä näiden toimien perusteella voidaan tutkia tutkia peli lautaa suuremassa mittakaavassa. Voi viedä enemmän aikaa. 
Esimerkiksi tilanteesa jossa on vierekkäin 1 2 1

| ■ | ■ | ■ |
|---|---|---|
| 1 | 2 | 1 |

(2 yläpuolella ei voi olla miinaa sillä tällöin jommankumman 1 vieressä olisi 2 miinaa.)

On ihmisen helppo päätellä että kummankin 1 yläpuolella olisi miina. Myös botti pystyy huomaamaan tälläisen seuraussuhteen.
Jos botti tuntee jokaisen numeroidun ruudun voi se yrittää luoda kopion kaikista mahdollisista miinojen sijainneista ja näin tunnistaa
sellaiset ruudut joissa ei voi olla miinoja. Tärkeitä ovat siis ne ne ruudut joitten vieressä on miinoja(surroundingMines() > 0;)
ja joiden kaikkia viereisiä miinoja ei tunneta. Nämä ruudut muodostavat joukon jonka viereiset avatut ruudut ovat botille mielenkiintoisia
sillä ne sisältävät tietoa joukossa olevista miinoista.