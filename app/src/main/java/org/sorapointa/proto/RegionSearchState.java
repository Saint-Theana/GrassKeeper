package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum RegionSearchState {
        @Tag(tag=0) RegionSearchNone ,
        @Tag(tag=1) RegionSearchUnstarted ,
        @Tag(tag=2) RegionSearchStarted ,
        @Tag(tag=3) RegionSearchWaitReward ,
        @Tag(tag=4) RegionSearchFinished ;
}
