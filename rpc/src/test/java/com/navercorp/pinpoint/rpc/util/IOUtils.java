/*
 * Copyright 2017 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.rpc.util;

import com.navercorp.pinpoint.rpc.TestAwaitTaskUtils;
import com.navercorp.pinpoint.rpc.TestAwaitUtils;
import org.junit.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Taejin Koo
 */
public final class IOUtils {

    public static byte[] read(final InputStream inputStream, long waitUnitTime, long maxWaitTime) throws IOException {
        boolean isReceived = TestAwaitUtils.await(new TestAwaitTaskUtils() {
            @Override
            public boolean checkCompleted() {
                try {
                    int availableSize = inputStream.available();
                    return availableSize > 0;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return false;
            }
        }, 100, 1000);

        if (!isReceived) {
            Assert.fail("no available data");
        }

        int availableSize = inputStream.available();
        byte[] payload = new byte[availableSize];
        inputStream.read(payload);
        return payload;
    }

    public static void write(OutputStream outputStream, byte[] payload) throws IOException {
        outputStream.write(payload);
        outputStream.flush();
    }

}