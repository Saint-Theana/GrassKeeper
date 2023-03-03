package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AsterLittleStageState {
        @Tag(tag=0) ASTER_LITTLE_STAGE_STATE_NONE ,
        @Tag(tag=1) ASTER_LITTLE_STAGE_STATE_UNSTARTED ,
        @Tag(tag=2) ASTER_LITTLE_STAGE_STATE_STARTED ,
        @Tag(tag=3) ASTER_LITTLE_STAGE_STATE_FINISHED ;
}
