package io.github.aggie.data.source;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RandomNumberJavaGeneratorTest {

    @Test
    public void dataGenerate() {
        // given
        RandomNumberJava randomJavaGenerator = new RandomNumberJava();

        // when
        Integer random = randomJavaGenerator.dataGenerate();

        // then
        assertNotNull(random);
    }
}
