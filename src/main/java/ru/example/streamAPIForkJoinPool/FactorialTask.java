package ru.example.streamAPIForkJoinPool;

import java.util.concurrent.RecursiveTask;

public class FactorialTask extends RecursiveTask<Long> {
    private final int n;

    public FactorialTask(int n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if (n <= 1) {
            return 1L;
        }

        FactorialTask subTask = new FactorialTask(n - 1);
        subTask.fork();

        return n * subTask.join();
    }
}
