package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CrystalLinkRestartDungeonReq {
    public enum CrystalLinkRestartDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8056) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

}
