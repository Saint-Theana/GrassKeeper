package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InvestigationTarget {
    public enum State {
        @Tag(tag=0) STATE_INVALID ,
        @Tag(tag=1) STATE_IN_PROGRESS ,
        @Tag(tag=2) STATE_COMPLETE ,
        @Tag(tag=3) STATE_REWARD_TAKEN ;
    }

    @Tag(tag=15) public Integer questId = null;
    @Tag(tag=2) public State state = null;
    @Tag(tag=8) public Integer progress = null;
    @Tag(tag=7) public Integer totalProgress = null;
    @Tag(tag=3) public Integer investigationId = null;
}
