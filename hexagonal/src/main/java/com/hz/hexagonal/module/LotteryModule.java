/*
 * This project is licensed under the MIT license. Module model-view-viewmodel is using ZK framework licensed under LGPL (see lgpl-3.0.txt).
 *
 * The MIT License
 * Copyright © 2014-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.hz.hexagonal.module;

import com.google.inject.AbstractModule;
import com.hz.hexagonal.banking.MongoBank;
import com.hz.hexagonal.banking.WireTransfers;
import com.hz.hexagonal.database.LotteryTicketRepository;
import com.hz.hexagonal.database.MongoTicketRepository;
import com.hz.hexagonal.eventlog.LotteryEventLog;
import com.hz.hexagonal.eventlog.MongoEventLog;

/**
 * Guice module for binding production dependencies.
 */
public class LotteryModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(LotteryTicketRepository.class).to(MongoTicketRepository.class);
    bind(LotteryEventLog.class).to(MongoEventLog.class);
    bind(WireTransfers.class).to(MongoBank.class);
  }
}