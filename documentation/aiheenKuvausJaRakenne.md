**Aihe:** Toteutetaan yksinkertainen roolipeli jossa p��paino on satunaisesti generoiduilla tapahtumilla ja taisteluilla. Luodaan k�ytt�j�rjestelm� jossa
k�ytt�j�lle annetaan etuk�teen p��tettyj� vaihtoehtoja reagoida tilanteisiin. Tapahtumien kulku selitet��n k�ytt�j�lle teksti muodossa.
Pyrit��n luomaan tapa pelattavan hahmon kehitt�miseen ja tapahtumien satunnaisuuden lis���miseen uudelleen peluun tekemiseksi mielekk��ksi.

**K�ytt�j�t:** Pelaaja
**Pelaajan toiminnot:** 

-Pelin aloitus  <br />
-Valintojen tekeminen  <br />
-Hahmon kehitys <br />


![lopetus kaavio](kaaviot/Peliohi.png) <br />
![aloitus kaavio](kaaviot/pelinaloitus.png) <br />

**Rakennekuvaus** </br>
Luokka Pelaaja luo olion joka pit�� sis�ll��n kaikki k�ytt�j�lle pidemp��n t�rkey�t tiedot, kuten sen kuinka paljon vauriota on k�rsitty ja <br />
kuinka paljon eri ominaisuuksia on kehitetty omaa hahmoa kehitett�ess�. T�rkeit� oliion s�il�tt�vi� muuttujia ovat muunmuassa hp joka kuvaa suurinta mahdollista hp m��r��, <br />
currentHp jonka laskiessa nollaan peli p��ttyy. streight ja agility joita k�ytet��n vihollisia kohdatessa laskemaan tehty vaurio.<br />
My�s pelaaja tilla kuvaavia muuttujia kuten toiminta joka kertoo viimeisen tapahtuman ja alive joka kertoo jos hp laskee allen yhden <br />
sek� level joka kertoo saatuje tasojen m��r�n sek� bonusDefence ja attackBonus jotka muuttavat otettua ja tehty� vauriota. <br />
Oliolla on my�s useita metodeja vihollisten kohtaamista varten jotka laskevat mit� tulee tapahtumaan. <br />
<br />
Taistelu luokka yhdist�� Pelaaja olion ja Mobs olion jolloin ne pystyv�t vaikuttamaan toisiinsa. Sen metodit varmistavat, ett� oikeita komentoja kutsutaan oikeissa tapahtumia. <br />
Mobs oliot pit�v�t sis�ll��n vihollisten t�rke�t ominaisuudet kuten paljonko vauriota se voi ottaa kuinka vahvoja sen hy�kk�ykset ovat <br />
ja kuinka usein se v�ist�� pelaajn tekem�n vaurion tai tekee kaksin kertaisen vaurion pelaajaan <br />
Kohtaamisten sujuvuuden kannalta t�rke� Gauntlet luokka saa tiedot Taistelu luokalta ja varmistaa, ett� logiikka taustalla toimii. <br />