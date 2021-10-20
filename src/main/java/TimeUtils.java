import java.time.Duration;
import java.time.Instant;

public class TimeUtils {

	public Instant onStart() {
		return Instant.now();
	}

	public Instant onEnd() {
		return Instant.now();
	}

	public long delta(Instant start, Instant end) {
		return Duration.between(start, end).toNanos();
	}
}
