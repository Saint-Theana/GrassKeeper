package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoinCollectInfo.*;
import org.sorapointa.proto.CoinCollectInfo;

public class CoinCollectPrepareStageNotify {
    public enum JFIJKJFNDGB {
        @Tag(tag=0) None ,
        @Tag(tag=6441) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public CoinCollectInfo coinCollectInfo = null;
}
