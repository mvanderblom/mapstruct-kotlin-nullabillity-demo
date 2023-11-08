package dev.vanderblom.mapstruct.kotlinnullabillitydemo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinNullabillityDemoApplicationTests {

	@Autowired
	private lateinit var mapper: SourceToTargetMapper

	@Test
	fun `map nullable source field to non nullable target`() {
		val source = Source(id = 1, name = null)
		mapper.map(source) // java.lang.NullPointerException: Parameter specified as non-null is null: method dev.vanderblom.mapstruct.kotlinnullabillitydemo.Target.<init>, parameter name
	}

}
