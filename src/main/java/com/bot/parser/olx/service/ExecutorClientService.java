/*
 * Created by Yurii Salimov, 02.08.2019
 * Copyright (c) 2019 Yurii Salimov
 */
package com.bot.parser.olx.service;

import com.bot.parser.olx.parser.ParseClient;

/**
 * ExecutorClientService
 *
 * @author Yurii Salimov
 * @since 1.0
 */
public interface ExecutorClientService {

    void start(ParseClient<?> client);

    void stop(ParseClient<?> client);

    void restart(ParseClient<?> client);
}
