package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoopPoint {
    public enum State {
        @Tag(tag=0) STATE_UNSTARTED ,
        @Tag(tag=1) STATE_STARTED ,
        @Tag(tag=2) STATE_FINISHED ;
    }

    @Tag(tag=15) public Integer selfConfidence = null;
    @Tag(tag=10) public State state = null;
    @Tag(tag=14) public Integer id = null;
}
