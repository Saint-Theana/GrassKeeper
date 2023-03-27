package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoinCollectChooseSkillRsp {
    public enum PEEIKCNOFNB {
        @Tag(tag=0) None ,
        @Tag(tag=24303) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Integer levelId = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer chooseSkillNo = null;
}
