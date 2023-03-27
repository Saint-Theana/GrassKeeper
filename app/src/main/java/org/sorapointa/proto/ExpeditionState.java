package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum ExpeditionState {
        @Tag(tag=0) ExpeditionNone ,
        @Tag(tag=1) ExpeditionStarted ,
        @Tag(tag=2) ExpeditionFinished ,
        @Tag(tag=3) ExpeditionRewarded ,
        @Tag(tag=4) ExpeditionLocked ;
}
