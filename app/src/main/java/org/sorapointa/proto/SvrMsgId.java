package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SvrMsgId {
        @Tag(tag=0) MSG_UNKNOWN ,
        @Tag(tag=1) MSG_BLOCK_REFRESH_COUNTDOWN ,
        @Tag(tag=2) MSG_AVATAR_REVIVE_BY_STATUE ,
        @Tag(tag=3) MSG_DAILY_TASK_REWARD_MAX_NUM ,
        @Tag(tag=4) MSG_ROUTINE_TYPE_NOT_OPEN ,
        @Tag(tag=5) MSG_ROUTINE_TYPE_REWARD_MAX_NUM ,
        @Tag(tag=6) MSG_MECHANICUS_COIN_LIMIT ;
}
