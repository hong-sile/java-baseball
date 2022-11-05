package baseball.view;

import java.io.ByteArrayInputStream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InputViewImplTest {
	private static final String RESTART_CODE = "1";
	private static final String END_CODE = "2";
	@Test
	void getRestartOrEndCodeTest_예외입력(){
		InputViewImpl iv = new InputViewImpl();
		ByteArrayInputStream is = new ByteArrayInputStream("test".getBytes());
		System.setIn(is);
		Assertions.assertThatThrownBy(iv::getRestartOrEndCode)
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void getRestartOrEndCodeTest_정상입력(){
		InputViewImpl iv = new InputViewImpl();

		ByteArrayInputStream is = new ByteArrayInputStream(RESTART_CODE.getBytes());
		System.setIn(is);

		Assertions.assertThat(iv.getRestartOrEndCode()).isEqualTo(RESTART_CODE);

		is = new ByteArrayInputStream(END_CODE.getBytes());
		System.setIn(is);

		Assertions.assertThat(iv.getRestartOrEndCode()).isEqualTo(END_CODE);
	}
}