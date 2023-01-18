package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {

    @Test
    void sum_메소드는_두_수의_합을_반환해주는_메소드() {
        int num1 = 2;
        int num2 = 3;

        int result = sum(num1, num2);
        int expect = 5;

        Assertions.assertThat(result).isEqualTo(expect);
    }

    int sum(int num1, int num2) {
        return num1 + num2;
    }
}
