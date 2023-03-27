package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeExchangeWoodRsp {
    public enum LEHHCIKIGDM {
        @Tag(tag=0) None ,
        @Tag(tag=4812) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer woodId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer exchangedCount = null;
    @Tag(tag=5) public Integer woodCount = null;
}
