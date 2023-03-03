package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DraftInviteFailReason {
        @Tag(tag=0) DRAFT_INVITE_FAIL_REASON_UNKNOWN ,
        @Tag(tag=1) DRAFT_INVITE_FAIL_REASON_ACTIVITY_NOT_OPEN ,
        @Tag(tag=2) DRAFT_INVITE_FAIL_REASON_ACTIVITY_PLAY_NOT_OPEN ,
        @Tag(tag=3) DRAFT_INVITE_FAIL_REASON_SCENE_NOT_MEET ,
        @Tag(tag=4) DRAFT_INVITE_FAIL_REASON_WORLD_NOT_MEET ,
        @Tag(tag=5) DRAFT_INVITE_FAIL_REASON_PLAY_LIMIT_NOT_MEET ;
}
