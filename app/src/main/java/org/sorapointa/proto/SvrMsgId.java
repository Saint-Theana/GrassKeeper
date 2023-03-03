package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SvrMsgId {
        @Tag(tag=0) SVR_MSG_ID_UNKNOWN ,
        @Tag(tag=1) SVR_MSG_ID_BLOCK_REFRESH_COUNTDOWN ,
        @Tag(tag=2) SVR_MSG_ID_AVATAR_REVIVE_BY_STATUE ,
        @Tag(tag=3) SVR_MSG_ID_DAILY_TASK_REWARD_MAX_NUM ,
        @Tag(tag=4) SVR_MSG_ID_ROUTINE_TYPE_NOT_OPEN ,
        @Tag(tag=5) SVR_MSG_ID_ROUTINE_TYPE_REWARD_MAX_NUM ,
        @Tag(tag=6) SVR_MSG_ID_MECHANICUS_COIN_LIMIT ;
}
