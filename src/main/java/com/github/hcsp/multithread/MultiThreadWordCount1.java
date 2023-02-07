package com.github.hcsp.multithread;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class MultiThreadWordCount1 {

    // 使用threadNum个线程，并发统计文件中各单词的数量
    public static Map<String, Integer> count(int threadNum, List<File> files) throws IOException, ExecutionException, InterruptedException {
        WordCount wordCount = new WordCount(threadNum);
        return wordCount.filesCount(files);
    }
}


