/**
 * Dependency Library
 * - com.vdurmont:emoji-java:5.1.1'
 */
package org.dongikjo.demo;

import org.apache.commons.lang3.StringUtils;

import com.vdurmont.emoji.EmojiParser;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NoEmojiValidator implements ConstraintValidator<NoEmoji, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(value) == true) {
            return true;
        }

        return EmojiParser.parseToAliases(value).equals(value);
    }
}
