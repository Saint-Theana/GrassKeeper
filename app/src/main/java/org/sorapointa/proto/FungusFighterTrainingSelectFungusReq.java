package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusFighterTrainingSelectFungusReq {
    public enum EIKEOMNDPJM {
        @Tag(tag=0) None ,
        @Tag(tag=21917) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<Integer> backupFungusIdList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> fightFungusIdList = new ArrayList<>();
}
