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
package com.hz.adapter;

/**
 * An adapter helps two incompatible interfaces to work together. This is the real world definition
 * for an adapter. Interfaces may be incompatible but the inner functionality should suit the need.
 * The Adapter design pattern allows otherwise incompatible classes to work together by converting
 * the interface of one class into an interface expected by the clients.
 * <p>
 * 适配器帮助两个不兼容的接口协同工作。
 *
 *
 * <p>There are two variations of the Adapter pattern: The class adapter implements the adaptee's
 * interface whereas the object adapter uses composition to contain the adaptee in the adapter
 * object. This example uses the object adapter approach.
 *
 * <p>The Adapter ({@link FishingBoatAdapter}) converts the interface of the adaptee class ({@link
 * FishingBoat}) into a suitable one expected by the client ({@link RowingBoat}).
 *
 * <p>The story of this implementation is this. <br> Pirates are coming! we need a {@link
 * RowingBoat} to flee! We have a {@link FishingBoat} and our captain. We have no time to make up a
 * new ship! we need to reuse this {@link FishingBoat}. The captain needs a rowing boat which he can
 * operate. The spec is in {@link RowingBoat}. We will use the Adapter pattern to reuse {@link
 * FishingBoat}.
 */

/**
 * 适配器帮助两个不兼容的接口协同工作。接口可能不兼容，但内部功能应符合需要。
 * 适配器设计模式通过将一个类的接口转换为客户端期望的接口，来实现不兼容的类一起工作。
 *
 * <p>Adapter模式有两种变体：类适配器实现适配器的接口，而对象适配器使用组合在适配器对象中包含适配器。此示例使用对象适配器方法。
 *
 * <p>适配器（{@link FishingBoatAdapter}）将被适配器类（{@link FishingBoat}）的接口转换为客户端所期望、合适的接口({@link RowingBoat})。
 *
 * <p>这个实现的故事是这样的。海盗来了！我们需要一艘{@link RowingBoat}逃离！我们有一艘{@link FishingBoat}和我们的船长。
 * 我们没有时间造一艘新船！我们需要重用这个{@link FishingBoat}。船长需要一艘他能操作的划艇。规范位于{@link RowingBoat}中。
 * 我们将使用Adapter模式重用{@link FishingBoat}。
 *
 *  @author hz
 */
public final class App {

    private App() {}

    public static void main(final String[] args) {
        //船长只能操作划艇，但有了适配器，他也能使用渔船
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
