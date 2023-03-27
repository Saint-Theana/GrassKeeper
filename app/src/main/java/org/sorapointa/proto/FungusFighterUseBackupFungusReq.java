package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterUseBackupFungusReq {
    public enum MBJBDMEMKOF {
        @Tag(tag=0) None ,
        @Tag(tag=22618) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public List<Integer> backupFungusIdList = new ArrayList<>();
}
