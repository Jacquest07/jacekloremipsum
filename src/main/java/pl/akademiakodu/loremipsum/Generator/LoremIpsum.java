package pl.akademiakodu.loremipsum.Generator;

/**
 * Created by Eriot on 2017-09-01.
 */
public interface LoremIpsum
{
    String generateParagraphs(int number);
    String generateSentences(int number);
    String generateWords(int number);
}
