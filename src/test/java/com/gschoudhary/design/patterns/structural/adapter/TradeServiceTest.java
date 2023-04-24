package com.gschoudhary.design.patterns.structural.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradeServiceTest {
    TradeService tradeService ;
    @BeforeEach
    void setUp() {
        tradeService = new TradeService();
    }

    @Test
    void tradingInDollar() {
        tradeService.trade(new RupeeConvertor(100, CurrencyType.DOLLAR).getRupees());
    }


    @Test
    void tradingInBhat() {
        tradeService.trade(new RupeeConvertor(100, CurrencyType.BHAT).getRupees());
    }
}