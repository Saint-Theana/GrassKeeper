package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoopReward {
    public enum State {
        @Tag(tag=0) STATE_UNLOCK ,
        @Tag(tag=1) STATE_LOCK ,
        @Tag(tag=2) STATE_TAKEN ;
    }

    @Tag(tag=5) public Integer id = null;
    @Tag(tag=6) public State state = null;
}
