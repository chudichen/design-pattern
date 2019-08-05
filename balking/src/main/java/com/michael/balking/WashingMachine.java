package com.michael.balking;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author Michael Chu
 * @since 2019-08-05 10:13
 */
@Slf4j
public class WashingMachine {

    private final DelayProvider delayProvider;

    private WashingMachineState washingMachineState;

    public WashingMachine() {
        this((interval, timeUnit, task) -> {
            try {
                Thread.sleep(timeUnit.toMillis(interval));
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            task.run();
        });
    }

    public WashingMachine(DelayProvider delayProvider) {
        this.delayProvider = delayProvider;
        this.washingMachineState = WashingMachineState.ENABLED;
    }

    public void wash() {
        synchronized (this) {
            log.info("{}: Actual machine state: {}", Thread.currentThread().getName(), getWashingMachineState());
            if (washingMachineState == WashingMachineState.WASHING) {
                log.error("ERROR: Cannot wash if the machine has been already washing!");
                return;
            }
            washingMachineState = WashingMachineState.WASHING;
        }
        log.info("{}: Doing the washing", Thread.currentThread().getName());

        this.delayProvider.executeAfterDelay(50, TimeUnit.MICROSECONDS, this::endOfWashing);
    }

    public WashingMachineState getWashingMachineState() {
        return washingMachineState;
    }

    public synchronized void endOfWashing() {
        washingMachineState = WashingMachineState.ENABLED;
        log.info("{}: Washing completed.", Thread.currentThread().getId());
    }

}
