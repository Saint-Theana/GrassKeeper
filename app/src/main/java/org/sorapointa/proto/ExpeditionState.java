package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ExpeditionState {
        @Tag(tag=0) EXPEDITION_STATE_NONE ,
        @Tag(tag=1) EXPEDITION_STATE_STARTED ,
        @Tag(tag=2) EXPEDITION_STATE_FINISHED ,
        @Tag(tag=3) EXPEDITION_STATE_REWARDED ,
        @Tag(tag=4) EXPEDITION_STATE_LOCKED ;
}
