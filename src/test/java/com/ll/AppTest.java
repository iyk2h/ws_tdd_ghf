package com.ll;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    @DisplayName("스캐너에 키보드가 아닌 문자열을 입력")
    public void t1() {
        Scanner sc = TestUtil.genScanner("안녕");

        String cmd = sc.nextLine().trim();
        assertThat(cmd).isEqualTo("안녕");
    }
}