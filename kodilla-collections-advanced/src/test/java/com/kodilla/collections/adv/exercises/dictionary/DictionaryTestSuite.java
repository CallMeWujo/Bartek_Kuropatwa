package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DictionaryTestSuite {

    @Test
    public void testAddWord() {

        // Given – w tej sekcji przygotowujemy dane testowe, obiekt do testowania oraz wszystkie inne rzeczy,
        // które muszą zostać przygotowane, zanim nastąpi wywołanie testowanej metody.

        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        // When – w tej sekcji z reguły znajduje się tylko jedna linia – jest to wywołanie metody, którą testuje nasz test.

        dictionary.addWord(polishWord, englishWord);
        // Then – sekcja poświęcona sprawdzeniu, czy testowana klasa zachowała się poprawnie – tutaj zamieszczamy wszystkie asercje.
        assertEquals(1,dictionary.size());
    }
    @Test
    public void testFindEnglishWords() {
        Dictionary dictionary = new Dictionary();
        // given
        dictionary.addWord("stos",new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN,"play"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.NOUN, "play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWord("gra");
        //then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        assertEquals(expectedList, result);
    }

    @Test

    public void testFindEnglishWords_withPartOfSpeech() {
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "take"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWord("brać" , PartOfSpeech.NOUN);
        //then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        assertEquals(expectedList, result);
    }
}