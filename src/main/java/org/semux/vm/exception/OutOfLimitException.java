/**
 * Copyright (c) 2017 The Semux Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.semux.vm.exception;

public class OutOfLimitException extends VMException {

    private static final long serialVersionUID = 1L;

    public OutOfLimitException() {
        super("Out of gas");
    }
}
