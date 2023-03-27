package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum HideAndSeekStageType {
        @Tag(tag=0) HideAndSeekStagePrepare ,
        @Tag(tag=1) HideAndSeekStagePick ,
        @Tag(tag=2) HideAndSeekStageGame ,
        @Tag(tag=3) HideAndSeekStageHide ,
        @Tag(tag=4) HideAndSeekStageSeek ,
        @Tag(tag=5) HideAndSeekStageSettle ;
}
