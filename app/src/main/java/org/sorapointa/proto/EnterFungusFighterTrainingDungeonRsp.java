package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterFungusFighterTrainingDungeonRsp {
    public enum MIFBOFOBNBC {
        @Tag(tag=0) None ,
        @Tag(tag=21261) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer dungeonId = null;
}
