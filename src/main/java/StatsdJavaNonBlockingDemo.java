
import com.timgroup.statsd.StatsDClient;
import com.timgroup.statsd.NonBlockingStatsDClient;

public class StatsdJavaNonBlockingDemo {
	public static final void main(String[] args) {
		final StatsDClient statsd = new NonBlockingStatsDClient("my.prefix", "localhost", 8125);

		statsd.incrementCounter("bar");
		statsd.recordGaugeValue("baz", 100);
		statsd.recordExecutionTime("bag", 25);
		statsd.recordSetEvent("qux", "one");
	}
}