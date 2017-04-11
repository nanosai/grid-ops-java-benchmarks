package com.nanosai.gridops.benchmarks;

import com.nanosai.gridops.benchmarks.pojos.SinglePojo;
import com.nanosai.gridops.ion.read.IonObjectReader;
import com.nanosai.gridops.ion.write.IonObjectWriter;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

public class MyBenchmark {



    @State(Scope.Thread)
    public static class PojoState {
        SinglePojo      pojo      = new SinglePojo();

        IonObjectWriter objWriter1_1  = new IonObjectWriter(SinglePojo.class);
        IonObjectReader objReader1_1  = new IonObjectReader(SinglePojo.class);


        byte[] dest1_1        = new byte[10 * 1024];
        int    dest1_1Length  = 0;


        @Setup(Level.Trial)
        public void doSetup() {

        }
    }

    @Benchmark @BenchmarkMode(Mode.Throughput) @OutputTimeUnit(TimeUnit.SECONDS)
    public void ionObjectWriterSinglePojo(PojoState pojoState, Blackhole blackhole) {
        // This is a demo/sample template for building your JMH benchmarks. Edit as needed.
        // Put your benchmark code here.

        pojoState.objWriter1_1.writeObject(pojoState.pojo, 2, pojoState.dest1_1, 0);

        blackhole.consume(pojoState);
    }

}