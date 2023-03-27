package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AsterLittleStageState {
        @Tag(tag=0) AsterLittleStageNone ,
        @Tag(tag=1) AsterLittleStageUnstarted ,
        @Tag(tag=2) AsterLittleStageStarted ,
        @Tag(tag=3) AsterLittleStageFinished ;
}
