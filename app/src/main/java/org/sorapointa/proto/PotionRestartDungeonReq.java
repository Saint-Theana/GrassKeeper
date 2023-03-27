package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PotionRestartDungeonReq {
    public enum PotionRestartDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8104) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

}
