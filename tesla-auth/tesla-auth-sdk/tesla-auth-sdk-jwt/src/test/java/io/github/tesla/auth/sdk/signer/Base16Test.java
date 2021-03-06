/*
  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
  the License. You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
  specific language governing permissions and limitations under the License.

  Copyright 2016 the original author or authors.
 */
package io.github.tesla.auth.sdk.signer;

import org.junit.Test;
import io.github.tesla.auth.sdk.signer.hash.Base16;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Richard Lucas
 */
public class Base16Test {

    @Test
    public void shouldEncodeUTF8String() throws Exception {
        String data = "0123456abcdef23abc";
        assertThat(Base16.encode(data))
                .isEqualTo("303132333435366162636465663233616263");
    }

    @Test
    public void shouldEncodeBytes() throws Exception {
        byte[] data = "0123456abcdef23abc".getBytes("UTF-8");
        assertThat(Base16.encode(data))
                .isEqualTo("303132333435366162636465663233616263");
    }
}