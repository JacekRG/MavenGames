//package org.games.lotto;
//
//import org.games.LottoConfiguration;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.IsEqual.equalTo;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//class NumbersGeneratorTest {
//    private NumbersGenerator testLuckyNumbers;
//
//    @BeforeEach
//    void generateLuckyNumbers() {
//        testLuckyNumbers = new NumbersGenerator(configuration);
//    }
//
//    @Test
//    void checkIfGeneratorIsWorking() {
//        assertFalse(testLuckyNumbers.generateNumbers().isEmpty());
//    }
//
//    @Test
//    void
//    checkIfGeneratorGeneratesAmountOfNumbersConsistentWithGivenParameter() {
//        assertThat(testLuckyNumbers.generateNumbers().size(), equalTo(LottoConfiguration.getLotterySize()));
//    }
//}
