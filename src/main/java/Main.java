public class Main {
    public static void main(String[] args) {
        Game lotek = FactoryGame.createGame(GameType.LOTEK);
        lotek.play();

    }

}


/*

Opis:
Na rozgrzewkę i sprawdzenie jak piszecie kod, proszę napisać aplikację w Javie, która będzie zbiorem kilku mini gier. Pierwszą mini grą, którą zaimplementujemy będzie Lotek. Za jakiś czas dodamy do aplikacji kolejną mini grę i potem kolejną i kolejną. Dlatego warto się zastanowić nad architekturą aplikacji. Podpowiem, że można tutaj skorzystać z interfejsów 🙂
Scenariusz działania mini gry Lotek:
Użytkownik wpisuje 6 liczb.
Następuje losowanie.
Na ekranie wyświetlają się wylosowane liczby i te podane przez użytkownika wraz z informacją czy udało mu się wygrać 🙂
Założenia mini gry Lotek:
W konsoli powinno wyświetlić się 6 losowych liczb z zakresu od 1-99. Niech to będzie najprościej napisana aplikacja, zobaczymy co tam potraficie 😉
Powinni być obsłużone sytuację niedozwolone i użytkownik powinien dostać informacje, że np. podał ujemną liczbę lub liczbę spoza zakresu.



 */