package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DraftInviteFailReason {
        @Tag(tag=0) DraftFailUnknown ,
        @Tag(tag=1) DraftActivityNotOpen ,
        @Tag(tag=2) DraftActivityPlayNotOpen ,
        @Tag(tag=3) DraftSceneNotMeet ,
        @Tag(tag=4) DraftWorldNotMeet ,
        @Tag(tag=5) DraftPlayLimitNotMeet ;
}
