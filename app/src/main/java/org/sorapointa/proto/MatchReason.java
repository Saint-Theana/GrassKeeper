package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MatchReason {
        @Tag(tag=0) MatchNone ,
        @Tag(tag=1) MatchFinish ,
        @Tag(tag=2) MatchPlayerCancel ,
        @Tag(tag=3) MatchTimeout ,
        @Tag(tag=4) MatchPlayerConfirm ,
        @Tag(tag=5) MatchFailed ,
        @Tag(tag=6) MatchSystemError ,
        @Tag(tag=7) MatchInterrupted ,
        @Tag(tag=8) MatchMpUnavailable ,
        @Tag(tag=9) MatchConfirmTimeout ;
}
