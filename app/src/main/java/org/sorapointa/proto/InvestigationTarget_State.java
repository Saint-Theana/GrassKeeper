package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum InvestigationTarget_State {
        @Tag(tag=0) Invalid ,
        @Tag(tag=1) InProgress ,
        @Tag(tag=2) Complete ,
        @Tag(tag=3) RewardTaken ;
}
