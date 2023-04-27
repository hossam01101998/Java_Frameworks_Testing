package hossam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    //OEFENING 4:
    @Test
    void shouldbePalindroom(){
        assertTrue(StringUtils.isPalindrome(("racecar")));
    }

}
