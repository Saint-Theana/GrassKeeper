package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DebugNotify {
    public enum Retcode {
        @Tag(tag=0) RETCODE_SUCC ,
        @Tag(tag=1) RETCODE_FAIL ;
    }

    @Tag(tag=1) public Integer id = null;
    @Tag(tag=2) public String name = null;
    @Tag(tag=3) public Retcode retcode = null;
}
