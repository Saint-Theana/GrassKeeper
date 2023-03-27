package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InstableSpraySwitchTeamRsp {
    public enum AFDJAOMJLNB {
        @Tag(tag=0) None ,
        @Tag(tag=20452) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer levelId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
