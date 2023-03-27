package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocenceRaceRestartRsp {
    public enum KALBMOGIAAD {
        @Tag(tag=0) None ,
        @Tag(tag=24627) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer galleryId = null;
}
