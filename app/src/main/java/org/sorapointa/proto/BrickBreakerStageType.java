package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum BrickBreakerStageType {
        @Tag(tag=0) BrickBreakerStagePrepare ,
        @Tag(tag=1) BrickBreakerStagePick ,
        @Tag(tag=2) BrickBreakerStageGame ,
        @Tag(tag=3) BrickBreakerStagePlay ,
        @Tag(tag=4) BrickBreakerStageSettle ;
}
