package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CrystalLinkRestartDungeonRsp {
    public enum CrystalLinkRestartDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8574) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
