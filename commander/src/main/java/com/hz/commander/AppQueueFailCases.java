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
package com.hz.commander;

import com.hz.commander.employeehandle.EmployeeDatabase;
import com.hz.commander.employeehandle.EmployeeHandle;
import com.hz.commander.exceptions.DatabaseUnavailableException;
import com.hz.commander.exceptions.ItemUnavailableException;
import com.hz.commander.messagingservice.MessagingDatabase;
import com.hz.commander.messagingservice.MessagingService;
import com.hz.commander.paymentservice.PaymentDatabase;
import com.hz.commander.paymentservice.PaymentService;
import com.hz.commander.queue.QueueDatabase;
import com.hz.commander.shippingservice.ShippingDatabase;
import com.hz.commander.shippingservice.ShippingService;

/**
 * AppQueueFailCases class looks at possible cases when Queue Database is available/unavailable.
 */

public class AppQueueFailCases {
  private final int numOfRetries = 3;
  private final long retryDuration = 30000;
  private final long queueTime = 240000; //4 mins
  private final long queueTaskTime = 60000; //1 min
  private final long paymentTime = 120000; //2 mins
  private final long messageTime = 150000; //2.5 mins
  private final long employeeTime = 240000; //4 mins

  void queuePaymentTaskDatabaseUnavailableCase() throws Exception {
    var ps = new PaymentService(new PaymentDatabase(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException());
    var ss = new ShippingService(new ShippingDatabase());
    var ms = new MessagingService(new MessagingDatabase());
    var eh = new EmployeeHandle(new EmployeeDatabase());
    var qdb =
        new QueueDatabase(new DatabaseUnavailableException(), new DatabaseUnavailableException(),
            new DatabaseUnavailableException(), new DatabaseUnavailableException(),
            new DatabaseUnavailableException(), new DatabaseUnavailableException());
    var c = new Commander(eh, ps, ss, ms, qdb, numOfRetries, retryDuration,
        queueTime, queueTaskTime, paymentTime, messageTime, employeeTime);
    var user = new User("Jim", "ABCD");
    var order = new Order(user, "book", 10f);
    c.placeOrder(order);
  }

  void queueMessageTaskDatabaseUnavailableCase() throws Exception {
    var ps = new PaymentService(new PaymentDatabase());
    var ss = new ShippingService(new ShippingDatabase());
    var ms = new MessagingService(new MessagingDatabase(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException());
    var eh = new EmployeeHandle(new EmployeeDatabase());
    var qdb =
        new QueueDatabase(new DatabaseUnavailableException(), new DatabaseUnavailableException(),
            new DatabaseUnavailableException(), new DatabaseUnavailableException(),
            new DatabaseUnavailableException(), new DatabaseUnavailableException());
    var c = new Commander(eh, ps, ss, ms, qdb, numOfRetries, retryDuration,
        queueTime, queueTaskTime, paymentTime, messageTime, employeeTime);
    var user = new User("Jim", "ABCD");
    var order = new Order(user, "book", 10f);
    c.placeOrder(order);
  }

  void queueEmployeeDbTaskDatabaseUnavailableCase() throws Exception {
    var ps = new PaymentService(new PaymentDatabase());
    var ss = new ShippingService(new ShippingDatabase(), new ItemUnavailableException());
    var ms = new MessagingService(new MessagingDatabase());
    var eh = new EmployeeHandle(new EmployeeDatabase(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException());
    var qdb =
        new QueueDatabase(new DatabaseUnavailableException(), new DatabaseUnavailableException(),
            new DatabaseUnavailableException(), new DatabaseUnavailableException(),
            new DatabaseUnavailableException(), new DatabaseUnavailableException(),
            new DatabaseUnavailableException(), new DatabaseUnavailableException(),
            new DatabaseUnavailableException(), new DatabaseUnavailableException(),
            new DatabaseUnavailableException(), new DatabaseUnavailableException());
    var c = new Commander(eh, ps, ss, ms, qdb, numOfRetries, retryDuration,
        queueTime, queueTaskTime, paymentTime, messageTime, employeeTime);
    var user = new User("Jim", "ABCD");
    var order = new Order(user, "book", 10f);
    c.placeOrder(order);
  }

  void queueSuccessCase() throws Exception {
    var ps = new PaymentService(new PaymentDatabase(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException(), new DatabaseUnavailableException(),
        new DatabaseUnavailableException());
    var ss = new ShippingService(new ShippingDatabase());
    var ms =
        new MessagingService(new MessagingDatabase(), new DatabaseUnavailableException(),
            new DatabaseUnavailableException());
    var eh = new EmployeeHandle(new EmployeeDatabase());
    var qdb =
        new QueueDatabase(new DatabaseUnavailableException(), new DatabaseUnavailableException());
    var c = new Commander(eh, ps, ss, ms, qdb, numOfRetries, retryDuration,
        queueTime, queueTaskTime, paymentTime, messageTime, employeeTime);
    var user = new User("Jim", "ABCD");
    var order = new Order(user, "book", 10f);
    c.placeOrder(order);
  }

  /**
   * Program entry point.
   *
   * @param args command line args
   */

  public static void main(String[] args) throws Exception {
    var aqfc = new AppQueueFailCases();
    //aqfc.queuePaymentTaskDatabaseUnavailableCase();
    //aqfc.queueMessageTaskDatabaseUnavailableCase();
    //aqfc.queueEmployeeDbTaskDatabaseUnavailableCase();
    aqfc.queueSuccessCase();
  }
}
