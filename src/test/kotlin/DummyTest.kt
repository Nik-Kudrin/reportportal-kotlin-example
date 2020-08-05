import com.epam.reportportal.junit5.ReportPortalExtension
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.slf4j.LoggerFactory
import java.util.concurrent.atomic.AtomicInteger


/**
 * Unit test for simple App.
 */
@ExtendWith(ReportPortalExtension::class)
class DummyTest {
//	@Before
//	@Throws(InterruptedException::class)
//	fun before() {
//		LOGGER.info("Inside Dummy before " + BEFORE_COUNTER.incrementAndGet())
//		Thread.sleep(100)
//	}

	//	@Test
//	@Throws(IOException::class)
//	fun test1() {
//		LOGGER.info("Inside Dummy test 1")
//		// Report launch log
//		val file = File.createTempFile("rp-test", ".xml")
//		Resources.asByteSource(Resources.getResource("logback.xml")).copyTo(Files.asByteSink(file))
//		var n = 5
//		while (n-- > 0) {
//			LoggingUtils.log(file, "LAUNCH LOG MESSAGE WITH ATTACHMENT")
//		}
//		ReportPortal.emitLaunchLog("LAUNCH LOG MESAGE WITH ATTACHMENT", "error", Date(), file)
//		assertTrue(true)
//	}
//
	@Test
	fun test2() {
//		ReportPortal.emitLaunchLog("LAUNCH LOG MESAGE", "error", Date())

		LOGGER.info("Dummy test 2 started")
	}

	@AfterEach
	@Throws(InterruptedException::class)
	fun after() {
		LOGGER.info("Inside Dummy after " + AFTER_COUNTER.incrementAndGet())
		Thread.sleep(100)
	}

	companion object {
		private val LOGGER = LoggerFactory.getLogger(DummyTest::class.java)
		private val BEFORE_COUNTER = AtomicInteger()
		private val AFTER_COUNTER = AtomicInteger()

//		@BeforeClass
//		@Throws(InterruptedException::class)
//		fun beforeClass() {
//			LOGGER.info("Inside Dummy beforeClass")
//			Thread.sleep(100)
//		}
//
//		@AfterClass
//		@Throws(InterruptedException::class)
//		fun afterClass() {
//			LOGGER.info("Inside Dummy afterClass")
//			Thread.sleep(100)
//		}
	}
}