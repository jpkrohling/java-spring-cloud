/**
 * Copyright 2017-2018 The OpenTracing Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.opentracing.contrib.spring.cloud.starter.zipkin.sender;

import io.opentracing.contrib.spring.cloud.starter.zipkin.AbstractZipkinTracerSenderSpringTest;
import org.junit.Test;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource(
    properties = {
        "spring.main.banner-mode=off",
        "opentracing.zipkin.enabled=true",
        "opentracing.zipkin.http-sender.url=http://zipkin:1234/api/v2/spans"
    }
)
public class ZipkinTracerWithSenderSetSpringTest extends AbstractZipkinTracerSenderSpringTest {

  @Test
  public void testIfTracerIsZipkinTracer() {
    assertSenderUrl("http://zipkin:1234/api/v2/spans");
  }

}
