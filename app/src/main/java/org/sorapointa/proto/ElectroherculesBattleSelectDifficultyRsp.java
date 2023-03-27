package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ElectroherculesBattleSelectDifficultyRsp {
    public enum AOIIIGEEGIA {
        @Tag(tag=0) None ,
        @Tag(tag=24683) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer galleryId = null;
    @Tag(tag=1) public Integer diffculty = null;
    @Tag(tag=10) public Integer stageId = null;
}
