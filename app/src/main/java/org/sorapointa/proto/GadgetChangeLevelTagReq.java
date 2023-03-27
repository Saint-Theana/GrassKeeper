package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetChangeLevelTagReq {
    public enum GadgetChangeLevelTagReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=850) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Integer gadgetEntityId = null;
    @Tag(tag=13) public Integer levelTagId = null;
    @Tag(tag=10) public CustomGadgetTreeInfo combinationInfo = null;
}
