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
package com.hz.intercepting.filter;

/**
 * Filters perform certain tasks prior or after execution of request by request handler. In this
 * case, before the request is handled by the target, the request undergoes through each Filter
 * <p>
 * 过滤器在请求之前或之后执行，
 *
 * @author hz
 */
public interface Filter {

    /**
     * 执行订单处理请求
     *
     * @param order 订单
     * @return 执行结果
     */
    String execute(Order order);

    /**
     * 设置下一个过滤器
     *
     * @param filter 过滤器
     */
    void setNext(Filter filter);

    /**
     * 获取下一个过滤器
     *
     * @return 返回过滤器
     */
    Filter getNext();

    /**
     * 获取过滤链中，最后一个过滤器
     *
     * @return 返回过滤器
     */
    Filter getLast();
}
