package ug.naive.preprocessors;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Maciej Rudnicki on 06/02/2017.
 */
public class RemoveShortenThen3Tokenizer implements Tokenizer {

    @Override
    public String process(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(String::trim)
                .filter(el -> el.length()>3)
                .collect(Collectors.joining(" "));
    }
}
