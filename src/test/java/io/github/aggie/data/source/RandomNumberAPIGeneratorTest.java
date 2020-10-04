package io.github.aggie.data.source;

import io.github.aggie.cfg.ConfigProperties;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RandomNumberAPIGeneratorTest {

    @Test
    public void dataGenerate() {
        // given
        ConfigProperties configProperties = new ConfigProperties();
        RandomNumberAPI randomNumberAPIGenerator = new RandomNumberAPI(configProperties);

        // when
        Integer random = randomNumberAPIGenerator.dataGenerate();

        // then
        assertNotNull(random);
    }
}
