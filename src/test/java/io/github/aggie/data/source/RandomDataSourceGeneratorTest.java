package io.github.aggie.data.source;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RandomDataSourceGeneratorTest {

    @Test
    public void dataGenerate() {
        // given
        RandomDataSource randomJavaGenerator = new RandomDataSource();

        // when
        Integer random = randomJavaGenerator.dataGenerate();

        // then
        assertNotNull(random);
    }
}
