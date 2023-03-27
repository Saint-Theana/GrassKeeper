package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChangeAvatarReq {
    public enum ChangeAvatarReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1649) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Long guid = null;
    @Tag(tag=10) public Boolean isMove = null;
    @Tag(tag=3) public Vector movePos = null;
    @Tag(tag=5) public Integer skillId = null;
}
