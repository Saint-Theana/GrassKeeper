package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ChallengeFinishType {
        @Tag(tag=0) CHALLENGE_FINISH_TYPE_NONE ,
        @Tag(tag=1) CHALLENGE_FINISH_TYPE_FAIL ,
        @Tag(tag=2) CHALLENGE_FINISH_TYPE_SUCC ,
        @Tag(tag=3) CHALLENGE_FINISH_TYPE_PAUSE ;
}
