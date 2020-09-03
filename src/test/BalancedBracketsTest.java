package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void wordsInBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void wordsAfterBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void missingRightBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void missingLeftBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
    @Test
    public void oppositeBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void wordsInMultipleBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Laun[chCo]de]"));
    }
    @Test
    public void missingOneRightBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
    }
    @Test
    public void missingOneLeftBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
    }
    @Test
    public void setOfoppositeBrackets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("La[un]ch]Code["));
    }
    @Test
    public void specialCharsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("L![un{}]@@]}{Co^$e["));
    }
    @Test
    public void specialCharsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[L())()u!@$#n[c&*:{}o]de]"));
    }


}
/**
 * The function BalancedBrackets should return true if and only if
 * the input string has a set of "balanced" brackets.
 *
 * That is, whether it consists entirely of pairs of opening/closing
 * brackets (in that order), none of which mis-nest. We consider a bracket
 * to be square-brackets: [ or ].
 *
 * The string may contain non-bracket characters as well.
 *
 * These strings have balanced brackets:
 *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
 *
 * While these do not:
 *   "[LaunchCode", "Launch]Code[", "[", "]["
 *
 * @param str - to be validated
 * @return true if balanced, false otherwise
 */