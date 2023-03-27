package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum Investigation_State {
        @Tag(tag=0) InvestigationStateInvalid ,
        @Tag(tag=1) InvestigationStateInProgress ,
        @Tag(tag=2) InvestigationStateComplete ,
        @Tag(tag=3) InvestigationStateRewardTaken ;
}
