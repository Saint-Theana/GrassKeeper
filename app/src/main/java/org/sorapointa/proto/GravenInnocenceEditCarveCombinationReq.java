package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocenceEditCarveCombinationReq {
    public enum OGPPNOHCCAM {
        @Tag(tag=0) None ,
        @Tag(tag=23125) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public CustomGadgetTreeInfo combinationInfo = null;
    @Tag(tag=5) public Integer entityId = null;
}
