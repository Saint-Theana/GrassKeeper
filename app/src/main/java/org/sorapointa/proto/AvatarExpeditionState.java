package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum AvatarExpeditionState {
        @Tag(tag=0) AvatarExpeditionNone ,
        @Tag(tag=1) AvatarExpeditionDoing ,
        @Tag(tag=2) AvatarExpeditionFinishWaitReward ,
        @Tag(tag=3) AvatarExpeditionCallbackWaitReward ,
        @Tag(tag=4) AvatarExpeditionLocked ;
}
