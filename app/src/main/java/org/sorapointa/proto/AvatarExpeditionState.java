package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AvatarExpeditionState {
        @Tag(tag=0) AVATAR_EXPEDITION_STATE_NONE ,
        @Tag(tag=1) AVATAR_EXPEDITION_STATE_DOING ,
        @Tag(tag=2) AVATAR_EXPEDITION_STATE_FINISH_WAIT_REWARD ,
        @Tag(tag=3) AVATAR_EXPEDITION_STATE_CALLBACK_WAIT_REWARD ,
        @Tag(tag=4) AVATAR_EXPEDITION_STATE_LOCKED ;
}
