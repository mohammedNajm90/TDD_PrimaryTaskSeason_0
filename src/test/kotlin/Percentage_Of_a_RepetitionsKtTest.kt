import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Percentage_Of_a_RepetitionsKtTest {

    @Test
    fun should_ReturnThePercentageOf_a_WhenEnterCorrectList() {
        //given list of strings
        val listOfStrings = mutableListOf<String>("a", "b", "b")
        //when calculate the percentage of “a” repetitions
        val percentageOf_a_ = percentageOf_a_Repetitions(listOfStrings)
        //then check the result
        assertEquals(33.33, percentageOf_a_)
    }
    @Test
    fun should_ReturnThePercentageOf_a_WhenEnterCorrectListNotContain_a_() {
        //given list of strings not contain 'a'
        val listOfStrings = mutableListOf<String>("b", "b", "b")
        //when calculate the percentage of “a” repetitions
        val percentageOf_a_ = percentageOf_a_Repetitions(listOfStrings)
        //then check the result
        assertEquals(0.0, percentageOf_a_)
    }
    @Test
    fun should_ReturnThe_1_0_WhenEnterNotCorrectList() {
        //given list of strings the character not to be either “a” or “b”
        val listOfStrings = mutableListOf<String>("c", "b", "b")
        //when calculate the percentage of “a” repetitions
        val percentageOf_a_ = percentageOf_a_Repetitions(listOfStrings)
        //then check the result
        assertEquals(-1.0, percentageOf_a_)
    }
    @Test
    fun should_ReturnThe_1_0_WhenEnterEmptyList() {
        //given Empty list
        val listOfStrings = mutableListOf<String>()
        //when calculate the percentage of “a” repetitions
        val percentageOf_a_ = percentageOf_a_Repetitions(listOfStrings)
        //then check the result
        assertEquals(-1.0, percentageOf_a_)
    }
    @Test
    fun should_ReturnThe_1_0_WhenEnterStringsNotOneCharacterInList() {
        //given strings not one character in list
        val listOfStrings = mutableListOf<String>("aa", "b", "b")
        //when calculate the percentage of “a” repetitions
        val percentageOf_a_ = percentageOf_a_Repetitions(listOfStrings)
        //then check the result
        assertEquals(-1.0, percentageOf_a_)
    }
}