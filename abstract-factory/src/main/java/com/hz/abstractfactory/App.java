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
package com.hz.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * “工厂”是创建产品(对象)的地方，其目的是将产品的创建与产品的使用分离。
 * 抽象工厂模式的目的，是将若干抽象产品的接口与不同主题产品的具体实现分离开。
 * 这样就能在增加新的具体工厂的时候，不用修改引用抽象工厂的客户端代码
 *
 * <p>抽象工厂模式的本质是工厂接口 ({@link KingdomFactory})
 * 及其具体实现 ( {@link ElfKingdomFactory}, {@link OrcKingdomFactory}). 这个例子使用了这两种具体实现来创建国王、城堡和军队。
 *
 * @author hz
 */
@Slf4j
public class App implements Runnable {

    private final Kingdom kingdom = new Kingdom();

    public Kingdom getKingdom() {
        return kingdom;
    }

    /**
     * 程序入口
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    @Override
    public void run() {
        LOGGER.info("开始创建精灵王国...");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());

        LOGGER.info("开始创建兽人王国...");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());
    }

    /**
     * 创建王国
     *
     * @param kingdomType 要创建的王国类型
     */
    public void createKingdom(final Kingdom.FactoryMaker.KingdomType kingdomType) {
        final KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(kingdomType);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setArmy(kingdomFactory.createArmy());
    }
}