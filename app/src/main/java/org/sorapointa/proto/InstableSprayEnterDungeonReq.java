package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InstableSprayEnterDungeonReq {
    public enum GIDCKAOEICG {
        @Tag(tag=0) None ,
        @Tag(tag=24659) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer stageId = null;
    @Tag(tag=8) public List<InstableSprayAvatarInfo> avatarInfoList = new ArrayList<>();
    @Tag(tag=1) public Integer difficulty = null;
}
