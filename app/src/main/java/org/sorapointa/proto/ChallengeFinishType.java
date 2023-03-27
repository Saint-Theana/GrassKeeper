package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ChallengeFinishType {
        @Tag(tag=0) None ,
        @Tag(tag=1) Fail ,
        @Tag(tag=2) Succ ,
        @Tag(tag=3) Pause ;
}
