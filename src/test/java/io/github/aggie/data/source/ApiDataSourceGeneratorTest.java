package io.github.aggie.data.source;

import io.github.aggie.cfg.ConfigProperties;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApiDataSourceGeneratorTest {

    @Test
    public void dataGenerate() {
        // given
        ConfigProperties configProperties = new ConfigProperties();
        ApiDataSource apiDataSourceGenerator = new ApiDataSource(configProperties);

        // when
        Integer random = apiDataSourceGenerator.dataGenerate();

        // then
        assertNotNull(random);
    }
}
