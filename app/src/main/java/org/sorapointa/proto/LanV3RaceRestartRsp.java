package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanV3RaceRestartRsp {
    public enum LMNKAFDDKHB {
        @Tag(tag=0) None ,
        @Tag(tag=21596) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer galleryId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
